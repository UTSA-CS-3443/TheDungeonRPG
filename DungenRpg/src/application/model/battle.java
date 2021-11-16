package application.model;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class battle {
	public static int health =100;
	static Random rand = new Random();
	
	public static void attack(String player)
	{
		
		if((rand.nextInt()%10) <=5)
		{
			health=health-10;
			//monster take  1/2 damage 
		}
		if((rand.nextInt()%10) >=5 && rand.nextInt()  <7)
		{
			health=health;
			//monster takes 25 damage
		}
		else {
			health=health-25;
			//monster takes no damage
		}
	}
	public static void defend(String player)
	{
		{
			
			if((rand.nextInt()%10) <=5)
			{
				health=health;
			}
			if((rand.nextInt()%10) >=5 && rand.nextInt()  <7)
			{
				health=health-5;
			}
			else {
				health=health-10;
			}
		}
	}
	public static void ability(String player)
	{
		
	}
	
	public static void run(String player)
	{
		{
			
			if((rand.nextInt()%10) <=5)
			{
				health=health;
			}
			if((rand.nextInt()%10) >=5 && rand.nextInt()  <7)
			{
				health=health-50;
			}
			else {
				health=health-15;
			}
		}
		
	}
	
	

}
