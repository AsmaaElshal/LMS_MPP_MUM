package dataaccess.storage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Librarian extends Person implements Serializable
{
	List<Role> roles;
	public String userName ; 
	public String password ; 
	
	
	public Librarian(String firstName, String lastName, String telephone, String credentials, String shortBio, 
			Address address,Role role , String userName ,String password) {
		super(firstName,lastName,telephone,credentials,shortBio,address);
		this.roles=new ArrayList<Role>();
		this.roles.add(role);
		this.userName = userName ; 
		this.password = password ;
     }
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void addRole(Role role){
		this.roles.add(role);
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}
	
	
}