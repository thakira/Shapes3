package controller;

import javafx.scene.Group;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.MShape;
import view.VDialog;

public class CDialog {
	
    /** private field primaryStage. */
    private Stage primaryStage;
    
    /** private field oldMShape. */
    private MShape oldMShape;
    
    /** private field mainRoot. */
    private Group mainRoot;

	public CDialog(Stage primaryStage, MShape s, Group root, Circle circ, Text text) {
		this.primaryStage = primaryStage;
		this.oldMShape = s;
		this.mainRoot = root;
		
		mainRoot.getChildren().removeAll(circ, text);
		showDialog();
	}


	private void showDialog() {
        VDialog dialog = new VDialog(primaryStage, oldMShape, mainRoot);
        Stage s = dialog.modalWindow();
        s.show();
	}
		
}
