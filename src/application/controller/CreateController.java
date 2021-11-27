package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class CreateController implements EventHandler<ActionEvent> {

	@FXML private TextField charName;
	@FXML private SplitMenuButton classSelect;
	
	@FXML private Button strengthDec;
	@FXML private Button strengthInc;
	@FXML private Text strengthCount;
	
	@FXML private Button defenseDec;
	@FXML private Button defenseInc;
    @FXML private Text defenseCount;

    @FXML private Button speedDec;
    @FXML private Button speedInc;
    @FXML private Text speedCount;

    @FXML private Button dexterityDec;
    @FXML private Button dexterityInc;
    @FXML private Text dexterityCount;
    
    @FXML private Button submitButton;
    
    @FXML void classSelected(ActionEvent event) {

    }

    @FXML void strengthDecPressed(ActionEvent event) {

    }
    
    @FXML void strengthIncPressed(ActionEvent event) {

    }

    @FXML void defenseDecPressed(ActionEvent event) {

    }
    
    @FXML void defenseIncPressed(ActionEvent event) {

    }

    @FXML void speedDecPressed(ActionEvent event) {

    }
    
    @FXML void speedIncPressed(ActionEvent event) {

    }

    @FXML void dexterityDecPressed(ActionEvent event) {

    }

    @FXML void dexterityIncPressed(ActionEvent event) {

    }
  
    @FXML void submitPressed(ActionEvent event) {
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

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}