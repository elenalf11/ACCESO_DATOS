package main;

/**
 * Ejercicio 3: Escribe un método recursivo que retorne el valor máximo de un
 * árbol binario de búsqueda o -1 si el árbol está vacío
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
		//System.out.println("El valor máximo del árbol es: " + tree.maxValue());

	}

}
