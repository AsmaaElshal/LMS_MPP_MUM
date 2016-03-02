package business;



import java.io.IOException;

import dataaccess.DataAccess;
import dataaccess.DataAccessSingleton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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
		//int id=Integer.parseInt(memberId.getText());
	//	dataAccess.setMemberId(id);
		
	/*	Stage stage=(Stage) bViewCheckoutDetails.getScene().getWindow();
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(Resource.CheckOutRecordHistoryView)); 
			Parent root = fxmlLoader.load();//FXMLLoader.load(getClass().getResource(Resource.CheckOutRecordHistoryView));
			CheckoutRecordHistoryController controller = fxmlLoader.getController();
	        controller.initialize(memberId.getText());

			Scene scene=new Scene(root);
			stage.setScene(scene);
			stage.show();
			
			
			
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		ViewController.loadView(Resource.CheckOutRecordHistoryView);
		
	}
	

}
