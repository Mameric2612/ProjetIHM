package application;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;

public class ChangerPage implements Initializable {

	private AnchorPane rootPane;
	
	public void initialize(URL url, ResourceBundle rb){}
	
	private void chargerMagazines(ActionEvent event) throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("view/Magazines.fxml"));
		rootPane.getChildren().setAll(pane);
	}
	
}
