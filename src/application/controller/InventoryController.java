package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InventoryController implements EventHandler<ActionEvent> {

	@FXML private TextField playerName;
	@FXML private TextField curLevel;
    @FXML private TextField curHP;
    @FXML private TextField curExp;
    @FXML private TextField nextLevel;
    
    @FXML private Button item1;
    @FXML private Button item2;
    @FXML private Button item3;
    @FXML private Button item4;
    @FXML private Button item5;
    @FXML private Button item6;
    @FXML private Button item7;
    @FXML private Button item8;
    @FXML private Button item9;
    @FXML private Button item10;

    @FXML void item1Pressed(ActionEvent event) {
    	//Do Something
    	
    	//Return To Battle
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

    @FXML void item2Pressed(ActionEvent event) {
//Do Something
    	
    	//Return To Battle
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

    @FXML void item3Pressed(ActionEvent event) {
    	//Do Something
    	
    	//Return To Battle
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

    @FXML void item4Pressed(ActionEvent event) {
    	//Do Something
    	
    	//Return To Battle
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

    @FXML void item5Pressed(ActionEvent event) {
    	//Do Something
    	
    	//Return To Battle
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
    
    @FXML void item6Pressed(ActionEvent event) {
    	//Do Something
    	
    	//Return To Battle
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
    
    @FXML void item7Pressed(ActionEvent event) {
    	//Do Something
    	
    	//Return To Battle
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
    
    @FXML void item8Pressed(ActionEvent event) {
    	//Do Something
    	
    	//Return To Battle
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
    
    @FXML void item9Pressed(ActionEvent event) {
    	//Do Something
    	
    	//Return To Battle
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

    @FXML void item10Pressed(ActionEvent event) {
    	//Do Something
    	
    	//Return To Battle
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

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}