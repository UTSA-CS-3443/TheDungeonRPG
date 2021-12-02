package application.controller;

import java.util.Arrays;
import java.util.List;

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

/**
 * CreateController is a Java class that is the controller for the Create JavaFX scene.
 * 
 * @author Patrick Jenkins and Team
 * UTSA CS 3443 - Lab 6
 * Fall 2021
 */
public class CreateController implements EventHandler<ActionEvent> {

	@FXML
	private TextField charName;
	
	@FXML
	private TextField customClassName;
	
	@FXML
	private SplitMenuButton classSelect;
	
	@FXML
	private MenuItem warriorItem;
	
	@FXML
	private MenuItem hunterItem;
	
	@FXML
	private Button strengthDec;
	
	@FXML
	private Button strengthInc;
	
	@FXML
	private Text strengthCount;
	
	@FXML
	private Button defenseDec;
	
	@FXML
	private Button defenseInc;
    
	@FXML
	private Text defenseCount;

    @FXML
    private Button speedDec;
    
    @FXML
    private Button speedInc;
    
    @FXML
    private Text speedCount;

    @FXML
    private Button dexterityDec;
    
    @FXML
    private Button dexterityInc;
    
    @FXML
    private Text dexterityCount;
    
    @FXML
    private Button submitButton;
    
    @FXML
    private Label labelError;
    
    @FXML
    private Text customPoints;

    private int minStr = 0;
    private int minDef = 0;
    private int minSpd = 0;
    private int minDex = 0;
    private int statPts = 5;
    private int maxPts = 5;

    //Records if current character is custom class or not
    private boolean isCustom = false;
    
    //list storing valid classes
    private List<String> validClasses = Arrays.asList("Warrior", "Knight", "Hunter");
    
	/**
	 * Method called when SplitMenuButton classSelect is used.
	 * 
	 * @param event - ActionEvent generated when SplitMenuButton classSelect is used.
	 */
    @FXML
    public void classSelected(ActionEvent event) {
    	
    }
    
	/**
	 * Method called when TextField charName is updated.
	 * 
	 * @param event - KeyEvent generated when TextField charName is updated.
	 */
    @FXML
    public void nameUpdated(KeyEvent event) {
    	System.out.println(charName.getText());
    	
    	Main.playerChar.name = charName.getText();

    }
    
	/**
	 * Method called when TextField customClassName is updated.
	 * 
	 * @param event - KeyEvent generated when TextField customClassName is updated.
	 */
    @FXML
    public void classNameUpdated(KeyEvent event) {
    	
    	if(customClassName.getText().length() < 15) {
    		labelError.setVisible(false);
        	System.out.println(customClassName.getText());
        	
        	classSelect.setText(customClassName.getText());
        	Main.playerChar.charClass = customClassName.getText();
    	}
    	else {
    		labelError.setText("Class name too long!");
    		labelError.setVisible(true);
    	}


    }
    
	/**
	 * Method called when Warrior is selected from SplitMenuButton classSelect.
	 * 
	 * @param event - ActionEvent generated when Warrior is selected from SplitMenuButton classSelect.
	 */
    @FXML
    public void warriorSelected(ActionEvent event) {
    	
    	isCustom = false;
    	System.out.println("WARRIOR");
    	customClassName.setVisible(false);
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
    	
    	//FIXME
    	Main.playerChar.initializeInventory();
    	
    }
    
	/**
	 * Method called when Hunter is selected from SplitMenuButton classSelect.
	 * 
	 * @param event - ActionEvent generated when Hunter is selected from SplitMenuButton classSelect.
	 */
    @FXML
    public void hunterSelected(ActionEvent event) {
    	isCustom = false;
    	System.out.println("HUNTER");
    	customClassName.setVisible(false);
    	classSelect.setText("Hunter");
    	Main.playerChar.setCharClass("Hunter");

    	
    	/*
    	 * Hunter stats
    	 * Strength: 0 
			Defense: 5 
			Speed: 10
			Dexterity: 10 
    	 */
    	
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
    	
    	
    	Main.playerChar.initializeInventory();
    }
    
