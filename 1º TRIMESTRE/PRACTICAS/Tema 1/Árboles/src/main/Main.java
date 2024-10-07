package main;

/**
 * @author elena Clase Main
 */

public class Main {

	public static void main(String[] args) {
		BST arbol = new BST();

		arbol.add(5);
		arbol.add(7);
		arbol.add(4);
		arbol.add(3);
		arbol.add(10);

		System.out.println(arbol.search(5));
		System.out.println(arbol.search(6));
		System.out.println(arbol.search(7));
		System.out.println(arbol.search(4));
		System.out.println(arbol.search(2));
		System.out.println(arbol.search(3));
		System.out.println(arbol.search(10));
		
		//arbol.PostOrden();
		arbol.PreOrden();

	}

}
