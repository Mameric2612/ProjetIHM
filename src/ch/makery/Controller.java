package ch.makery;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Controller{
	
	@FXML private Pane WebViewer;
			
	@FXML
	public void LienMagazine(ActionEvent event) throws IOException{
			
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Magazines.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
			
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	
		window.setScene(tableViewScene);
		window.show();
	}
	
	@FXML
	public void LienAtelier(ActionEvent event) throws IOException{
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Atelier.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
			
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	
		window.setScene(tableViewScene);
		window.show();
	}
	
	@FXML
	public void LienOutils(ActionEvent event) throws IOException{
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Outils.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
			
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	
		window.setScene(tableViewScene);
		window.show();
	}
	
	@FXML
	public void LienAccueil(ActionEvent event) throws IOException{
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Accueil2.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
			
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	
		window.setScene(tableViewScene);
		window.show();
	}
	
	@FXML
	public void ArticleCulture1(ActionEvent event) throws IOException{
		LienArticle("http://www.bbc.com/culture/story/20181210-art-made-by-ai-is-selling-for-thousands-is-it-any-good", event);
	}
	
	@FXML
	public void ArticleCulture2(ActionEvent event) throws IOException{
		LienArticle("http://www.bbc.com/culture/story/20181207-the-3bn-art-collection-hidden-in-vaults", event);
	}
	
	@FXML
	public void ArticleCulture3(ActionEvent event) throws IOException{
		LienArticle("https://www.wired.com/story/marvel-comics-genius-stan-lee-outcasts-heroes/", event);
	}
	
	@FXML
	public void ArticleScience1(ActionEvent event) throws IOException{
		LienArticle("https://www.americanscientist.org/blog/science-culture/neanderthals-in-prime-time", event);
	}
	
	@FXML
	public void ArticleScience2(ActionEvent event) throws IOException{
		LienArticle("https://www.americanscientist.org/blog/from-the-staff/the-giant-tadpole-that-never-got-its-legs", event);
	}
	
	@FXML
	public void ArticleSport1(ActionEvent event) throws IOException{
		LienArticle("https://edition.cnn.com/2018/12/12/sport/team-sky-sponsorship-sky-gbr-intl-spt/index.html", event);
	}
	
	@FXML
	public void ArticleSport2(ActionEvent event) throws IOException{
		LienArticle("https://edition.cnn.com/2018/12/12/sport/hines-ward-nfl-reflections-after-week-14-spt-intl/index.html", event);
	}
	
	
	public void LienArticle(String lien, ActionEvent event) throws IOException{
		
		WebView myWebView = new WebView();
		WebEngine engine = myWebView.getEngine();
		engine.load(lien);
		VBox root = new VBox();
		root.getChildren().addAll(myWebView);
		
		Scene tableViewScene =new  Scene(root);
		Stage stage = new Stage();
		stage.setScene(tableViewScene);
        stage.initModality(Modality.APPLICATION_MODAL);
        
        stage.show();
	}
	
	@FXML
	public void LienLexique(ActionEvent event) throws IOException{

		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/Lexique.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage stage = new Stage();
		stage.setScene(tableViewScene);
        stage.initModality(Modality.APPLICATION_MODAL);
        
        stage.show();
	}
	
	@FXML
	public void FermerLexique(ActionEvent event) throws IOException{
		((Node)(event.getSource())).getScene().getWindow().hide();
	}
	
	@FXML
	public void LienVerbe(ActionEvent event) throws IOException{

		Parent tableViewParent=FXMLLoader.load(getClass().getResource("view/VerbesIrreguliers.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage stage = new Stage();
		stage.setScene(tableViewScene);
        stage.initModality(Modality.APPLICATION_MODAL);
        
        stage.show();
	}
	
	

}
