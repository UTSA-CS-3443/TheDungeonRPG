package application.model;

public class Player {
	
	
	public static Player player =new Player("Player Name");
	public static Player monster =new Player("Monster");
	public int health;
	public static int level=0;
	public String name;
	public  Player(String userName)
	{
		this.name=userName;
		this.health=100;
		this.level=0;
		
		
		
	}
}