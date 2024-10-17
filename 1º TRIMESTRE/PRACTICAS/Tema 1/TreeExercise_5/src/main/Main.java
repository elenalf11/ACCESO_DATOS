package main;

/**
 * Ejercicio 5: Escribe un método recursivo que compruebe si dos árboles son
 * idénticos. Se dice que dos árboles son idénticos si los valores de sus nodos,
 * nodo a nodo, lo son. Los dos árboles que se comprobarán son el this y un
 * segundo árbol que se recibe por parámetro, al que llamaremos other
 * 
 * @author elena
 */

public class Main {

	public static void main(String[] args) {
		BST tree_1 = new BST();
		AditionalBST tree_2 = new AditionalBST();
		tree_1.add(15);
		tree_1.add(20);
		tree_1.add(18);
		tree_1.add(24);
		tree_1.add(6);
		tree_1.add(3);
		tree_1.add(1);
		tree_1.add(4);
		//tree_1.add(9);
		//tree_1.add(7);
		//tree_1.add(12);
		
		//tree_2.add(15);
		//tree_2.add(20);
		//tree_2.add(18);
		tree_2.add(24);
		tree_2.add(6);
		tree_2.add(3);
		tree_2.add(1);
		tree_2.add(4);
		tree_2.add(9);
		tree_2.add(7);
		tree_2.add(12);
		
		System.out.println("El árbol 1 y el árbol 2, ¿son iguales?: " + tree_1.isIdentical(tree_2));

	}

}
