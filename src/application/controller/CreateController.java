package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class CreateController implements EventHandler<ActionEvent> {

	@FXML private TextField charName;
	
	@FXML private SplitMenuButton classSelect;
	@FXML private MenuItem warriorItem;
	@FXML private MenuItem hunterItem;
	
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
    
    @FXML private Label labelError;
    
    //FIXME
    //NOTE - not sure why @FXML before each of the methods? Not necessary
    @FXML void classSelected(ActionEvent event) {
    	
    }
    
    public void nameUpdated(KeyEvent event) {
    	System.out.println(charName.getText());
    	
    	Main.playerChar.name = charName.getText();

    }
    
    public void warriorSelected(ActionEvent event) {
    	System.out.println("WARRIOR");
    	classSelect.setText("Warrior");
    	//TODO keep dropdown width the same
    	Main.playerChar.setCharClass("Warrior");

    }
    
    public void hunterSelected(ActionEvent event) {
    	System.out.println("HUNTER");
    	classSelect.setText("Hunter");
    	//TODO keep dropdown width the same
    	Main.playerChar.setCharClass("Hunter");

    }
    

    @FXML void strengthDecPressed(ActionEvent event) {
    	
    	int strength = Integer.parseInt(strengthCount.getText());
    	//Check if stat is non-positive 
    	if(Integer.parseInt(strengthCount.getText()) - 1 <= 0) {
    		System.out.println("Stats cannot be set lower than 0!");
    		strengthCount.setText("0");
    	}
    	else {
    		strengthCount.setText(Integer.toString(--strength));
    	}

    }
    
    @FXML void strengthIncPressed(ActionEvent event) {
    	int strength = Integer.parseInt(strengthCount.getText());
    	
    	//Check if stat is non-positive 
    	if(Integer.parseInt(strengthCount.getText()) + 1 <= 0) {
    		System.out.println("Stats cannot be set lower than 0!");
    		strengthCount.setText("0");
    	}
    	else {
    		strengthCount.setText(Integer.toString(++strength));
    	}

    }

    @FXML void defenseDecPressed(ActionEvent event) {
    	int defense = Integer.parseInt(defenseCount.getText());
    	//Check if stat is non-positive 
    	if(Integer.parseInt(defenseCount.getText()) - 1 <= 0) {
    		System.out.println("Stats cannot be set lower than 0!");
    		defenseCount.setText("0");
    	}
    	else {
    		defenseCount.setText(Integer.toString(--defense));
    	}
    }
    
    @FXML void defenseIncPressed(ActionEvent event) {
    	int defense = Integer.parseInt(defenseCount.getText());
    	
    	//Check if stat is non-positive 
    	if(Integer.parseInt(defenseCount.getText()) + 1 <= 0) {
    		System.out.println("Stats cannot be set lower than 0!");
    		defenseCount.setText("0");
    	}
    	else {
    		defenseCount.setText(Integer.toString(++defense));
    	}

    }

    @FXML void speedDecPressed(ActionEvent event) {
    	int speed = Integer.parseInt(speedCount.getText());
    	//Check if stat is non-positive 
    	if(Integer.parseInt(speedCount.getText()) - 1 <= 0) {
    		System.out.println("Stats cannot be set lower than 0!");
    		speedCount.setText("0");
    	}
    	else {
    		speedCount.setText(Integer.toString(--speed));
    	}
    }
    
    @FXML void speedIncPressed(ActionEvent event) {
    	int speed = Integer.parseInt(speedCount.getText());
    	
    	//Check if stat is non-positive 
    	if(Integer.parseInt(speedCount.getText()) + 1 <= 0) {
    		System.out.println("Stats cannot be set lower than 0!");
    		speedCount.setText("0");
    	}
    	else {
    		speedCount.setText(Integer.toString(++speed));
    	}
    }

    @FXML void dexterityDecPressed(ActionEvent event) {
    	int dexterity = Integer.parseInt(dexterityCount.getText());
    	//Check if stat is non-positive 
    	if(Integer.parseInt(dexterityCount.getText()) - 1 <= 0) {
    		System.out.println("Stats cannot be set lower than 0!");
    		dexterityCount.setText("0");
    	}
    	else {
    		dexterityCount.setText(Integer.toString(--dexterity));
    	}
    }

    @FXML void dexterityIncPressed(ActionEvent event) {
    	int dexterity = Integer.parseInt(dexterityCount.getText());
    	
    	//Check if stat is non-positive 
    	if(Integer.parseInt(dexterityCount.getText()) + 1 <= 0) {
    		System.out.println("Stats cannot be set lower than 0!");
    		dexterityCount.setText("0");
    	}
    	else {
    		dexterityCount.setText(Integer.toString(++dexterity));
    	}
    }
  
    @FXML void submitPressed(ActionEvent event) {

    	//Check if character has name and class set. If not, display error
    	//Do not allow program to proceed
    	if(!isValidChar()) {
    		labelError.setText("Character must have a name and class!");
    		labelError.setVisible(true);
    		return;
    	}
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

	//Check if character is valid
	//Has custom name
	//Has selected a class
	public boolean isValidChar() {
		if(Main.playerChar.getName().equals("Placeholder") || Main.playerChar.getCharClass().equals("noClass") ) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
}