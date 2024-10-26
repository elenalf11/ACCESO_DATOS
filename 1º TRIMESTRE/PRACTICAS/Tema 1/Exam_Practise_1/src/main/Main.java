package main;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		
		library.addBook(new Book("Cien Años de Soledad", "Gabriel García Márquez", 123));
		library.addBook(new Book("El Principito", "Antoine de Saint-Exupèry", 456));
		library.listBooks();
		library.removeBook(123);
		library.listBooks();
		System.out.println("¿Se ha encontrado el libro ? " + library.findBook(456));

	}

}
