package business;
 
 
import java.io.IOException;
import java.util.Hashtable;
import java.util.UUID;

import dataaccess.DataAccessFacade;
import dataaccess.DataAccessSingleton;
import dataaccess.FileSerialization;
import dataaccess.storage.AdministratorRole;
import dataaccess.storage.Librarian;
import dataaccess.storage.LibrarianRole;
import dataaccess.storage.LibraryMember;
import dataaccess.storage.Role;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Screen;
import javafx.stage.Stage;
import ui.ScreenManager;
import ui.ScreenManager;


public class loginController {
	     
	
	@FXML
    TextField userNameField ;
	@FXML
	PasswordField passwordField ; 
	@FXML 
	 Button btnLogin ;  
	@FXML 
	 Label statusLabel ;  

	String librarian = "Librarian" ; 
 

	Stage stage;
	Parent root;
	@FXML
	void Login(ActionEvent event) throws Exception 
	{
		String  userName = userNameField.getText().toString() ;
		String password = passwordField.getText().toString() ;
		if ( userName.isEmpty() || password.isEmpty() )
		{
			statusLabel.setText("Please Enter you User Name or Password");
		}
		else
		{
			
		//	FileSerialization.deSerializeData();
			for(Librarian lib : DataAccessSingleton.getDataAccess().getLibrarians().values()){
				   System.out.println(lib.getFirstName() + " " + lib.getLastName());
				   System.out.println(lib.userName );
				   
				   if ((lib.userName).equals(userName)  &&  (lib.password).equals(password))
				   {
					   System.out.println("Loginggggggggggggggg");	
				   		for (  Role role: lib.getRoles())
				   			if(role instanceof LibrarianRole)
				   			{
				   				statusLabel.setText("Welcome you as Librarian");
				   				goToNextScene(ScreenManager.LibrarianView);
				   			}
				   			else if(role instanceof AdministratorRole)
				   			{
				   				statusLabel.setText("Welcome you as Admin");
				   				goToNextScene(ScreenManager.AdminView);
				   			}
				   				
				   	} 
				  }
		}
		
		 
	}
	
		void goToNextScene(  String screen) throws Exception 
		{
	   /* 	stage = (Stage) btnLogin.getScene().getWindow();
			root = FXMLLoader.load(getClass().getResource(screen));
	    	Scene scene = new Scene(root);
	    	stage.setScene(scene);
	    	stage.show();*/
			ViewController.loadView(screen);
		}
	
	

}
