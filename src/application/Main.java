package application;
	
import application.model.Inventory;
import application.model.Player;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Main extends from Application to create the initial view of the program.
 * 
 * @author Matthew House (otw480)
 *
 */

public class Main extends Application {
	
	public static Stage stage;
	//Added by Patrick
	//Global player for ease of manipulation. Probably should be placed somewhere better though.
	public static Player playerChar = new Player("Placeholder", "noClass", 0, 0, 0, 0, 0, 0, null);

	
	@Override
	public void start(Stage primaryStage) {
		
		try {
			Parent root = FXMLLoader.load(getClass().getResource( "view/Main.fxml" ));
			
			primaryStage.setScene( new Scene( root, 800, 800 ) );
			primaryStage.setTitle( "The Dungeon RPG - Start" );
			primaryStage.show();
			
			stage = primaryStage;
			
		} 
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}