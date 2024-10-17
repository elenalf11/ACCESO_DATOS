package main;

/**
 * Ejercicio 6: Escibe un método recursivo que cuente el número de hojas de un
 * árbol
 * 
 * @author elena
 */

public class Main {

	public static void main(String[] args) {
		BST tree = new BST();
		tree.add(15);
		tree.add(20);
		tree.add(18);
		tree.add(24);
		tree.add(6);
		tree.add(3);
		tree.add(1);
		tree.add(4);
		tree.add(9);
		tree.add(7);
		tree.add(12);
		System.out.println("El árbol tiene " + tree.countLeaves() + " hojas");

	}

}
