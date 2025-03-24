package org.library.patron;

import java.util.ArrayList;
import java.util.List;

import org.library.book.Book;

public class Patron {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private List<Book> mybookList;

	public Patron(int id, String firstName, String lastName, String email) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mybookList = new ArrayList<Book>();

	}

	public int getId() {
		return id;
	}

	public int setId(int id) {
		return this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Patron [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

	public void assignBook(Book book) {
		if (book.isAvailable()) {
			mybookList.add(book);
			book.assignBook();
		}
	}

	public void returnBook(Book book) {
		mybookList.remove(book);
		book.returnBook();

	}

}
