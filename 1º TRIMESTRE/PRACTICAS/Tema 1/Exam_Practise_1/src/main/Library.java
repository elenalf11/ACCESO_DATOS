package main;

import java.util.LinkedList;

public class Library {
	
	private LinkedList <Book> list;
	
	public Library() {
		this.list = new LinkedList<Book>();
	}
	
	public void addBook(Book book) {
		this.list.add(book);
	}
	
	public void removeBook(int ISBN) {
		for (int i = 0; i < this.list.size(); i++) {
			if(this.list.get(i).getISBN() == ISBN) {
				this.list.remove(i);
			}
		}
	}
	
	public boolean findBook(int ISBN) {
		int i = 0;
		boolean encontrado = false;
		while(i < this.list.size() && encontrado == false) {
			if(this.list.get(i).getISBN() == ISBN) {
				encontrado = true;
			}else {
				encontrado = false;
			}
		}
		return encontrado;
	}
	
	public void listBooks() {
		System.out.println(this.list.toString());
	}
}
