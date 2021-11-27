package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class RoomController implements EventHandler<ActionEvent> {

	@FXML private TextArea roomDesc;
	
	@FXML private Button fightButton;    
    @FXML private Button lootButton;
	
	@FXML private Button upButton;
    @FXML private Button leftButton;
    @FXML private Button downButton;
    @FXML private Button rightButton;

    @FXML void fightPressed(ActionEvent event) {
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.setTitle("The Dungeon RPG - FIGHT!");
			Main.stage.show();
			
		} 
    	
    	catch(Exception e) {
			e.printStackTrace();
		}

    }

    @FXML void lootPressed(ActionEvent event) {

    }

    @FXML void upPressed(ActionEvent event) {

    }

    @FXML void leftPressed(ActionEvent event) {

    }
    
    @FXML void downPressed(ActionEvent event) {

    }

    @FXML void rightPressed(ActionEvent event) {

    }

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
}