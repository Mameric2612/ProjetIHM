package ch.makery;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller {
	public void LienMagazine(ActionEvent event) throws IOException{
			
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Magazines.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
			
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void LienAtelier(ActionEvent event) throws IOException{
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Atelier.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
			
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void LienOutils(ActionEvent event) throws IOException{
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Outils.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
			
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void LienAccueil(ActionEvent event) throws IOException{
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Accueil2.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
			
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	
		window.setScene(tableViewScene);
		window.show();
	}
}
