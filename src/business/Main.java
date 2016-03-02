package business;
	

import java.io.IOException;

import dataaccess.FileSerialization;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;



public class Main extends Application {



    
	@Override
	public void start(Stage primaryStage) throws Exception{
	/*	try{
			FXMLLoader loader = new FXMLLoader();
	        loader.setLocation(getClass().getResource(Main.ROOT_UI));
	        BorderPane rootLayout = (BorderPane) loader.load();
	        Scene scene = new Scene(rootLayout);
	        scene.getStylesheets().add(getClass().getResource(Main.CSS).toExternalForm());
	        primaryStage.getIcons().add(new Image(Main.APP_ICON));
	        primaryStage.setTitle("Library Management System");
	        primaryStage.setScene(scene);
	        primaryStage.show();
	        
	        FXMLLoader viewLoader = new FXMLLoader();
	        viewLoader.setLocation(getClass().getResource(MAIN_UI));
	        AnchorPane personOverview = (AnchorPane) viewLoader.load();
	        // Set person overview into the center of root layout.
	        rootLayout.setCenter(personOverview);
	        
			FileSerialization.deSerializeData();
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		primaryStage.getIcons().add(new Image(Resource.AppIcon));
		primaryStage.setTitle("Libary Management System");
		primaryStage.setScene(
	            createScene(
	                loadMainPane()
	            )
	        );

		primaryStage.show();
		FileSerialization.deSerializeData();
	}
    
	private Pane loadMainPane() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Pane mainPane = (Pane) loader.load(
            getClass().getResourceAsStream(
            		Resource.Main
            )
        );

        MainController mainController = loader.getController();
        ViewController.setMainController(mainController);
        ViewController.loadView(Resource.Login);

        return mainPane;
    }

    private Scene createScene(Pane mainPane) {
        Scene scene = new Scene(
            mainPane
        );

        scene.getStylesheets().setAll(
            getClass().getResource(Resource.CSS).toExternalForm()
        );

        return scene;
    }
    
	public static void main(String[] args) {
		launch(args);
	}
}
