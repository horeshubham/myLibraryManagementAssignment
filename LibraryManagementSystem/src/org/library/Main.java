package org.library;

import org.library.book.Book;
import org.library.book.BookManager;
import org.library.patron.Patron;
import org.library.patron.PatronManager;

public class Main {
	public static void main(String[] args) {
		BookManager bookManager=new BookManager();
		PatronManager patronManager=new PatronManager();
		Book book1=new Book(1,"Java","JavaWriter");
		Book book2 =new Book(2,"AdvanceJava","AdvWriter"); 
		bookManager.addBook(book1);
		bookManager.addBook(book2);
		bookManager.getAvailableBook();
		bookManager.searchBookId(2);
		bookManager.updateBookTitle("Java","CoreJava");
		bookManager.getAvailableBook();
		
		Patron patron =new Patron(1, "Shubham", "Hore", "horeshubham@gmail");
		Patron patron1 =new Patron(2, "Saurabh", "Kale", "kalesaurabh@gmail");
		
		patronManager.assignMembership(patron);
		patronManager.assignMembership(patron1);
		patronManager.assignBook(1, book1);
		bookManager.getAvailableBook();
		patronManager.returnBook(1, book1);
		bookManager.getAvailableBook();
		
		
	}

}
