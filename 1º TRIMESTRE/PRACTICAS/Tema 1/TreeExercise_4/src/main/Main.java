package main;

/**
 * Ejercicio 4: Escribe un método recursivo que retorne el número de nodos de un
 * árbol
 */

public class Main {

	public static void main(String[] args) {
		BST arbol = new BST();
		arbol.add(8);
		arbol.add(5);
		arbol.add(9);
		arbol.add(4);
		arbol.add(15);
		
		System.out.println("El árbol tiene " + arbol.howManyNodesAre() + " nodos");

	}

}