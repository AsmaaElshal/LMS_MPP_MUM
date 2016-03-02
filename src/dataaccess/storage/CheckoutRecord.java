package dataaccess.storage;

import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;;

public class CheckoutRecord implements Serializable{
	List<CheckoutEntry> checkoutEntries;

	public CheckoutRecord(){
		checkoutEntries = new ArrayList<>();
	}
	
	public void addCheckoutEntry(CheckoutEntry entry){
		checkoutEntries.add(entry);
	}
	
	public List<CheckoutEntry> getCheckoutEntries() {
		return checkoutEntries;
	}
	
}
