package ch.makery;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller {
	private WebView WebViewer;
	
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
	

	public void ArticleSport2(ActionEvent event) throws IOException{
		//LienArticle("https://edition.cnn.com/2018/12/12/sport/hines-ward-nfl-reflections-after-week-14-spt-intl/index.html", event);
	}
	
	public void LienArticle(ActionEvent event) throws IOException{
		WebView WebViewer = new WebView();
		WebEngine engine = WebViewer.getEngine();
		engine.load("https://edition.cnn.com/2018/12/12/sport/hines-ward-nfl-reflections-after-week-14-spt-intl/index.html");
		
		Pane root = new Pane();
		root.getChildren().addAll(WebViewer);
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Article.fxml"));
		
		
		Scene tableViewScene =new  Scene(tableViewParent);
			
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	
		window.setScene(tableViewScene);
		window.show();
		
	}
	
	public void GererWebView(String lien) {
		
	}
		
		

	public void LienLexique(ActionEvent event) throws IOException{
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Lexique.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage stage = new Stage();
		stage.setScene(tableViewScene);
        stage.initModality(Modality.APPLICATION_MODAL);
        
        stage.show();



	}
}
