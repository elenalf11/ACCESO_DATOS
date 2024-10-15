package main;

/**
 * Ejercicio 7: Escribe un método recursivo que calcule la suma de todos los
 * nodos de un árbol
 * 
 * @author elena
 */

public class Main {

	public static void main(String[] args) {
		BST arbol = new BST();
		arbol.add(10);
		arbol.add(8);
		arbol.add(5);
		arbol.add(9);
		arbol.add(15);
		arbol.add(20);
		arbol.add(11);
		
		System.out.println("El sumatorio del árbol es: " + arbol.summary());

	}

}
