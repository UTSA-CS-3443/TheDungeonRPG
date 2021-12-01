package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.model.Battle;
import application.model.Dungeon;
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

public class BattleController implements EventHandler<ActionEvent>, Initializable {

	@FXML
	private TextField playerName;
	@FXML
	private TextField playerLevel;
	@FXML
	private TextField playerHP;

	@FXML
	private TextField enemyName;
	@FXML
	private TextField enemyLevel;
	@FXML
	private TextField enemyHP;

	@FXML
	private Button attackButton;
	@FXML
	private Button runButton;
	@FXML
	private Button itemsButton;

	@FXML
	void attackPressed(ActionEvent event) {

		// Make sure monster and player are not dead.
		if ((Main.monster.getCurrHealth() > 0) && (Main.playerChar.getCurrHealth() > 0)) {
			Battle.attack(Main.playerChar, Main.monster);
			playerHP.setText(String.valueOf(Main.playerChar.getCurrHealth()));
			enemyHP.setText(String.valueOf(Main.monster.getCurrHealth()));
		}

		// Monster is dead
		if ((Main.monster.getCurrHealth() <= 0)) {
			try {
				//Level Up
				Main.playerChar.setLevel(Main.playerChar.getLevel() + 1);
				Main.playerChar.setStr(Main.playerChar.getStr() +2 );
				Main.playerChar.setDex(Main.playerChar.getDex() +2 );
				Main.playerChar.setDef(Main.playerChar.getDef() +2 );
				Main.playerChar.setSpd(Main.playerChar.getSpd() +2 );
				Main.playerChar.setCurrHealth(Main.playerChar.getCurrHealth() +5 );
				Main.playerChar.setMaxHealth(Main.playerChar.getMaxHealth() +5 );
				
				//Set Monster to Defeated (Allows ability to go to next room) and return to room.
				Dungeon.monsterDefeated = true;
				Parent root = FXMLLoader.load(getClass().getResource("../view/Room.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - The Dungeon");
				Main.stage.show();
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}

		// Player is dead
		if (Main.playerChar.currHealth <= 0) {
			Main.status = "Defeat";

			try {

				Parent root = FXMLLoader.load(getClass().getResource("../view/End.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - Defeated");
				Main.stage.show();

			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@FXML
	void runPressed(ActionEvent event) {

		// Player loses
		Main.status = "Defeat";

		try {

			Parent root = FXMLLoader.load(getClass().getResource("../view/End.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.setTitle("The Dungeon RPG - Defeated");
			Main.stage.show();

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	void itemsPressed(ActionEvent event) {
		
		// Player views inventory
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Inventory.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.setTitle("The Dungeon RPG - Inventory");
			Main.stage.show();

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// Updates the view to show current player information
		playerHP.setText(String.valueOf(Main.playerChar.getCurrHealth()));
		playerName.setText(Main.playerChar.getName());
		playerLevel.setText(String.valueOf(Main.playerChar.level));

		// Updates the view to show current monster information
		switch (Dungeon.curMonster) {

		case "Skeleton":
			Main.monster = new Player("Skeleton", "noClass", 5, 5, 1, 5, 5, 5, 5, 5, null);
			enemyLevel.setText(String.valueOf(Main.monster.getLevel()));
			enemyName.setText(Main.monster.getName());
			enemyHP.setText(String.valueOf(Main.monster.getCurrHealth()));
			break;

		case "Giant Spider":
			Main.monster = new Player("Giant Spider", "noClass", 5, 5, 2, 5, 10, 10, 10, 10, null);
			enemyLevel.setText(String.valueOf(Main.monster.getLevel()));
			enemyName.setText(Main.monster.getName());
			enemyHP.setText(String.valueOf(Main.monster.getCurrHealth()));
			break;

		case "Lizard Warrior":
			Main.monster = new Player("Lizard Warrior", "noClass", 5, 5, 3, 5, 13, 13, 13, 13, null);
			enemyLevel.setText(String.valueOf(Main.monster.getLevel()));
			enemyName.setText(Main.monster.getName());
			enemyHP.setText(String.valueOf(Main.monster.getCurrHealth()));
			break;

		case "Water Demon":
			Main.monster = new Player("Water Demon", "noClass", 5, 5, 5, 4, 15, 15, 15, 15, null);
			enemyLevel.setText(String.valueOf(Main.monster.getLevel()));
			enemyName.setText(Main.monster.getName());
			enemyHP.setText(String.valueOf(Main.monster.getCurrHealth()));
			break;

		case "Flame Warrior":
			Main.monster = new Player("Flame Warrior", "noClass", 5, 5, 5, 5, 18, 18, 18, 18, null);
			enemyLevel.setText(String.valueOf(Main.monster.getLevel()));
			enemyName.setText(Main.monster.getName());
			enemyHP.setText(String.valueOf(Main.monster.getCurrHealth()));
			break;

		case "Dragon Knight":
			Main.monster = new Player("Dragon Knight", "noClass", 5, 5, 10, 5, 20, 20, 20, 20, null);
			enemyLevel.setText(String.valueOf(Main.monster.getLevel()));
			enemyName.setText(Main.monster.getName());
			enemyHP.setText(String.valueOf(Main.monster.getCurrHealth()));
			break;

		default:
			break;
		}
	}
}