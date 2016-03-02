package business;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {
	@FXML
	private Button btnAddBookCopy;
	
	@FXML
	private Button btnViewCheckoutRecord;
	
	@FXML
    void addBookCopies(ActionEvent event) throws IOException {    
		ViewController.loadView(Resource.AddBookCopy);
	}
	
	@FXML
    void viewCheckoutRecord(ActionEvent event) throws IOException {  
		ViewController.loadView(Resource.CheckOutRecordView);
	}
}
