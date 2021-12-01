package application.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;

public class EndController implements Initializable {

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
}
