package application.model;

import java.util.ArrayList;

public class Dungeon {

	public static ArrayList<Dungeon> roomList = new ArrayList<>();
	public static String description;
	public static String exit;
	public static String curMonster;
	public static int curRoom = 1;
	public static boolean monsterDefeated;

	public Dungeon(String description, String exit, boolean monsterDefeated, String curMonster) {
		Dungeon.description = description;
		Dungeon.exit = exit;
		Dungeon.monsterDefeated = monsterDefeated;
	}

	public static void room1() {
		description = "You step into the halls of past Heroes. There lies a path to the North with statues of various Heroes lining both sides. It is dark, the only light coming from some candles that sparsely populate the room."
				+ "You get an overwhelming feeling that you are being watched, as if the Heroes of previous Ages are watching to see what will become of you. Will you pass the trials and stand as equal to them, or will you falter and"
				+ "perish within the dark depths of the temple.\n" + "Exit: North";
		exit = "North";
		monsterDefeated = true;
		curMonster = "NULL";

		roomList.add(new Dungeon(description, exit, monsterDefeated, curMonster));
	}

	public static void room2() {
		description = "The doors behind you slowly close as you step foot into the first of many trials ahead of you. The room is filled with darkness except a lone circle straight ahead of you. The circle is of a decent diameter, you"
				+ "guess that it is big enough for two combatants to be able to square off comfortably. As you move towards it, you make out a faint shadow on the other side of the circle, moving slowly forward. You now understand that"
				+ "these trials will pit you against monsters of all kinds. When you finally reach the circle, ahead of you stands a [INSERT MONSTER].\n"
				+ "Monster: [MONSTER NAME]\n" + "Exit: West.";
		exit = "West";
		monsterDefeated = false;
		curMonster = "NULL";

		roomList.add(new Dungeon(description, exit, monsterDefeated, curMonster));
	}

	public static void room3() {
		description = "You have left the dark dungeon-esque rooms behind and before you stands a room full of greenery. Vines snake their way up the walls and large oak trees are scattered throughout the room, towering almost infinititely"
				+ "high. The ground is covered in wild grass and patches of flowers and moss. As you make your way through the room, the grass crunching beneath your heavy feet, you hear the faint sounds of footsteps somwhere in the distance."
				+ "It's at this point you know that your next trial awaits you somewhere within the forest.\n"
				+ "Monster: [MONSTER NAME]\n" + "Exit: North";
		exit = "North";
		monsterDefeated = false;
		curMonster = "NULL";

		roomList.add(new Dungeon(description, exit, monsterDefeated, curMonster));
	}

	public static void room4() {
		description = "The forest becomes more dense as you pass into the next room. Trees become more common and packed tighter together and the grass grows longer. You hear the faint crackling of a fire and can see the wave back and forth"
				+ "amongst the trees. You make your way carefully through the forest, not knowing what awaits. Soon enough, you have stumbled upon the fire and an empty log left unattended in the room. As you sit down to rest you hear a "
				+ "booming voice echo out, 'You have earned a rest Champion, take time to gather yourself before you continue forward.' You have gained [XXX] HP.\n"
				+ "Exit: North";
		exit = "North";
		monsterDefeated = true;

		// TODO: Add Health To Player.
		curMonster = "NULL";

		roomList.add(new Dungeon(description, exit, monsterDefeated, curMonster));
	}

	public static void room5() {
		description = "The trees begin to fade away behind you and the darkness with it. Ahead of you bright light fills the room, streaking in from high above, as if the Sun itself was in the very room. A great pond is ahead of you, with several"
				+ "stones leading to a central platform in the middle. You can make out in the distance that the rest is over, for your next trial stands waiting for you on the central platform.\n"
				+ "Monster: [MONSTER NAME]\n" + "Exit: East";
		exit = "East";
		monsterDefeated = false;
		curMonster = "NULL";

		roomList.add(new Dungeon(description, exit, monsterDefeated, curMonster));
	}

	public static void room6() {
		description = "The sound of several streams echoes throughout the room. As you survey what is ahead of, you notice that there are several rapidly moving streams between you and the next door. Small wooden bridges allow you passage to"
				+ "cross each successive stream. You slowly make your way across the first bridge and as you do, the wood sways and creaks, but alas holds together for you to pass. You begin to wonder if you are afforded rest once again,"
				+ " until you hear the sound of water splashing. Just ahead of you, a creature jumps forth from the water and awaits you across the next bridge.\n"
				+ "Monster: [MONSTER NAME]\n" + "Exit: East";
		exit = "East";
		monsterDefeated = false;
		curMonster = "NULL";

		roomList.add(new Dungeon(description, exit, monsterDefeated, curMonster));
	}

