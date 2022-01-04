package view;

import controller.CCircle;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.MShape;

public class VDialog {
private Stage primaryStage;
private String shapeType;
private Group mainRoot;
private MShape oldMShape;

	public VDialog(Stage primaryStage, MShape oldMShape, Group mainRoot) {
		this.primaryStage = primaryStage;
        String className = oldMShape.getClass().getName();
        shapeType = className.substring(className.lastIndexOf(".") + 2);
		this.mainRoot = mainRoot;
		this.oldMShape = oldMShape;
	}

	public Stage modalWindow() {
        Stage secondStage = new Stage();
        secondStage.setTitle("Bitte geben Sie die neuen Werte für " + shapeType + " ein:");
        GridPane root = new GridPane();
        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(8, 8, 8, 8));
        if (shapeType.equals("Circle")) {
            Label l = new Label("Radius: ");
            root.add(l, 1, 1);
            TextField inputC = new TextField();
            root.add(inputC, 2, 1);
            Button submit = new Button("Kreis ändern");
            
            submit.setOnAction(new CCircle(
                    inputC, 
                    mainRoot, 
                    secondStage, 
                    primaryStage, 
                    oldMShape
                    ));
            root.add(submit, 1, 2);
        } else {

		return null;
        }
        
        secondStage.initModality(Modality.WINDOW_MODAL);
        secondStage.initOwner(primaryStage);
        secondStage.setScene(new Scene(root, 400, 150));
        return secondStage;
	}

}
