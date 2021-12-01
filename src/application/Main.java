package application;

import application.model.Player;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class Main extends Application {

	public static Stage stage;

	// Updates if player wins or loses the game
	public static String status = "";

	// Global Player and Monster Objects
	public static Player playerChar = new Player("Placeholder", "noClass", 10, 10, 1, 0, 0, 0, 0, 0, null);
	public static Player monster = new Player("Placeholder", "noClass", 10, 10, 0, 0, 0, 0, 0, 0, null);

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

	public static void main(String[] args) {
		launch(args);
	}
}
