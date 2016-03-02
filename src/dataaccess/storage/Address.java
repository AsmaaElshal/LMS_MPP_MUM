package dataaccess.storage;
import java.io.Serializable;

public class Address implements Serializable {
	
	String street;
	String city;
	String state;
	String zip;
	public Address(String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	

}
