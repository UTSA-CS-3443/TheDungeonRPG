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
    
    @FXML private Text customPoints;

    private int minStr = 0;
    private int minDef = 0;
    private int minSpd = 0;
    private int minDex = 0;
    private int statPts = 5;
    private int maxPts = 5;

    @FXML void classSelected(ActionEvent event) {
    	
    }
    
    @FXML void nameUpdated(KeyEvent event) {
    	System.out.println(charName.getText());
    	
    	Main.playerChar.name = charName.getText();

    }
    
    @FXML void warriorSelected(ActionEvent event) {
    	System.out.println("WARRIOR");
    	classSelect.setText("Warrior");
    	Main.playerChar.setCharClass("Warrior");
    	
    	/*
    	 * Warrior stats
    	 * Strength: 10 
			Defense: 10 
			Speed: 5 
			Dexterity: 0 
    	 */
    	
    	Main.playerChar.setStr(10);
    	Main.playerChar.setDef(10);
    	Main.playerChar.setSpd(5);
    	Main.playerChar.setDex(0);
    	
    	minStr = 10;
    	minDef = 10;
    	minSpd = 5;
    	minDex = 0;
    	
    	strengthCount.setText(Integer.toString(Main.playerChar.getStr()));
    	defenseCount.setText(Integer.toString(Main.playerChar.getDef()));
    	speedCount.setText(Integer.toString(Main.playerChar.getSpd()));
    	dexterityCount.setText(Integer.toString(Main.playerChar.getDex()));

    	//Reset stat points
    	statPts = 5;
    	customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    	
    }
    
    @FXML void hunterSelected(ActionEvent event) {
    	System.out.println("HUNTER");
    	classSelect.setText("Hunter");
    	Main.playerChar.setCharClass("Hunter");

    	
    	Main.playerChar.setStr(0);
    	Main.playerChar.setDef(5);
    	Main.playerChar.setSpd(10);
    	Main.playerChar.setDex(10);
    	
    	minStr = 0;
    	minDef = 5;
    	minSpd = 10;
    	minDex = 10;
    	
    	strengthCount.setText(Integer.toString(Main.playerChar.getStr()));
    	defenseCount.setText(Integer.toString(Main.playerChar.getDef()));
    	speedCount.setText(Integer.toString(Main.playerChar.getSpd()));
    	dexterityCount.setText(Integer.toString(Main.playerChar.getDex()));
    	
    	//Reset stat points
    	statPts = 5;
    	customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    }
 

    @FXML void strengthDecPressed(ActionEvent event) {
    	
    	int strength = Integer.parseInt(strengthCount.getText());
    	
    	
    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts < maxPts && strength > minStr) {
    		//If so then decrement the stat and increment the statPts;
    		++statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		--strength;
    		strengthCount.setText(Integer.toString(strength));
    	}
    	
    	
    	
    	
    	
    	/*
    	//Check if stat is non-positive 
    	if(Integer.parseInt(strengthCount.getText()) - 1 <= minStr) {
    		System.out.println("Stats cannot be set lower than 0!");
    		strengthCount.setText(Integer.toString(minStr));
    		
    		customPoints.setText(Integer.toString(maxPts) + "/" + Integer.toString(maxPts));

    	}
    	else {
    		strengthCount.setText(Integer.toString(--strength));
    		++statPts;
    		if(statPts > maxPts ) {
    			System.out.printf("Cannot exceed %d total points.\n", maxPts);
    			statPts = 5;
    		}
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    	}
    	
    	*/
    }
    
    @FXML void strengthIncPressed(ActionEvent event) {
    	int strength = Integer.parseInt(strengthCount.getText());
    	
    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts > 0) {
    		//If so then decrement the stat and increment the statPts;
    		--statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		++strength;
    		strengthCount.setText(Integer.toString(strength));
    	}
    	
    	
    	
    	
    	/*
    	//Check if stat is non-positive 
    	if(statPts == 0) {
    		System.out.println("Stat points cannot be set lower than 0.");
    		customPoints.setText(Integer.toString(0) + "/" + Integer.toString(maxPts));
    	}
    	else if(Integer.parseInt(strengthCount.getText()) + 1 <= minStr) {
    		System.out.println("Stats cannot be set lower than 0!");
    		strengthCount.setText(Integer.toString(minStr));
    		
    		customPoints.setText(Integer.toString(0) + "/" + Integer.toString(maxPts));

    	}
    	else {
    		strengthCount.setText(Integer.toString(++strength));
    		--statPts;
    		if(statPts > maxPts ) {
    			System.out.printf("Cannot exceed %d total points.\n", maxPts);
    			statPts = 5;
    		}
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    	}
    	*/

    }

    @FXML void defenseDecPressed(ActionEvent event) {
    	int defense = Integer.parseInt(defenseCount.getText());
    	//Check if stat is able to be decreased and it's not below the minimum allowed defense for the class


    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts < maxPts && defense > minDef) {
    		//If so then decrement the stat and increment the statPts;
    		++statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		--defense;
    		defenseCount.setText(Integer.toString(defense));
    	}
    	
    	/*
    	if(Integer.parseInt(defenseCount.getText()) - 1 <= minDef) {
    		System.out.println("Stats cannot be set lower than 0!");
    		defenseCount.setText(Integer.toString(minDef));
    	}
    	else {
    		defenseCount.setText(Integer.toString(--defense));
    	}
    	*/
    	
    }
    
    @FXML void defenseIncPressed(ActionEvent event) {
    	int defense = Integer.parseInt(defenseCount.getText());
    	
    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts > 0) {
    		//If so then decrement the stat and increment the statPts;
    		--statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		++defense;
    		defenseCount.setText(Integer.toString(defense));
    	}
    	
    	/*
    	//Check if stat is non-positive 
    	if(Integer.parseInt(defenseCount.getText()) + 1 <= minDef) {
    		System.out.println("Stats cannot be set lower than 0!");
    		defenseCount.setText(Integer.toString(minDef));
    	}
    	else {
    		defenseCount.setText(Integer.toString(++defense));
    	}

    	 */
    }

    @FXML void speedDecPressed(ActionEvent event) {
    	int speed = Integer.parseInt(speedCount.getText());
    	
    	
    	
    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts < maxPts && speed > minSpd) {
    		//If so then decrement the stat and increment the statPts;
    		++statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		--speed;
    		speedCount.setText(Integer.toString(speed));
    	}
    	
    	/*
    	//Check if stat is non-positive 
    	if(Integer.parseInt(speedCount.getText()) - 1 <= minSpd) {
    		System.out.println("Stats cannot be set lower than 0!");
    		speedCount.setText(Integer.toString(minSpd));
    	}
    	else {
    		speedCount.setText(Integer.toString(--speed));
    	}
    	*/
    }
    
    @FXML void speedIncPressed(ActionEvent event) {
    	int speed = Integer.parseInt(speedCount.getText());
    	
    	
    	
    	if(statPts > 0) {
    		//If so then decrement the stat and increment the statPts;
    		--statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		++speed;
    		speedCount.setText(Integer.toString(speed));
    	}
    	
    	/*
    	//Check if stat is non-positive 
    	if(Integer.parseInt(speedCount.getText()) + 1 <= minSpd) {
    		System.out.println("Stats cannot be set lower than 0!");
    		speedCount.setText(Integer.toString(minSpd));
    	}
    	else {
    		speedCount.setText(Integer.toString(++speed));
    	}
    	*/
    }

    @FXML void dexterityDecPressed(ActionEvent event) {
    	int dexterity = Integer.parseInt(dexterityCount.getText());
    	
    	
    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts < maxPts && dexterity > minDex) {
    		//If so then decrement the stat and increment the statPts;
    		++statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		--dexterity;
    		dexterityCount.setText(Integer.toString(dexterity));
    	}
    	
    	/*
    	//Check if stat is non-positive 
    	if(Integer.parseInt(dexterityCount.getText()) - 1 <= minDex) {
    		System.out.printf("Stats cannot be set lower than %d!", minDex);
    		dexterityCount.setText(Integer.toString(minDex));
    	}
    	else {
    		dexterityCount.setText(Integer.toString(--dexterity));
    	}
    	*/
    }

    @FXML void dexterityIncPressed(ActionEvent event) {
    	int dexterity = Integer.parseInt(dexterityCount.getText());
    	
    	if(statPts > 0) {
    		//If so then decrement the stat and increment the statPts;
    		--statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		++dexterity;
    		dexterityCount.setText(Integer.toString(dexterity));
    	}
    	
    	/*
    	//Check if stat is non-positive 
    	if(Integer.parseInt(dexterityCount.getText()) + 1 <= minDex) {
    		System.out.printf("Stats cannot be set lower than %d!", minDex);
    		dexterityCount.setText(Integer.toString(minDex));
    	}
    	else {
    		dexterityCount.setText(Integer.toString(++dexterity));
    	}
    	*/
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