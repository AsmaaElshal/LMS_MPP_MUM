package dataaccess.storage;

import java.io.Serializable;
import java.util.UUID;

public class Person implements Serializable{
	String firstName;
	String lastName;
	String telephone;
	String credentials;
	String shortBio;
	Address address;

	public Person(String firstName, String lastName, String telephone, String credentials, String shortBio,
			Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.credentials = credentials;
		this.shortBio = shortBio;
		this.address = address;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCredentials() {
		return credentials;
	}
	public void setCredentials(String credentials) {
		this.credentials = credentials;
	}
	public String getShortBio() {
		return shortBio;
	}
	public void setShortBio(String shortBio) {
		this.shortBio = shortBio;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
