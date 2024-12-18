package main;

/**
 * Ejercicio 1: Se dice que un árbol binario de búsqueda es "estricto" cuando
 * todos los nodods tienen cero o dos hijos. Escribe un método recursivo que
 * compruebe si un árbol binario es estricto
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
		if(tree.isStrict()) {
			System.out.println("El árbol es estricto");
		}else {
			System.out.println("El árbol no es estricto");
		}
		System.out.println("Recorrido Pre-Orden: ");
		tree.Pre_Orden();
		System.out.println("Recorrido Post-Orden: ");
		tree.Post_Orden();
		System.out.println("Recorrido In-Orden: ");
		tree.In_Orden();

	}

}
