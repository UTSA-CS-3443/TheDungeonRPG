package application.model;

public class Player {
	
	
	public static Player bob =new Player("bob");
	public int health;
	public static int level=0;
	public  Player(String userName)
	{
		this.health=100;
		this.level=0;
		
		
		
	}
}