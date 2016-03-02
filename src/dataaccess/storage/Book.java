package dataaccess.storage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Book implements Serializable {

	String ISBN;
	List<BookCopy> bookCopies;
	String title;
	int maxCheckoutLength;
	List<Author> authors;
	
	public Book(String isbn, String title, int maxCheckoutLength, Author author){
		this.ISBN = isbn;
		this.title = title;
		this.maxCheckoutLength = maxCheckoutLength;
		bookCopies = new ArrayList<>();
		authors = new ArrayList<>();
		authors.add(author);
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getISBN() {
		return ISBN;
	}

	public List<BookCopy> getBookCopies(){
		return bookCopies;
	}
	public void setBookCopies(List<BookCopy> bookCopies) {
		this.bookCopies = bookCopies;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMaxCheckoutLength() {
		return maxCheckoutLength;
	}
	public void setMaxCheckoutLength(int maxCheckoutLength) {
		this.maxCheckoutLength = maxCheckoutLength;
	}
	
	public List<Author> getAuthors() {
		return authors;
	}
	
	public void addAuthor(Author author) {
		this.authors.add(author);
	}
	
	
	public void addBookCopy(BookCopy bc)
	{
		bookCopies.add(bc);
	}
	
	public BookCopy[] addNumberOfCopies(int n) {
        if (n < 1) {
            return null;
        }
        BookCopy[] arr = new BookCopy[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new BookCopy();
            bookCopies.add(arr[i]);
        }
        return arr;
    }
	
	

}
