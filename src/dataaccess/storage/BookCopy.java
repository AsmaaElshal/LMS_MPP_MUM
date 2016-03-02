package dataaccess.storage;

import java.io.Serializable;
import java.util.UUID;

public class BookCopy implements Serializable{
	
	UUID id;
	boolean isAvailable;
	
	public BookCopy(){
		this.isAvailable = true;
		this.id = UUID.randomUUID(); 
	}
	
	public UUID getId(){
		return id;
	}

	
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


}
