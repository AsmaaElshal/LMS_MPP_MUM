package business;

import java.io.IOException;

import javafx.fxml.FXMLLoader;

public class ViewController {
	
	private static MainController mainController;
	
	 public static void setMainController(MainController mainController) {
		 ViewController.mainController = mainController;
	 }
	 
	 public static void loadView(String fxml) {
        try {
            mainController.setView(
                FXMLLoader.load(
                		ViewController.class.getResource(
                        fxml
                    )
                )
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
