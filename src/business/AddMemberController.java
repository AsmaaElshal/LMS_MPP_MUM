package business;

import dataaccess.DataAccessSingleton;
import dataaccess.FileSerialization;
import dataaccess.storage.Address;
import dataaccess.storage.AdministratorRole;
import dataaccess.storage.Librarian;
import dataaccess.storage.LibrarianRole;
import dataaccess.storage.LibraryMember;
import dataaccess.storage.Role;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AddMemberController {
	@FXML
	TextField memberIDField ; 
	@FXML
	TextField fNameField ; 
	@FXML
	TextField lNameField ; 
	@FXML
	TextField streetField ;
	@FXML
	TextField cityField ;
	@FXML
	TextField stateField ;
	@FXML
	TextField zipField ;
	@FXML
	TextField telephoneField ; 
	@FXML
	void AddMemeber()
	{
		String id = memberIDField.getText() ; 
		String firstName = fNameField.getText() ; 
		String lastName = lNameField.getText() ; 
		String street = streetField.getText() ;
		String city = cityField.getText() ; 
		String state = stateField.getText() ; 
		String zip = zipField.getText() ;
		String telephone = telephoneField.getText() ;
		

		FileSerialization.deSerializeData();
		Address address =  new Address(street, city, state, zip) ; 
		LibraryMember member = new LibraryMember(id ,firstName, lastName, telephone, "", "", address);
		
		DataAccessSingleton.getDataAccess().addMember(member);

		for(LibraryMember mem : DataAccessSingleton.getDataAccess().getMembers().values()){
			   System.out.println(mem.getFirstName() + " " + mem.getLastName());
			  }
		 
		
		 
		
		
	}
	
	
	
	

}
