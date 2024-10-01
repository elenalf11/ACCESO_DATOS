package main;

/**
 * @author elena Clase Arbol Binario de Busqueda (Binay Search Tree)
 */

public class BST {
	/**
	 * Atributo raiz
	 */
	private Node root;

	/**
	 * Metodo aniadir elementos al nodo
	 * 
	 * @param element es el elemento que se quiere aniadir
	 */
	public void add(int element) {
		this.root = addRecursive(this.root, element);
	}

	/**
	 * Metodo para aniadir elementos al nodo de manera recursiva comprobando los
	 * criterios de los arboles binarios de busqueda
	 * 
	 * @param current es el nodo inicial en el que inicia la busqueda
	 * @param element es el elemento que se desea aniadir
	 * @return retorna un nuevo nodo con el elemento ya aniadido
	 */
	private Node addRecursive(Node current, int element) {
		if (current == null) {
			return new Node(element);
		}

		if (element < current.value) {
			current.left = addRecursive(current.left, element);
		} else if (element > current.value) {
			current.right = addRecursive(current.right, element);
		} else {
			return current;
		}
		return current;
	}

	/**
	 * Metodo para buscar un elemento
	 * 
	 * @param element es el elemento que se desea buscar
	 * @return devuelve true si se encuentra el elemento en el arbol, sino, devuelve
	 *         false
	 */
	public boolean search(int element) {
		return searchRecursive(this.root, element);
	}

	/**
	 * Metodo para buscar un elemento de manera recursiva comprobando los criterios
	 * de los arboles binarios de busqueda
	 * 
	 * @param current es el nodo en el que inicia la busqueda
	 * @param element es el elemento que se desea buscar
	 * @return devuelve true si se encuentra el elemento en el arbol, sino, devuelve
	 *         false
	 */
	private boolean searchRecursive(Node current, int element) {
		if (current == null) {
			return false;
		}
		if (element == current.value) {
			return true;
		}

		return element < current.value ? searchRecursive(current.left, element)
				: searchRecursive(current.right, element);

	}

}