	/**
	 * Method called when Knight is selected from SplitMenuButton classSelect.
	 * 
	 * @param event - ActionEvent generated when Knight is selected from SplitMenuButton classSelect.
	 */
    @FXML
    public void knightSelected(ActionEvent event) {
    	isCustom = false;
    	System.out.println("KNIGHT");
    	customClassName.setVisible(false);
    	classSelect.setText("Knight");
    	Main.playerChar.setCharClass("Knight");

    	
    	/*
    	 * Knight stats
    	 * Strength: 8 
			Defense: 10 
			Speed: 4 
			Dexterity: 3 
    	 */
    	
    	Main.playerChar.setStr(8);
    	Main.playerChar.setDef(10);
    	Main.playerChar.setSpd(4);
    	Main.playerChar.setDex(3);
    	
    	minStr = 8;
    	minDef = 10;
    	minSpd = 4;
    	minDex = 3;
    	
    	strengthCount.setText(Integer.toString(Main.playerChar.getStr()));
    	defenseCount.setText(Integer.toString(Main.playerChar.getDef()));
    	speedCount.setText(Integer.toString(Main.playerChar.getSpd()));
    	dexterityCount.setText(Integer.toString(Main.playerChar.getDex()));
    	
    	//Reset stat points
    	statPts = 5;
    	customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    	
    	
    	Main.playerChar.initializeInventory();
    }
    
	/**
	 * Method called when custom class is selected from SplitMenuButton classSelect.
	 * 
	 * @param event - ActionEvent generated when custom class is selected from SplitMenuButton classSelect.
	 */
    @FXML
    public void customSelected(ActionEvent event) {
    	isCustom = true;
    	System.out.println("CUSTOM");
    	classSelect.setText("");
    	customClassName.setVisible(true);
    	//classSelect.setText("Knight");
    	Main.playerChar.setCharClass(customClassName.getText());

    	//Custom class allows player to distribute all 30 points as they see fit
    	
    	Main.playerChar.setStr(0);
    	Main.playerChar.setDef(0);
    	Main.playerChar.setSpd(0);
    	Main.playerChar.setDex(0);
    	
    	minStr = 0;
    	minDef = 0;
    	minSpd = 0;
    	minDex = 0;
    	
    	strengthCount.setText(Integer.toString(Main.playerChar.getStr()));
    	defenseCount.setText(Integer.toString(Main.playerChar.getDef()));
    	speedCount.setText(Integer.toString(Main.playerChar.getSpd()));
    	dexterityCount.setText(Integer.toString(Main.playerChar.getDex()));
    	
    	//Reset stat points
    	maxPts = 30;
    	statPts = 30;
    	customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    	
    	
    	Main.playerChar.initializeInventory();
    }
    
