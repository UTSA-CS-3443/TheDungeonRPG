package application.controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

/**
 * MainController is a Java class that is the controller for the Main JavaFX scene.
 * 
 * @author Matthew House and Team
 * UTSA CS 3443 - Lab 6
 * Fall 2021
 */
public class MainController implements EventHandler<ActionEvent> {

    @FXML
    private Button startButton;
    
	/**
	 * Method called when Button startButton is pressed.
	 * 
	 * @param event - ActionEvent generated when Button startButton is pressed.
	 */
    @FXML
    public void startButtonPressed(ActionEvent event) {
    	try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Create.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.setTitle("The Dungeon RPG - Character Creation");
			Main.stage.show();
			
		} 
    	
    	catch(Exception e) {
			e.printStackTrace();
		}
    }
    
    //Javadoc auto-populated due to @Override tag
	/**
	 * 
	 */
	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}

}