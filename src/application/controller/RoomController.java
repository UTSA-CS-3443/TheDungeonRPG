package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.model.Dungeon;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class RoomController implements EventHandler<ActionEvent>, Initializable {

	@FXML
	private TextArea roomDesc;
	@FXML
	private Label labelText;

	@FXML
	private Button fightButton;
	@FXML
	private Button lootButton;

	@FXML
	private Button upButton;
	@FXML
	private Button leftButton;
	@FXML
	private Button downButton;
	@FXML
	private Button rightButton;

	@FXML
	
	// Player Choose to Fight
	void fightPressed(ActionEvent event) {
		
		// Check if monster is present or not defeated
		if (Dungeon.curMonster.equals("NULL")) {
			roomDesc.setText("There are no monsters here, you may move on to the next room.");
		}

		else if (Dungeon.monsterDefeated == false) {

			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT!");
				Main.stage.show();

			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

	@FXML
	void upPressed(ActionEvent event) {
		
		// Check if monster has been defeated
		if (Dungeon.monsterDefeated == false)
			roomDesc.setText("You must first pass the trial before moving on!");

		// If monster defeated, set it back to not defeated and loads next room.
		else if (Dungeon.exit.equals("North")) {
			Dungeon.monsterDefeated = false;
			Dungeon.curRoom += 1;
			Dungeon.loadRoom(Dungeon.curRoom);
			roomDesc.setText(Dungeon.getRoomList().get(Dungeon.curRoom - 1).toString());
		}

		// Invalid direction
		else
			roomDesc.setText("There is no path this way, please try another direction.");
	}

	@FXML
	void leftPressed(ActionEvent event) {
		
		// Check if monster has been defeated
		if (Dungeon.monsterDefeated == false)
			roomDesc.setText("You must first pass the trial before moving on!");

		// If monster defeated, set it back to not defeated and loads next room.
		else if (Dungeon.exit.equals("West")) {
			Dungeon.monsterDefeated = false;
			Dungeon.curRoom += 1;
			Dungeon.loadRoom(Dungeon.curRoom);
			roomDesc.setText(Dungeon.getRoomList().get(Dungeon.curRoom - 1).toString());
		}

		// Invalid direction
		else
			roomDesc.setText("There is no path this way, please try another direction.");
	}

	@FXML
	void downPressed(ActionEvent event) {
		
		// If player reaches Final Room, the player goes South to exit Dungeon and Win
		if (Main.status.equals("Victory")) {
			try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/End.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - Victory!");
				Main.stage.show();

			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}

		// Check if monster has been defeated
		if (Dungeon.monsterDefeated == false)
			roomDesc.setText("You must first pass the trial before moving on!");

		// If monster defeated, set it back to not defeated and loads next room.
		else if (Dungeon.exit.equals("South")) {
			Dungeon.monsterDefeated = false;
			Dungeon.curRoom += 1;
			Dungeon.loadRoom(Dungeon.curRoom);
			roomDesc.setText(Dungeon.getRoomList().get(Dungeon.curRoom - 1).toString());
		}

		// Invalid direction
		else
			roomDesc.setText("There is no path this way, please try another direction.");
	}

	@FXML
	void rightPressed(ActionEvent event) {
		
		// Check if monster has been defeated
		if (Dungeon.monsterDefeated == false)
			roomDesc.setText("You must first pass the trial before moving on!");

		// If monster defeated, set it back to not defeated and loads next room.
		else if (Dungeon.exit.equals("East")) {
			Dungeon.monsterDefeated = false;
			Dungeon.curRoom += 1;
			Dungeon.loadRoom(Dungeon.curRoom);
			roomDesc.setText(Dungeon.getRoomList().get(Dungeon.curRoom - 1).toString());
		}

		// Invalid direction
		else
			roomDesc.setText("There is no path this way, please try another direction.");
	}

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Dungeon.loadRoom(Dungeon.curRoom);
		roomDesc.setText(Dungeon.getRoomList().get(Dungeon.curRoom - 1).toString());

		labelText.setVisible(false);
	}
}