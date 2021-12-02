package application.model;

import java.util.Random;

/**
 * Battle is a Java class which defines the method used for pressing the ATTACK button in the Battle view.
 * This class has an int variable (health), a Random object (rand) , a boolean variable (playerHit),
 * a String object (playerDMG), a boolean variable (monsterHit), and a String object (monsterDMG).
 * 
 * @author Cassidy Ferrel and Team
 * UTSA CS 3443 - Final Project
 * Fall 2021
 */
public class Battle {
	public static int health = 100;
	public static Random rand = new Random();
	public static boolean playerHit;
	public static String playerDMG;
	public static boolean monsterHit;
	public static String monsterDMG;
	
	/**
	 * Method initiated whenever the ATTACK Button object is pressed in the Battle view.
	 * 
	 * @param player - Player object representing the player
	 * @param monster - Player object representing the monster in the room
	 */
	public static void attack(Player player, Player monster) {

		/*
		 * Step One: Compare the Player's Speed and the Monster's Speed to each other.
		 * Use the difference to determine the % chance for the Player and the Monster
		 * to hit each other.
		 */

		playerHit = true;
		monsterHit = true;

		// 90% Chance to Hit for Player, 10% Chance to Hit for Monster
		if ((player.getSpd() - monster.getSpd()) >= 5) {
			if (rand.nextInt(11) == 1)
				playerHit = false;
			if (rand.nextInt(11) <= 9)
				monsterHit = false;
		}

		// 70% Chance to Hit for Player, 30% Chance to Hit for Monster
		else if ((player.getSpd() - monster.getSpd()) >= 1) {
			if (rand.nextInt(11) <= 3)
				playerHit = false;
			if (rand.nextInt(11) <= 7)
				monsterHit = false;
		}

		// 50% Chance to Hit for Player, 50% Chance to Hit for Monster
		else if ((player.getSpd() - monster.getSpd()) == 0) {
			if (rand.nextInt(11) <= 5)
				playerHit = false;
			if (rand.nextInt(11) <= 5)
				monsterHit = false;
		}

		// 30% Chance to Hit for Player, 70% Chance to Hit for Monster
		else if ((player.getSpd() - monster.getSpd()) >= -4) {
			if (rand.nextInt(11) <= 7)
				playerHit = false;
			if (rand.nextInt(11) <= 3)
				monsterHit = false;
		}

		// 10% Chance to Hit for Player, 90% Chance to Hit for Monster
		else {
			if (rand.nextInt(11) <= 9)
				playerHit = false;
			if (rand.nextInt(11) == 1)
				monsterHit = false;
		}

		if ((playerHit == false) && (monsterHit == false))
			return;

		/*
		 * Step Two: Compare the Player's Strength and Dexterity to each other. Repeat
		 * the process for the Monster as well. Whichever number is higher is the stat
		 * used for attacking.
		 */

		if ((player.getStr() >= player.getDex()))
			playerDMG = "STR";

		else
			playerDMG = "DEX";

		if ((monster.getStr() >= monster.getDex()))
			monsterDMG = "STR";

		else
			monsterDMG = "DEX";

		/*
		 * Step Three: Compare the attacking attribute for the Player and Monster to the
		 * opposing's Defense stat to determine HP damage.
		 */

		if (playerHit) {
			// If player is using Strength to Attack.
			if (playerDMG.equals("STR")) {
				if ((player.getStr() - monster.getDef()) >= 1)
					// Monster's Current Health - (Player's Strength - Monster's Defense)
					monster.setCurrHealth(monster.getCurrHealth() - (player.getStr() - monster.getDef()));
				else
					// Minimum of 1 Damage
					monster.setCurrHealth(monster.getCurrHealth() - 1);
			}

			// If player is using Dexterity to Attack.
			else {
				if ((player.getDex() - monster.getDef()) >= 1)
					// Monster's Current Health - (Player's Dexterity - Monster's Defense)
					monster.setCurrHealth(monster.getCurrHealth() - (player.getDex() - monster.getDef()));
				else
					// Minimum of 1 Damage
					monster.setCurrHealth(monster.getCurrHealth() - 1);
			}
		}

		if (monsterHit) {
			// If monster is using Strength to Attack.
			if (monsterDMG.equals("STR")) {
				if ((monster.getStr() - player.getDef()) >= 1)
					// Player's Current Health - (Monster's Strength - Player's Defense)
					player.setCurrHealth(player.getCurrHealth() - (monster.getStr() - player.getDef()));
				else
					// Minimum of 1 Damage
					player.setCurrHealth(player.getCurrHealth() - 1);
			}

			// If monster is using Dexterity to Attack.
			else {
				if ((monster.getDex() - player.getDef()) >= 1)
					// Player's Current Health - (Monter's Dexterity - Player's Defense)
					monster.setCurrHealth(player.getCurrHealth() - (monster.getDex() - player.getDef()));
				else
					// Minimum of 1 Damage
					player.setCurrHealth(player.getCurrHealth() - 1);
			}
		}
	}
}