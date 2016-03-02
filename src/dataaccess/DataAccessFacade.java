package dataaccess;

import dataaccess.storage.*;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.UUID;
import java.io.Serializable;

public class DataAccessFacade implements DataAccess, Serializable{
	
	private Hashtable<String, LibraryMember> members;
	private Hashtable<String, Librarian> librarians;
    private Hashtable<String, Book> books;
    private Hashtable<UUID, BookCopy> copies;
    
	public DataAccessFacade(){
		members = new Hashtable<>();
		librarians = new Hashtable<>();
		books = new Hashtable<>();
		copies = new Hashtable<>();
	}
	
    public Hashtable<UUID, BookCopy> getCopies() {
        return copies;
    }
    
    public Hashtable<String, Librarian> getLibrarians() {
		return librarians;
	}


	public Hashtable<String, Book> getBooks() {
        return books;
    }

    public Hashtable<String, LibraryMember> getMembers() {
        return members;
    }
    
    public void addMember(LibraryMember member) {
        members.put(member.getMemberId(), member);
    }
    
	public void addLibrarian(Librarian librarian) {
		librarians.put(librarian.getUsername(), librarian);
	}
	
    public void addBook(Book book) {
        books.put(book.getISBN(), book);
    }

    public BookCopy[] addCopy(Book book, int numberOfCopies) {
        BookCopy[] arr = book.addNumberOfCopies(numberOfCopies);
        for (BookCopy c : arr) {
            copies.put(c.getId(), c);
        }
        return arr;
    }

	@Override
	public LibraryMember getLibraryMemberById(String id) {
		// TODO Auto-generated method stub
		LibraryMember libraryMember = members.get(id);
		
		return libraryMember;
	}

	@Override
	public Hashtable<String, LibraryMember> getLibraryMember() {
		// TODO Auto-generated method stub
		return members;
	}

	@Override
	public List<BookCopy> getAvailableBookCopy(String isbn) {
		// TODO Auto-generated method stub

		List<BookCopy> copies = new ArrayList<BookCopy>();
		for(Book book:books.values()){
			if(book.getISBN().equals(isbn)){
				copies = book.getBookCopies();
			}
		}
		
		return copies;
	}

	
	

}
    

	

