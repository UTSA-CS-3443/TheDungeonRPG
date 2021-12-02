package application.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * InventoryController is a Java class that is the controller for the Inventory JavaFX scene.
 * 
 * @author Thomas Burns and Team
 * UTSA CS 3443 - Lab 6
 * Fall 2021
 */
public class InventoryController implements EventHandler<ActionEvent>, Initializable {

	@FXML
	private TextField playerName;
	
	@FXML
	private TextField playerLevel;
	
	@FXML
	private TextField playerHP;
    
    @FXML
    private TextField curExp;
    
    @FXML
    private TextField nextLevel;
    
    @FXML
    private Button backToBattle;
    
    @FXML
    private Button item1;
    
    @FXML
    private Button item2;
    
    @FXML
    private Button item3;
    
    @FXML
    private Button item4;
    
    @FXML
    private Button item5;
    
    @FXML
    private Button item6;
    
    @FXML
    private Button item7;
    
    @FXML
    private Button item8;
    
    @FXML
    private Button item9;
    
    @FXML
    private Button item10;
    
    /**
     * Method that initializes all TextField objects related to items names to "Empty" 
     */
    private void initializeInventoryNames() {
		item1.setText("Empty");
		item2.setText("Empty");
		item3.setText("Empty");
		item4.setText("Empty");
		item5.setText("Empty");
		item6.setText("Empty");
		item7.setText("Empty");
		item8.setText("Empty");
		item9.setText("Empty");
		item10.setText("Empty");
	}
    
    /**
     * Loads the values from ArrayList<String> itemList into the appropriate TextField objects
     * 
     * @param itemList - ArrayList<String> itemList with values for TextField objects related to items
     */
    private void loadInventoryList( ArrayList<String> itemList ) {
    	int i = 0;
    	
    	for( i = 0; i < itemList.size() && i < 10; i++ ) {
    		switch(i) {
    			case 0:
    				item1.setText( itemList.get(i) );
    				break;
    			case 1:
    				item2.setText( itemList.get(i) );
    				break;
    			case 2:
    				item3.setText( itemList.get(i) );
    				break;
    			case 3:
    				item4.setText( itemList.get(i) );
    				break;
    			case 4:
    				item5.setText( itemList.get(i) );
    				break;
    			case 5:
    				item6.setText( itemList.get(i) );
    				break;
    			case 6:
    				item7.setText( itemList.get(i) );
    				break;
    			case 7:
    				item8.setText( itemList.get(i) );
    				break;
    			case 8:
    				item9.setText( itemList.get(i) );
    				break;
    			case 9:
    				item10.setText( itemList.get(i) );
    				break;
    			default:
    				break;
    		}
    	}
    }
    
    //Javadoc auto-populated due to @Override tag
    /**
     * 
     */
    @Override
	public void initialize(URL location, ResourceBundle resources) {

		playerName.setText( Main.playerChar.getName() );
		playerLevel.setText( "" + Main.playerChar.getLevel() );
		playerHP.setText( "" + Main.playerChar.getCurrHealth() );
		// playerHP.setText( Main.playerChar.getCurrHealth() + " / " + Main.playerChar.getMaxHealth() ); // code if max HP is included in same box
	    curExp.setText( "" + Main.playerChar.getExp() );
	    nextLevel.setText( "N/A" ); // FIXME: Determine how this will be calculated and displayed
		
		// default all item button names to Empty
		initializeInventoryNames();
		
		//set the inventory button names
		loadInventoryList( Main.playerChar.inventory.getItemList() );
		
	}
    
