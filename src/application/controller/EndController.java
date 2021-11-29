package application.controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class EndController implements Initializable {

	@FXML
	private Label statusText;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		if (Main.status.equals("Victory"))
			statusText.setText("Victory!");

		else
			statusText.setText("Defeat!");

	}
}
