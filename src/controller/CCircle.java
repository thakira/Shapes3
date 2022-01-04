package controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.MShape;

public class CCircle implements EventHandler<ActionEvent> {
private TextField inputC;
private Group mainRoot;
private Stage secondStage;
private Stage primaryStage;
private MShape oldMShape;
	public CCircle(TextField inputC, Group mainRoot, Stage secondStage, Stage primaryStage, MShape oldMShape) {
		this.inputC = inputC;
		this.mainRoot = mainRoot;
		this.secondStage = secondStage;
		this.primaryStage = primaryStage;
		this.oldMShape = oldMShape;
	}

	@Override
	public void handle(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
