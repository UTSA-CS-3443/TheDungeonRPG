package application.model;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Battle {
	public static int health =100;
	static Random rand = new Random();
	
	public static boolean attack(Player player,Player Monster)
	{
		
		if((rand.nextInt()%10) <=5)
		{
			Monster.health-=20;
			//monster take  1/2 damage 
		}
		if((rand.nextInt()%10) >=5 && rand.nextInt()  <7)
		{
			Monster.health-=25;
			//monster takes 25 damage
		}
		else {
			player.health-=15;
			//player takes damage
			//monster takes no damage
		}
		if(Monster.health<=0)
		{ player.level+=1;
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
				player.health=player.health;
			}
			if((rand.nextInt()%10) >=5 && rand.nextInt()  <7)
			{
				player.health=player.health-2;
			}
			else {
				Monster.health=Monster.health-3;
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
				player.health=player.health;
			}
			if((rand.nextInt()%10) >=5 && rand.nextInt()  <7)
			{
				player.health=player.health-50;
			}
			else {
				player.health=player.health-15;
			}
		}
		
	}
	
	

}