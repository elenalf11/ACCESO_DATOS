package main;

/**
 * Ejercicio 4: Metodo que devuelva la altura de un arbol
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
		System.out.println("El árbol tiene una altura de " + tree.getHeight());

	}

}
