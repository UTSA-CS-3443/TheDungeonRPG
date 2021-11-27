package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BattleController implements EventHandler<ActionEvent> {

	@FXML private TextField playerName;
    @FXML private TextField playerLevel;
    @FXML private TextField playerHP;

    @FXML private TextField enemyName;
    @FXML private TextField enemyLevel;
    @FXML private TextField enemyHP;
    
    @FXML private Button attackButton;
    @FXML private Button defendButton;
    @FXML private Button abilityButton;
    @FXML private Button runButton;
    @FXML private Button itemsButton;

    @FXML void attackPressed(ActionEvent event) {

    }

    @FXML void defendPressed(ActionEvent event) {

    }

    @FXML void abilityPressed(ActionEvent event) {

    }

    @FXML void runPressed(ActionEvent event) {
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Room.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.setTitle("The Dungeon RPG - The Dungeon");
			Main.stage.show();
			
		} 
    	
    	catch(Exception e) {
			e.printStackTrace();
		}
    }

    @FXML void itemsPressed(ActionEvent event) {
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Inventory.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.setTitle("The Dungeon RPG - Inventory");
			Main.stage.show();
			
		} 
    	
    	catch(Exception e) {
			e.printStackTrace();
		}
    }

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}