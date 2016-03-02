package ui;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Login extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//BorderPane root = new BorderPane();
			Parent root  =  FXMLLoader.load(getClass().getResource("/ui/Login.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("login.css").toExternalForm());
			
			//***
			 

	        //Reflection for gridPane
	        Reflection r = new Reflection();
	        r.setFraction(0.7f);
	        
	        GridPane  gridPane = (GridPane) root.lookup("#gridPane" );
	        gridPane.setEffect(r);
	        
	        
			//***
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
