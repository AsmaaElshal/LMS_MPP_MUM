package business;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class AdminScreenController {
	@FXML 
	Button btnAddBook ; 
	@FXML
	Button addBookBtn ; 
	

	@FXML
	void addingBook()
	{
		
		 ViewController.loadView(Resource.AddBook);	
	}
	@FXML
	void addingMember()
	{
		
		  ViewController.loadView(Resource.AddMember);
	}
	@FXML
	void signingOut()
	{
		
		  ViewController.loadView(Resource.Login);
	}

}
