package application;

import application.model.Player;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Main is the Java class that contains the start() method to run the program and the related JavaFX code, as well as the main() method.
 *
 * @author Matthew House and Team
 * UTSA CS 3443 - Lab 6
 * Fall 2021
 */
public class Main extends Application {

	public static Stage stage;

	// Updates if player wins or loses the game
	public static String status = "";

	// Global Player and Monster Objects
	public static Player playerChar = new Player("Placeholder", "noClass", 10, 10, 1, 0, 0, 0, 0, 0, null);
	public static Player monster = new Player("Placeholder", "noClass", 10, 10, 0, 0, 0, 0, 0, 0, null);
	
    //Javadoc auto-populated due to @Override tag
	/**
	 * 
	 */
	@Override
	public void start(Stage primaryStage) {

		try {
			Parent root = FXMLLoader.load(getClass().getResource("view/Main.fxml"));

			primaryStage.setScene(new Scene(root, 800, 800));
			primaryStage.setTitle("The Dungeon RPG - Start");
			primaryStage.show();

			stage = primaryStage;

		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Main method.
	 * 
	 * @param args - Java command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
