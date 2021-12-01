package application.model;

import java.util.ArrayList;
import java.util.Arrays;

import application.Main;

/**
 * Inventory is a Java class which defines the Inventory object.
 * This class has an ArrayList<String> object (itemList).
 * 
 * @author Thomas Burns (aqj787) and Team
 * UTSA CS 3443 - Team Project
 * Fall 2021
 */
public class Inventory {
	private ArrayList<String> itemList;
	
	/**
	 * Default constructor method; used when call to method contains no parameters
	 */
	public Inventory() {
		// create blank ArrayList<String> object
		this.itemList = new ArrayList<String>();
	}
	
	/**
	 * 
	 * @param itemList
	 */
	public Inventory( ArrayList<String> itemList ) {
		// Create populated ArrayList<String> object
		this.itemList = itemList;
	}
	
	/**
	 * addItem adds an itemName (String) to the itemList ArrayList<String>. The method first determines if itemList.size() < 10, and if not, does nothing.
	 * Else, the item gets added to the itemList, provided the name is valid, otherwise a String with a default value gets added.
	 * 
	 * @param itemName
	 */
	public void addItem( String itemName ) {
		// only add item if itemList.size() < 10 ... 10 is max inventory
		if( itemList.size() < 10 ) {
			

			String itemNameValid = "";
			int i;
			
			//Below are values of valid item names
			ArrayList<String> listValidItems = new ArrayList<String>(Arrays.asList(
				"Potion",
				"Mid potion",
				"Max potion",
				"Strength up",
				"Defense up",
				"Speed up",
				"Dexterity up"//, // remove first comment forwardslashes before adding new item
			));
			
			// confirm name of item in parameter is valid
			for( i = 0; i < listValidItems.size(); i++ ) {
				if( itemName.equals( listValidItems.get(i) ) ) {
					itemNameValid = itemName;
					break;
				}
			}
			
			// default if invalid name given
			//if( i <= listValidItems.size() ) {
			//NOTE - Fixed bug where all potions/items ended up being generic "Potion" - Patrick
			if( i <= listValidItems.size() && itemNameValid.equals("") ) {
				itemNameValid = "Potion";
			}
			
			itemList.add( itemNameValid );
		}
	}
	
	
	/**
	 * Removes a String from itemList, and uses the String representation of the String removed from itemList
	 * to make changes to variable(s) in Main.playerChar
	 * 
	 * @param itemSlot - numeric representation to which Button object was actioned
	 */
	public void useItem( int itemSlot ) {
		String itemChosen = itemList.get(itemSlot);
		
		itemList.remove( itemSlot );

    	switch( itemChosen ) {
    		case "Potion":
    			// Add 2 HP
    			Main.playerChar.setCurrHealth( Main.playerChar.getCurrHealth() + 2 );
    			break;
    		case "Mid potion":
    			// Add 5 HP
    			Main.playerChar.setCurrHealth( Main.playerChar.getCurrHealth() + 5 );
    			break;
    		case "Max potion":
    			// Add 10 HP
    			Main.playerChar.setCurrHealth( Main.playerChar.getCurrHealth() + 10 );
    			break;
    		case "Strength up":
    			// Add 1 STR
    			Main.playerChar.setStr( Main.playerChar.getStr() + 1 );
    			break;
    		case "Defense up":
    			// Add 1 DEF
    			Main.playerChar.setDef( Main.playerChar.getDef() + 1 );
    			break;
    		case "Speed up":
    			// Add 1 SPD
    			Main.playerChar.setSpd( Main.playerChar.getSpd() + 1 );
    			break;
    		case "Dexterity up":
    			// Add 1 DEX
    			Main.playerChar.setDex( Main.playerChar.getDex() + 1 );
    			break;
    		default:
    			// nothing happens ... placeholder
    			break;
    	}
        
    	// Ensure any changes to not put currHealth higher than maxHealth
       	if( Main.playerChar.getCurrHealth() > Main.playerChar.getMaxHealth() ) {
        	Main.playerChar.setCurrHealth(  Main.playerChar.getMaxHealth() );
        }
    }
	
	/**
	 * Getter method; gets the value for ArrayList<String> itemList from the Inventory object, and returns the value.
	 * 
	 * @return ArrayList<String> itemList alias from the Inventory object
	 */
	public ArrayList<String> getItemList() {
		return itemList;
	}
	
	/**
	 * Setter method; sets the value of ArrayList<String> itemList in the Inventory object to the value of the passed parameter.
	 * 
	 * @param name - ArrayList<String> to be set as the value of itemList in the Avenger Inventory
	 */
	public void setItemList(ArrayList<String> itemList) {
		this.itemList = itemList;
	}
}