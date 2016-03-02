package business;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LibrarianController {
	
	@FXML
	Button checkoutBtn ; 
	
	@FXML
	Button viewCheckoutRecord;
	
	
	@FXML
	void checkout(){
		ViewController.loadView(Resource.AddCheckOutRecord);
	}
	
	@FXML
	void viewCheckoutRecord(){
		ViewController.loadView(Resource.CheckOutRecordView);
		
	}
}