	/**
	 * Method executed when the item1 Button object is pressed
	 * 
	 * @param - default ActionEvent object representation of Button object being pressed
	 */
    @FXML
    public void item1Pressed(ActionEvent event) {
    	// if not empty
    	if( !( item1.getText().equals( "Empty" ) ) ) {
    		
    		// Use item, apply its effect
    		Main.playerChar.inventory.useItem( 0 );
    		
	    	// Then return To Battle
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT");
				Main.stage.show();
				
			} 
	    	
	    	catch(Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	// if empty, do nothing
    }
    
    /**
     * Method executed when the item2 Button object is pressed
	 * 
     * @param - default ActionEvent object representation of Button object being pressed
     */
    @FXML
    public void item2Pressed(ActionEvent event) {
    	// if not empty
    	if( !( item2.getText().equals( "Empty" ) ) ) {
    		
    		// Use item, apply its effect
    		Main.playerChar.inventory.useItem( 1 );
    		
	    	// Then return To Battle
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT");
				Main.stage.show();
				
			} 
	    	
	    	catch(Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	// if empty, do nothing
    }
    
    /**
     * Method executed when the item3 Button object is pressed
	 * 
     * @param - default ActionEvent object representation of Button object being pressed
     */
    @FXML
    public void item3Pressed(ActionEvent event) {
    	// if not empty
    	if( !( item3.getText().equals( "Empty" ) ) ) {
    		
    		// Use item, apply its effect
    		Main.playerChar.inventory.useItem( 2 );
    		
	    	// Then return To Battle
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT");
				Main.stage.show();
				
			} 
	    	
	    	catch(Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	// if empty, do nothing
    }
    
    /**
     * Method executed when the item4 Button object is pressed
	 * 
     * @param - default ActionEvent object representation of Button object being pressed
     */
    @FXML
    public void item4Pressed(ActionEvent event) {
    	// if not empty
    	if( !( item4.getText().equals( "Empty" ) ) ) {
    		
    		// Use item, apply its effect
    		Main.playerChar.inventory.useItem( 3 );
    		
	    	// Then return To Battle
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT");
				Main.stage.show();
				
			} 
	    	
	    	catch(Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	// if empty, do nothing
    }
    
    /**
     * Method executed when the item5 Button object is pressed
	 * 
     * @param - default ActionEvent object representation of Button object being pressed
     */
    @FXML
    public void item5Pressed(ActionEvent event) {
    	// if not empty
    	if( !( item5.getText().equals( "Empty" ) ) ) {
    		
    		// Use item, apply its effect
    		Main.playerChar.inventory.useItem( 4 );
    		
	    	// Then return To Battle
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT");
				Main.stage.show();
				
			} 
	    	
	    	catch(Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	// if empty, do nothing
    }
    
    /**
     * Method executed when the item6 Button object is pressed
	 * 
     * @param - default ActionEvent object representation of Button object being pressed
     */
    @FXML
    public void item6Pressed(ActionEvent event) {
    	// if not empty
    	if( !( item6.getText().equals( "Empty" ) ) ) {
    		
    		// Use item, apply its effect
    		Main.playerChar.inventory.useItem( 5 );
    		
	    	// Then return To Battle
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT");
				Main.stage.show();
				
			} 
	    	
	    	catch(Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	// if empty, do nothing
    }
    
    /**
     * Method executed when the item7 Button object is pressed
	 * 
     * @param - default ActionEvent object representation of Button object being pressed
     */
    @FXML
    public void item7Pressed(ActionEvent event) {
    	// if not empty
    	if( !( item7.getText().equals( "Empty" ) ) ) {
    		
    		// Use item, apply its effect
    		Main.playerChar.inventory.useItem( 6 );
    		
	    	// Then return To Battle
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT");
				Main.stage.show();
				
			} 
	    	
	    	catch(Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	// if empty, do nothing
    }
    
    /**
     * Method executed when the item8 Button object is pressed
	 * 
     * @param - default ActionEvent object representation of Button object being pressed
     */
    @FXML
    public void item8Pressed(ActionEvent event) {
    	// if not empty
    	if( !( item8.getText().equals( "Empty" ) ) ) {
    		
    		// Use item, apply its effect
    		Main.playerChar.inventory.useItem( 7 );
    		
	    	// Then return To Battle
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT");
				Main.stage.show();
				
			} 
	    	
	    	catch(Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	// if empty, do nothing
    }
    
    /**
     * Method executed when the item9 Button object is pressed
	 * 
     * @param - default ActionEvent object representation of Button object being pressed
     */
    @FXML
    public void item9Pressed(ActionEvent event) {
    	// if not empty
    	if( !( item9.getText().equals( "Empty" ) ) ) {
    		
    		// Use item, apply its effect
    		Main.playerChar.inventory.useItem( 8 );
    		
	    	// Then return To Battle
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT");
				Main.stage.show();
				
			} 
	    	
	    	catch(Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	// if empty, do nothing
    }
    
	/**
	 * Method executed when the item10 Button object is pressed
	 * 
	 * @param - default ActionEvent object representation of Button object being pressed
	 */
    @FXML
    public void item10Pressed(ActionEvent event) {
    	// if not empty
    	if( !( item10.getText().equals( "Empty" ) ) ) {
    		
    		// Use item, apply its effect
    		Main.playerChar.inventory.useItem( 9 );
    		
	    	// Then return To Battle
	    	try {
				Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
				Main.stage.setScene(new Scene(root, 800, 800));
				Main.stage.setTitle("The Dungeon RPG - FIGHT");
				Main.stage.show();
				
			} 
	    	
	    	catch(Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	// if empty, do nothing
    }
    
    /**
	 * Method executed when the backToBattle Button object is pressed
	 * 
	 * @param - default ActionEvent object representation of Button object being pressed
	 */
    @FXML
    public void backToBattlePressed(ActionEvent event) {
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Battle.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.setTitle("The Dungeon RPG - FIGHT");
			Main.stage.show();
			
		} 
    	
    	catch(Exception e) {
			e.printStackTrace();
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