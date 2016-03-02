package business;



import java.io.IOException;

import dataaccess.DataAccess;
import dataaccess.DataAccessSingleton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class CheckoutRecordViewController {
	DataAccess dataAccess=DataAccessSingleton.getDataAccess();
	
	@FXML
	TextField memberId;
	
	@FXML
	Button bViewCheckoutDetails;
	
	@FXML
	void displayCheckOutDetails(ActionEvent event)
	{
		
			
        try{           
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(Resource.CheckOutRecordHistoryView)); 
		Node node  = fxmlLoader.load();
		CheckoutRecordHistoryController controller = fxmlLoader.getController();
        controller.initialize(memberId.getText());
		ViewController.loadView(node);
        }catch (IOException e) {
            e.printStackTrace();
        }
		
	}
	

}
