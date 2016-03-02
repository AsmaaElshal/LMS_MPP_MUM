package dataaccess.storage;

import java.io.Serializable;
import java.util.Date;

public class CheckoutEntry implements Serializable{
	
	BookCopy bookCopy;
	Date checkoutDate;
	Date dueDate;
	
	public CheckoutEntry(BookCopy bookCopy, Date checkoutDate, Date dueDate){
		this.bookCopy = bookCopy;
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
	}

	public BookCopy getBookCopy() {
		return bookCopy;
	}

	

	public Date getCheckoutDate() {
		return checkoutDate;
	}

	
	public Date getDueDate() {
		return dueDate;
	}

	
	
	

}
