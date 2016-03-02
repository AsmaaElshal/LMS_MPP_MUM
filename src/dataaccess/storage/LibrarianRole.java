package dataaccess.storage;

import java.io.Serializable;

public class LibrarianRole implements Role,Serializable{
	
	String role;
	
	public LibrarianRole() {
		this.role="LIBRARIAN";
	}

}
