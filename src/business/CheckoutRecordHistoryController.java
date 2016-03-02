package business;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ResourceBundle;

import dataaccess.DataAccess;
import dataaccess.DataAccessSingleton;
import dataaccess.storage.BookCopy;
import dataaccess.storage.CheckoutEntry;
import dataaccess.storage.CheckoutRecord;
import dataaccess.storage.LibraryMember;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.control.TableView;
import javafx.util.Callback;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;

public class CheckoutRecordHistoryController/* implements Initializable */{
		
	DataAccess access=DataAccessSingleton.getDataAccess();


	@FXML
	TableView<CheckoutEntry> tableViewHistory;
	
	@FXML
	TableColumn<BookCopy,String> copyNum;
	
	@FXML
	TableColumn<CheckoutEntry,String> issueDate;
	
	@FXML
	TableColumn<CheckoutEntry,String> dueDate;
	
	@FXML
	Button btngoBack;

	public void initialize(String memberId) {
		System.out.println("Inside initialize");
		// TODO Auto-generated method stub
	///	String memberId=
	    LibraryMember libraryMember=access.getLibraryMemberById(memberId);
	    System.out.println("library member found"+libraryMember.getFirstName());
	    CheckoutRecord record=libraryMember.getCheckoutRecord();
	    System.out.println("checkout record found for this library member"+record.getCheckoutEntries().get(0));
	ArrayList<CheckoutEntry> entries= (ArrayList<CheckoutEntry>) record.getCheckoutEntries();
		//A list that allows listeners to track changes when they occur.
		ObservableList<CheckoutEntry> datas=FXCollections.observableArrayList();
		for(CheckoutEntry cre:entries)
		{
			System.out.println("Adding in datas");
			datas.add(cre);
		}
		
		tableViewHistory.setItems(datas);
		
		copyNum.setCellValueFactory(new Callback<CellDataFeatures<BookCopy, String>, ObservableValue<String>>() {
	   	     public ObservableValue<String> call(CellDataFeatures<BookCopy, String> p) {
	   	         String rState = p.getValue().getId().toString();
	   	         return new SimpleStringProperty(rState);
	   	  }
	   	  });
		
		issueDate.setCellValueFactory(new PropertyValueFactory<CheckoutEntry,String>("checkoutDate"));
		dueDate.setCellValueFactory(new PropertyValueFactory<CheckoutEntry,String>("dueDate"));
		
		
	}
		
		
		
		
		/*copyNum.setCellValueFactory(new Callback<CellDataFeatures<BookCopy, String>, ObservableValue<String>>() {
	   	     public ObservableValue<String> call(CellDataFeatures<BookCopy, String> p) {
	   	         String rState = p.getValue().getId().toString();
	   	         return new SimpleStringProperty(rState);
	   	     }
	   	  });
		
		issueDate.setCellValueFactory(new PropertyValueFactory<CheckoutEntry,String>("checkoutDate"));
		dueDate.setCellValueFactory(new PropertyValueFactory<CheckoutEntry,String>("dueDate"));*/
		
		//copyNum.setCellValueFactory(value);
	
	
	
	
	@FXML
    void goBack(ActionEvent event) throws IOException {
    	
    	Stage stage = (Stage) btngoBack.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource(Resource.CheckOutRecordView));
		Scene scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();

    }
	
	
	
	
	
}