	public static void room7() {
		description = "Your clothes drip with water as you leave the previous room. Only a few steps into this new one and the heat begins to beat down on you. It's suffocating and makes it harder for you to breathe. Quickly, you try to find"
				+ "the source of heat and it doesnt' take long. A large chasm filled with lava stands before you. The only way across is a large rope bridge. Unfortunately, you are not alone in this room as another trial awaits you. Standing"
				+ "directly in the middle of the bridge you spot the next creature.\n" + "Monster: [MONSTER NAME]\n"
				+ "Exit: South";
		exit = "South";
		monsterDefeated = false;
		curMonster = "NULL";

		roomList.add(new Dungeon(description, exit, monsterDefeated, curMonster));
	}

	public static void room8() {
		description = "As soon as you make your way into this next room, you immediately notice how much smaller it is comapred to all the previous rooms. There is nothing except a single cot and a pitcher of water in the corner. Once again"
				+ "you hear the same voice speak out to you, 'Champion, you have almost completed the trials. Ahead lays the final trial. Ready yourself and then move through the door.' You have gained [XXX] HP.\n"
				+ "Exit: South";
		exit = "South";
		monsterDefeated = true;

		// TODO: Add Health To Player.
		curMonster = "NULL";

		roomList.add(new Dungeon(description, exit, monsterDefeated, curMonster));
	}

	public static void room9() {
		description = "The door slams shut behind you and a foreboding sense of danger fills the room. Your eyes try to adjust but the darkness is too deep and you are unable to see anything within the room. However, your ears do not fail you"
				+ "and you can hear the sound of claws scratching against stone. 'So you've arrived Champion. Few of you ever make it this far and fewer still make it out of here alive. Prepare your final words!' The shrill voice of the monster"
				+ "fades away, it is soon followed by rapidly moving footsteps. Suddenly, several candles light up and you are just able to see what is running towards you.\n"
				+ "Monster: [MONSTER NAME]\n" + "Exit: West";
		exit = "West";
		monsterDefeated = false;
		curMonster = "NULL";

		roomList.add(new Dungeon(description, exit, monsterDefeated, curMonster));
	}

	public static void room10() {
		description = "Broken, beaten and sore, you make your way into the next room. As you do, you realize that you are back where it all started. The same circle where you fought your first creature lies before you. This time though, something else"
				+ "is inside of it. As you approach, your eyes begin to focus. The light reflects off as whatever stands in the middle shines brightly. Finally, as you make it to the center, you find a golden weapon and set of armour before you. "
				+ "'Congratulations, for you are now a Hero. Before you lies the ancient weapons and armor of all the Heroes before you. Gather them now Hero, for the fate of the world rests on your shoulders.'";
		exit = "South";
		curMonster = "NULL";

		roomList.add(new Dungeon(description, exit, monsterDefeated, curMonster));
	}

	public static void loadRoom(int curRoom) {
		switch (curRoom) {

		case 1:
			room1();
			break;

		case 2:
			room2();
			break;

		case 3:
			room3();
			break;

		case 4:
			room4();
			break;

		case 5:
			room5();
			break;

		case 6:
			room6();
			break;

		case 7:
			room7();
			break;

		case 8:
			room8();
			break;

		case 9:
			room9();
			break;

		case 10:
			room10();
			break;

		}
	}

	public String toString() {
		String retString = getDescription();

		return retString;
	}

	public String getDescription() {
		return description;
	}

	public String getExit() {
		return exit;
	}

	public static ArrayList<Dungeon> getRoomList() {
		return roomList;
	}

	public int getCurRoom() {
		return curRoom;
	}

	public void setDescription(String description) {
		Dungeon.description = description;
	}

	public void setExit(String exit) {
		Dungeon.exit = exit;
	}

	public void setRoomList(ArrayList<Dungeon> roomList) {
		Dungeon.roomList = roomList;
	}

	public void setCurRoom(int curRoom) {
		Dungeon.curRoom = curRoom;
	}

}