	/**
	 * Method called when Button strengthDec is pressed.
	 * 
	 * @param event - ActionEvent generated when Button strengthDec is pressed.
	 */
    @FXML
    public void strengthDecPressed(ActionEvent event) {
    	int strength = Integer.parseInt(strengthCount.getText());
    	
    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts < maxPts && strength > minStr) {
    		//If so then decrement the stat and increment the statPts;
    		++statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		--strength;
    		strengthCount.setText(Integer.toString(strength));
    	}
    }
    
	/**
	 * Method called when Button strengthInc is pressed.
	 * 
	 * @param event - ActionEvent generated when Button strengthInc is pressed.
	 */
    @FXML
    public void strengthIncPressed(ActionEvent event) {
    	int strength = Integer.parseInt(strengthCount.getText());
    	
    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts > 0) {
    		//If so then decrement the stat and increment the statPts;
    		--statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		++strength;
    		strengthCount.setText(Integer.toString(strength));
    	}
    }
    
	/**
	 * Method called when Button defenseDec is pressed.
	 * 
	 * @param event - ActionEvent generated when Button defenseDec is pressed.
	 */
    @FXML
    public void defenseDecPressed(ActionEvent event) {
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
    }
    
	/**
	 * Method called when Button defenseInc is pressed.
	 * 
	 * @param event - ActionEvent generated when Button defenseInc is pressed.
	 */
    @FXML
    public void defenseIncPressed(ActionEvent event) {
    	int defense = Integer.parseInt(defenseCount.getText());
    	
    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts > 0) {
    		//If so then decrement the stat and increment the statPts;
    		--statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		++defense;
    		defenseCount.setText(Integer.toString(defense));
    	}
    }
    
	/**
	 * Method called when Button speedDec is pressed.
	 * 
	 * @param event - ActionEvent generated when Button speedDec is pressed.
	 */
    @FXML
    public void speedDecPressed(ActionEvent event) {
    	int speed = Integer.parseInt(speedCount.getText());
    	
    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts < maxPts && speed > minSpd) {
    		//If so then decrement the stat and increment the statPts;
    		++statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		--speed;
    		speedCount.setText(Integer.toString(speed));
    	}
    }
    
	/**
	 * Method called when Button speedInc is pressed.
	 * 
	 * @param event - ActionEvent generated when Button speedInc is pressed.
	 */
    @FXML
    public void speedIncPressed(ActionEvent event) {
    	int speed = Integer.parseInt(speedCount.getText());
    	
    	if(statPts > 0) {
    		//If so then decrement the stat and increment the statPts;
    		--statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		++speed;
    		speedCount.setText(Integer.toString(speed));
    	}
    }
    
	/**
	 * Method called when Button dexterityDec is pressed.
	 * 
	 * @param event - ActionEvent generated when Button dexterityDec is pressed.
	 */
    @FXML
    public void dexterityDecPressed(ActionEvent event) {
    	int dexterity = Integer.parseInt(dexterityCount.getText());
    	
    	//Check if there are any statPts left AND that stat is greater than its minimum value
    	if(statPts < maxPts && dexterity > minDex) {
    		//If so then decrement the stat and increment the statPts;
    		++statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		--dexterity;
    		dexterityCount.setText(Integer.toString(dexterity));
    	}
    }
    
	/**
	 * Method called when Button dexterityInc is pressed.
	 * 
	 * @param event - ActionEvent generated when Button dexterityInc is pressed.
	 */
    @FXML
    public void dexterityIncPressed(ActionEvent event) {
    	int dexterity = Integer.parseInt(dexterityCount.getText());
    	
    	if(statPts > 0) {
    		//If so then decrement the stat and increment the statPts;
    		--statPts;
    		customPoints.setText(Integer.toString(statPts) + "/" + Integer.toString(maxPts));
    		++dexterity;
    		dexterityCount.setText(Integer.toString(dexterity));
    	}
    }
    
	/**
	 * Method called when Button submitButton is pressed.
	 * 
	 * @param event - ActionEvent generated when Button submitButton is pressed.
	 */
    @FXML
    public void submitPressed(ActionEvent event) {

    	//Check if character has name and class set. If not, display error
    	//Do not allow program to proceed
    	if(!isValidChar()) {
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
    
	//Check if character is valid
	//Has custom name
	//Has selected a class
    /**
     * Method which returns a boolean variable, depending on the answers to the following actions:
     * Check if character is valid, check if character has custom name, and check if a class is selected.
     * 
     * @return The appropriate boolean representation for if the respective variable(s) are valid
     */
	public boolean isValidChar() {
		
		//Check if the default class or no names are used for class
		if(Main.playerChar.getName().equals("Placeholder") || Main.playerChar.getCharClass().equals("noClass") && Main.playerChar.getName().length() > 0 && Main.playerChar.getCharClass().length() > 0) {
    		labelError.setText("Character must have a name and class!");
    		labelError.setVisible(true);
			return false;
		}
		
		//Check if the custom class name already exists. NOT case sensitive
		else if(isCustom) {
			int i;
			for(i = 0; i < validClasses.size(); ++i ) {
				if(Main.playerChar.getCharClass().toLowerCase().equals(validClasses.get(i).toLowerCase())) {
					break;
				}
			}
			//Class is invalid if this is true
			//Indicates not all classes were checked aka a match was found
			if(i < validClasses.size()) {
	    		labelError.setText("This class already exists, pick another name.");
	    		labelError.setVisible(true);
				return false;
			}
			else {
				return true;
			}
		}
		else {
			return true;
		}
	}
	
    //Javadoc auto-populated due to @Override tag
    /**
     * 
     */
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}