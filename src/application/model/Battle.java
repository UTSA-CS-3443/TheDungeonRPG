package application.model;
import java.util.ArrayList;
import java.util.Random;

import application.Main;

import java.util.*;

public class Battle {
	public static int health =100;
	static Random rand = new Random();
	
	public static boolean attack(Player player,Player Monster)
	{
		
		if((rand.nextInt()%10) <=5)
		{
			Main.monster.currHealth-=20;
			//monster take  1/2 damage 
		}
		if((rand.nextInt()%10) >=5 && rand.nextInt()  <7)
		{
			Main.monster.currHealth-=25;
			//monster takes 25 damage
		}
		else {
			Main.playerChar.currHealth-=15;
			//player takes damage
			//monster takes no damage
		}
		if(Main.monster.currHealth<=0)
		{ Main.playerChar.level+=1;
			return true;
		}
		else
			return false;
	}
	public static void defend(Player player,Player Monster)
	{
		{
			
			if((rand.nextInt()%10) <=5)
			{
				Main.playerChar.currHealth=Main.playerChar.currHealth;
			}
			if((rand.nextInt()%10) >=5 && rand.nextInt()  <7)
			{
				Main.playerChar.currHealth=Main.playerChar.currHealth-2;
			}
			else {
				Main.monster.currHealth=Main.monster.currHealth-3;
			}
		}
	}
	public static void ability(Player player,Player Monster)
	{
		
	}
	//dont know if they want to take damage from running but its available just in case.
	public static void run(Player player,Player Monster)
	{
		{
			
			if((rand.nextInt()%10) <=5)
			{
				Main.playerChar.currHealth=Main.playerChar.currHealth;
			}
			if((rand.nextInt()%10) >=5 && rand.nextInt()  <7)
			{
				Main.playerChar.currHealth=Main.playerChar.currHealth-50;
			}
			else {
				Main.playerChar.currHealth=Main.playerChar.currHealth-15;
			}
		}
		
	}
	
	

}