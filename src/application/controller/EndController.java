package application.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Paint;

/**
 * End is a Java class that is the controller for the End JavaFX scene.
 * 
 * @author Matthew House, Patrick Jenkins, and Team
 * UTSA CS 3443 - Lab 6
 * Fall 2021
 */
public class EndController implements EventHandler<ActionEvent>, Initializable {

	@FXML
	private Label statusText;
	
	@FXML
	private ImageView background;
	
	@FXML
	private Button retryButton;
	
    //Javadoc auto-populated due to @Override tag
    /**
     * 
     */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Image picture;
		
		if (Main.status.equals("Victory")) {
			FileInputStream input;

			try {
				input = new FileInputStream("src/images/victory.png");
				picture = new Image(input);
				statusText.setText("Defeat!");	
				statusText.setText("Victory!");
				statusText.setTextFill( Paint.valueOf("#faf402"));
				background.setImage(picture);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


		else {
			FileInputStream input;

			try {
				input = new FileInputStream("src/images/graveyard.png");
				picture = new Image(input);
				statusText.setText("Defeat!");	
				background.setImage(picture);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Method called when Button retryButton is pressed.
	 * 
	 * @param event - ActionEvent generated when Button retryButton is pressed.
	 */
	@FXML
	public void handleRetry(ActionEvent event) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("../view/Main.fxml"));
			Main.stage.setScene(new Scene(root, 800, 800));
			Main.stage.setTitle("The Dungeon RPG - The Dungeon");
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
