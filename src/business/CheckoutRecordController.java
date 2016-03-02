package business;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import dataaccess.storage.Book;
//import business.Book;
import dataaccess.storage.BookCopy;
import dataaccess.storage.CheckoutEntry;
import dataaccess.storage.CheckoutRecord;
import dataaccess.storage.LibraryMember;
import dataaccess.DataAccess;
import dataaccess.DataAccessSingleton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class CheckoutRecordController {
	DataAccess dataAccess=DataAccessSingleton.getDataAccess();
	@FXML
	TextField memberId;
	@FXML
	TextField bookISBN;
	@FXML
	Button btnAddCheckoutEntry;
	@FXML
	Button btnBackToMain;
	@FXML
	private Text actiontarget;
	
	@FXML
	void addCheckoutRecord(ActionEvent event)
	{
		String id=memberId.getText();
		System.out.println(id);
		String isbn=bookISBN.getText();
		
		boolean bookCopyFound=false;
		boolean libraryMemberFound=false;
		
		//Book book=null;
		List<BookCopy> copies=null;
		
		copies=dataAccess.getAvailableBookCopy(isbn);
		LibraryMember libraryMember=null;
		libraryMember=getLibraryMemberById(id);
		
		if(copies!=null)
		{
			bookCopyFound=true;
		}
		else
		{
			
			System.out.println("Book Not Available");
			//actiontarget.setText("Book is not available");
			/*Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Information Dialog");
	    	alert.setHeaderText("Fail");
	    	alert.setContentText(" Book Not Available !");
	    	alert.showAndWait();
	    	return;*/
		}
		
		if(libraryMember!=null)
		{
			libraryMemberFound=true;
		}
		else
		{
			System.out.println("Member Not Found !");
			/*Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Information Dialog");
	    	alert.setHeaderText("Fail");
	    	alert.setContentText(" Member Not Available !");
	    	alert.showAndWait();
	    	return;*/
		}
		
		if(bookCopyFound && libraryMemberFound)
		{
			CheckoutRecord checkoutRecord=libraryMember.getCheckoutRecord();
			
			if(checkoutRecord==null)
			{
				checkoutRecord=new CheckoutRecord();
			}
			
			List<CheckoutEntry> entries=checkoutRecord.getCheckoutEntries();
			
			//Get first available copy
			BookCopy checkoutCopy = null;
			for(BookCopy copy:copies){
				if(copy.isAvailable() == true){
					checkoutCopy = copy;
				}
			}
			
			if(checkoutCopy == null){
				//No Copy for Checkout
				System.out.println("ISBN is not found!");
				return;
			}
			
			CheckoutEntry entry=new CheckoutEntry(checkoutCopy,new Date(),new Date());
			
			entries.add(entry);
			
			checkoutCopy.setAvailable(false);

			
			//actiontarget.setText("Book Checkout successful !");
			System.out.println("Book Checkout successful ");
			
			/*Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setTitle("Information Dialog");
	    	alert.setHeaderText("Success");
	    	alert.setContentText(" Book Checkout successful !");
	    	alert.showAndWait();*/
			
		}
	}
	
	public LibraryMember getLibraryMemberById(String id) {
		// TODO Auto-generated method stub
		LibraryMember libraryMember=null;
	//	HashMap<Integer, LibraryMember> libraryMembers=getLibraryMember();
		for(LibraryMember member:DataAccessSingleton.getDataAccess().getLibraryMember().values()){
			if(member.getMemberId().equals(id)){
				libraryMember = member;
			}
		}
		
	//	libraryMember=libraryMembers.get(id);
		
		return libraryMember;
	}

	
	@FXML
	
	void goBack(ActionEvent event)
	{
		
	}

}
