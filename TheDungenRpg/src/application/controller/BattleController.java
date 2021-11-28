package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.model.Battle;
import application.model.Player;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BattleController implements EventHandler<ActionEvent> ,Initializable{

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
    	if(Player.monster.health>0)
    	Battle.attack(Player.player, Player.monster);
    	//System.out.println(Player.monster.health);
    	//System.out.println(Player.monster.level);
    	String hp=String.valueOf( Player.player.health);
    	playerHP.setText(hp);
    	enemyHP.setText(String.valueOf( Player.monster.health));
    	playerLevel.setText(String.valueOf( Player.player.level));

    }

    @FXML void defendPressed(ActionEvent event) {

    	Battle.defend(Player.player, Player.monster);
    	String hp=String.valueOf( Player.player.health);
    	playerHP.setText(hp);
    	enemyHP.setText(String.valueOf( Player.monster.health));
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

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		String hp=String.valueOf( Player.player.health);
    	playerHP.setText(hp);
    	playerName.setText(Player.player.name);
    	
    	playerLevel.setText(String.valueOf( Player.player.level));
    	enemyLevel.setText(String.valueOf( Player.monster.level));
    	enemyName.setText(Player.monster.name);
    	enemyHP.setText(String.valueOf( Player.monster.health));
	}

}