package dataaccess.storage;

import java.io.Serializable;

public class AdministratorRole implements Role,Serializable{
	
	String role;

	public AdministratorRole() {
		this.role = "ADMIN";
	}
	

}
