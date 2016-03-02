package business;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private Button btnAddCopies;
	
	@FXML
	private AnchorPane viewHolder;
	
	@FXML
    void addBookCopies(ActionEvent event) throws IOException {  
	/*	Stage stage = (Stage) btnAddCopies.getScene().getWindow();
		FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(ViewController.MAIN_UI));
        BorderPane rootLayout = (BorderPane) loader.load();
        Scene scene = new Scene(rootLayout);
        scene.getStylesheets().add(getClass().getResource(Main.CSS).toExternalForm());
        stage.getIcons().add(new Image(Main.APP_ICON));
        stage.setTitle("Library Management System");
        stage.setScene(scene);
        stage.show();
        
        FXMLLoader viewLoader = new FXMLLoader();
        viewLoader.setLocation(getClass().getResource(ADD_COPY_UI));
        AnchorPane personOverview = (AnchorPane) viewLoader.load();
        // Set person overview into the center of root layout.
        rootLayout.setCenter(personOverview);	*/
		  ViewController.loadView(Resource.AddBookCopy);
        
        }
	
	public void setView(Node node) {
		viewHolder.getChildren().setAll(node);
    }
}
