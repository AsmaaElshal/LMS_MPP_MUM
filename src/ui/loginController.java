package ui;
 
 
import java.io.IOException;
import java.util.Hashtable;
import java.util.UUID;

import dataaccess.DataAccessFacade;
import dataaccess.DataAccessSingleton;
import dataaccess.FileSerialization;
import dataaccess.storage.Librarian;
import dataaccess.storage.LibraryMember;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class loginController {
	     
	
	@FXML
    TextField userNameField ;
	@FXML
	PasswordField passwordField ; 
	@FXML 
	 Button btnLogin ;  

	String librarian = "Librarian" ; 

	String admin = "Admin" ; 
	String both = "Both" ; 

	Stage stage;
	Parent root;
	@FXML
	void Login(ActionEvent event) throws Exception 
	{
		FileSerialization.deSerializeData();
		for(Librarian lib : DataAccessSingleton.getDataAccess().getLibrarians().values()){
			   System.out.println(lib.getFirstName() + " " + lib.getLastName());
			   System.out.println(lib.userName );
			   
			   if ((lib.userName).equals(userNameField.getText().toString())   )
			   {
				   System.out.println("Loginggggggggggggggg");
			   		goToNextScene(event );
			   	} 
			  }
		 
	}
	
		void goToNextScene(ActionEvent event) throws Exception
		{
	    	stage = (Stage) btnLogin.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource(Screens.AddMember));
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();
		}
	
	

}
