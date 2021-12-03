package application.model;

/**
 * Player is a Java class which defines the Player object.
 * This class has a String object (name), a String object (charClass), an int variable (currHealth),
 * a int variable (maxHealth), and an int variable (level), an int variable (exp) , an int variable (str),
 * an int variable (def), and int variable (spd), and an int variable (dex).
 * 
 * @author Patrick Jenkins and Team
 * UTSA CS 3443 - Team Project
 * Fall 2021
 */
public class Player {
	
	public String name;
	public String charClass;
	public int currHealth;
	public int maxHealth;
	public int level;
	
	//Current experience (for advancing to next level)
	public int exp;
	
	//Player stats
	//Strength
	public int str;
	//defense
	public int def;
	//speed
	public int spd;
	//dexterity
	public int dex;
	
	//inventory - arraylist of strings
	public Inventory inventory;
	
	/**
	 * Constructor method; creates the Player object.
	 * 
	 * @param name - Name of the Player object, represented by a String object.
	 * @param charClass - Character class of the Player object, represented by a String object.
	 * @param currHealth - Current health of the Player object, represented by an int variable.
	 * @param maxHealth - Maximum health of the Player object, represented by a double.
	 * @param level - Level of the Player object, represented by an int variable.
	 * @param exp - Experience of the Player object, represented by an int variable.
	 * @param str - Strength of the Player object, represented by an int variable.
	 * @param def - Defense of the Player object, represented by an int variable.
	 * @param spd - Speed of the Player object, represented by an int variable.
	 * @param dex - Dexterity of the Player object, represented by an int variable.
	 */
	public Player(String userName, String charClass, int currHealth, int maxHealth, int level, int exp, int strength, int defense, int spd,  int dexterity, Inventory inventory)
	{
		this.name = userName;
		this.charClass = charClass;
		this.currHealth = currHealth;
		this.maxHealth = maxHealth;
		this.level = level;
		this.exp = exp;
		this.str = strength;
		this.def = defense;
		this.spd = spd;
		this.dex = dexterity;
		
		//TODO Make sure this doesn't return null pointer later in code (inventorycontroller)
		this.inventory = makeInventory(inventory);
	}
	
	/**
	 * Method which creates a new Inventory object for the Player.inventory in the event it is currently a null pointer.
	 * 
	 * @param inventory - Inventory object to be validated if it is a null pointer
	 * @return - Either current non-null pointer Inventory object or new Inventory object if was a null pointer
	 */
	public Inventory makeInventory(Inventory inventory) {
		if(inventory == (null)) {
			return new Inventory();
		}
		else {
			return inventory;
		}
	}
	
	/**
	 * Initialize a character's inventory based on class
	 */
	public void initializeInventory() {
				/* Valid potions as of Dec 1
				"Potion",
				"Mid potion",
				"Max potion",
				"Strength up",
				"Defense up",
				"Speed up",
				"Dexterity up"//, // remove first comment forwardslashes before adding new item
 				*/
		
		
		//Warrior class gets Potion
		//Str pot
		//Str pot
		if(this.charClass.equalsIgnoreCase("Warrior")) {
			this.inventory.addItem("Potion");
			this.inventory.addItem("Strength up");
			this.inventory.addItem("Strength up");
		}
		else if(this.charClass.equalsIgnoreCase("Hunter")) {
			this.inventory.addItem("Potion");
			this.inventory.addItem("Defense up");
			this.inventory.addItem("Defense up");
		}
		else if(this.charClass.equalsIgnoreCase("Knight")) {
			this.inventory.addItem("Potion");
			this.inventory.addItem("Defense up");
			this.inventory.addItem("Strength up");
		}
		else {
			this.inventory.addItem("Potion");
			this.inventory.addItem("Potion");
		}
		
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the charClass
	 */
	public String getCharClass() {
		return charClass;
	}

	/**
	 * @param charClass the charClass to set
	 */
	public void setCharClass(String charClass) {
		this.charClass = charClass;
	}

	/**
	 * @return the currHealth
	 */
	public int getCurrHealth() {
		return currHealth;
	}

	/**
	 * @param currHealth the currHealth to set
	 */
	public void setCurrHealth(int currHealth) {
		this.currHealth = currHealth;
	}

	/**
	 * @return the maxHealth
	 */
	public int getMaxHealth() {
		return maxHealth;
	}

	/**
	 * @param maxHealth the maxHealth to set
	 */
	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}

	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	/**
	 * @return the exp
	 */
	public int getExp() {
		return exp;
	}

	/**
	 * @param exp the exp to set
	 */
	public void setExp(int exp) {
		this.exp = exp;
	}

	/**
	 * @return the str
	 */
	public int getStr() {
		return str;
	}

	/**
	 * @param str the str to set
	 */
	public void setStr(int str) {
		this.str = str;
	}

	/**
	 * @return the def
	 */
	public int getDef() {
		return def;
	}

	/**
	 * @param def the def to set
	 */
	public void setDef(int def) {
		this.def = def;
	}

	/**
	 * @return the spd
	 */
	public int getSpd() {
		return spd;
	}

	/**
	 * @param spd the spd to set
	 */
	public void setSpd(int spd) {
		this.spd = spd;
	}

	/**
	 * @return the dex
	 */
	public int getDex() {
		return dex;
	}

	/**
	 * @param dex the dex to set
	 */
	public void setDex(int dex) {
		this.dex = dex;
	}

	/**
	 * @return the inventory
	 */
	public Inventory getInventory() {
		return inventory;
	}

	/**
	 * @param inventory the inventory to set
	 */
	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
}