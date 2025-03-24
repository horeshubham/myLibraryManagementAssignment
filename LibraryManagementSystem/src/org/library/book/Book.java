package org.library.book;

public class Book {
	private int id;
	private String title;
	private String author;
	private boolean isAvailable;

	public Book(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", isAvailable=" + isAvailable + "]";
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void assignBook() {
		this.isAvailable = false;
	}

	public void returnBook() {
		this.isAvailable = true;
	}
}
