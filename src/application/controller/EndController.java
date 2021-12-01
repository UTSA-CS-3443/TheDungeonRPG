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
import javafx.scene.text.Text;

public class EndController implements EventHandler<ActionEvent>, Initializable {

	@FXML
	private Label statusText;
	
	@FXML ImageView background;
	
	@FXML Button retryButton;

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
	
	@FXML void handleRetry(ActionEvent event) {
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

	@Override
	public void handle(ActionEvent event) {
		// TODO Auto-generated method stub
		
	}
}
