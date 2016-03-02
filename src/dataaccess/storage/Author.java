package dataaccess.storage;

import java.io.Serializable;

public class Author extends Person implements Serializable {

	public Author(String firstName, String lastName, String telephone, String credentials, String shortBio/*, Role role*/,
			Address address) {
		super(firstName,lastName,telephone,credentials,shortBio/*,role*/,address);
	
	}
	


}
