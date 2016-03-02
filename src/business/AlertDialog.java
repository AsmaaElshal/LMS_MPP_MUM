package business;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public final class AlertDialog {
	public static void showInformationAlert(String message){
		Alert alert = new Alert(AlertType.INFORMATION);
    	alert.setTitle("Information Dialog");
    	alert.setHeaderText("Success!");
    	alert.setContentText(message);
    	alert.showAndWait();
	}
	
	public static void showErrorAlert(String message){
		Alert alert = new Alert(AlertType.ERROR);
    	alert.setTitle("Error Dialog");
    	alert.setHeaderText("Error");
    	alert.setContentText(message);
    	alert.showAndWait();
	}
}
