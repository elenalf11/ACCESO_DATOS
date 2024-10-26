package main;

public class Book {
	
	private String title;
	private String author;
	private int ISBN;
	
	public Book(String _title, String _author, int _ISBN) {
		this.title = _title;
		this.author = _author;
		this.ISBN = _ISBN;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getISBN() {
		return this.ISBN;
	}
	
	@Override
	public String toString() {
		return "Title " + this.title + ", Author: " + this.author + ", ISBN: " + this.ISBN;
	}
}
