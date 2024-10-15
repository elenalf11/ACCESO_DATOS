package main;

/**
 * Ejercicio 8: Escribe un método recursivo que calcule la suma total de los
 * nodos que tengan un valor par
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
		
		System.out.println("El sumatorio del árbol es: " + arbol.evenSummary());

	}

}
