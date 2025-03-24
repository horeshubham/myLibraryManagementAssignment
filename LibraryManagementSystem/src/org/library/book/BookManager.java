package org.library.book;

import java.util.HashMap;
import java.util.Map;

public class BookManager {
	Map<Integer, Book> books;

	public BookManager() {
		this.books = new HashMap<Integer, Book>();
	}

	// add a book
	public void addBook(Book book) {
		books.put(book.getId(), book);
		System.out.println("Added a book " + book.getTitle());
	}

	// remove a book
	public void removeBook(Book book) {
		books.remove(book.getId());
	}

	// update book title based on title name
	public void updateBookTitle(String title, String newtitle) {
		if (books == null || books.isEmpty()) {
			System.out.println("no book to update");
			return;
		}
		boolean updated = false;
		for (Book book : books.values()) {
			if (book.getTitle().equalsIgnoreCase(title)) {
				book.setTitle(newtitle);
				updated = true;
				break;
			}

		}
		if (!updated) {
			System.out.println("Book not found");
		}

	}

	// check available book
	public void getAvailableBook() {
		for (Book book : books.values()) {
			System.out.println(book.toString());

		}
	}

	// search a book using id
	public void searchBookId(int id) {
		if (books.containsKey(id)) {
			System.out.println("Found " + books.get(id));
		} else {
			System.out.println("Book not found");
		}

	}
}
