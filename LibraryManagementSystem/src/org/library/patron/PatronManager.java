package org.library.patron;

import java.util.HashMap;
import java.util.Map;

import org.library.book.Book;

public class PatronManager {
	private Map<Integer, Patron> patrons;
	private Book book;

	public PatronManager() {
		this.patrons = new HashMap<Integer, Patron>();
	}

//assign membership 
	public void assignMembership(Patron patron) {
		patrons.put(patron.getId(), patron);
		System.out.println("Membership assign to patron with ID " + patron.getId());

	}

//delete a patron
	public void removePatron(int id) {
		for (Patron p : patrons.values()) {
			if (p.getId() == id) {
				patrons.remove(id);
				System.out.println("Patron removed");
			} else {
				System.out.println("Patron not found");
			}

		}
	}

// assign a book to patron
	public void assignBook(int patronid, Book book) {
		Patron patron = patrons.get(patronid);
		if (patron != null && book.isAvailable()) {
			patron.assignBook(book);
			System.out.println("Assigned a book "+book.getTitle() +" to "+patron.getFirstName());
		}
	}

// collect back book from patron
	public void returnBook(int patronid, Book book) {
		Patron patron = patrons.get(patronid);
		if (patron != null) {
			patron.returnBook(book);
			System.out.println("Collected a book"+book.getTitle()+" from "+patron.getFirstName());
		}
	}

}
