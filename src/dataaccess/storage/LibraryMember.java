package dataaccess.storage;
import java.io.Serializable;

public class LibraryMember extends Person implements Serializable{
	
	CheckoutRecord checkOutRecord;
	String memberId;
	
	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public LibraryMember(String memberId, String firstName, String lastName, String telephone, String credentials, String shortBio,
			Address address){
		super(firstName,lastName,telephone,credentials,shortBio,address);
		this.memberId = memberId;
	}
	
	public CheckoutRecord getCheckoutRecord(){
		return checkOutRecord;
	}

	public void setCheckoutRecord(CheckoutRecord checkOutRecord){
		this.checkOutRecord = checkOutRecord;
	}
}
