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

	/**
	 * Metodo para eliminar elementos de los nodos
	 * 
	 * @param element es el elemento que se desea eliminar
	 */
	public void delete(int element) {
		this.root = deleteRecursive(this.root, element);
	}

	/**
	 * Metodo para eliminar elementos de los nodos de manera recursiva comprobando
	 * los criterios de los arboles binarios de busqueda
	 * 
	 * @param current es el nodo en que inicia la busqueda
	 * @param element es el elemento que se desea eliminar
	 * @return devuelve el nodo que se va a eliminar
	 */
	private Node deleteRecursive(Node current, int element) {
		// El nodo esta vacio
		if (current == null) {
			return null;
		}
		// El valor del nodo a eliminar se ha encontrado
		if (element == current.value) {
			// Caso 1: El nodo es un nodo hoja
			if (current.left == null && current.right == null) {
				return null;
			}
			// Caso 2: El nodo solo tiene un hijo
			if (current.right == null) {
				return current.left;
			}

			if (current.left == null) {
				return current.right;
			}

			// Caso 3: El nodo tiene 2 hijos
			int smallestValue = findSmallestValue(current.right);
			System.out.println(smallestValue);
			current.value = smallestValue;
			current.right = deleteRecursive(current.right, smallestValue);
		}
		// El valor es menor que el valor del nodo actual
		if (element < current.value) {
			current.left = deleteRecursive(current.left, element);
			return current;
		} else {
			// El valor es mayor que el valor del nodo actual
			current.right = deleteRecursive(current.right, element);
			return current;
		}
	}

	/**
	 * Metodo que usaremos para buscar el nodo mas pequenio del subarbol derecho
	 * 
	 * @param root es el nodo raiz
	 * @return devuelve el valor mas pequenio del subarbol derecho
	 */
	private int findSmallestValue(Node root) {
		return root.left == null ? root.value : findSmallestValue(root.left);

	}

	/**
	 * Metodo que imprime el arbol en Pre-Orden
	 */
	public void PreOrden() {
		PreOrdenRecursive(this.root);
	}

	/**
	 * Metodo que imprime el arbol en Pre-Orden de manera recursiva
	 * 
	 * @param current es el nodo en el que inicia el recorrido
	 */
	private void PreOrdenRecursive(Node current) {
		if (current != null) {
			System.out.println("Valor: " + current.value);
			PreOrdenRecursive(current.left);
			PreOrdenRecursive(current.right);
		}
	}

	/**
	 * Metodo que imprime el arbol en Post-Orden
	 */
	public void PostOrden() {
		PostOrdenRecursive(this.root);
	}

	/**
	 * Metodo que imprime el arbol en Post-Orden de manera recursiva
	 * 
	 * @param current es el nodo en el que inicia el recorrido
	 */
	private void PostOrdenRecursive(Node current) {
		if (current != null) {
			PostOrdenRecursive(current.left);
			PostOrdenRecursive(current.right);
			System.out.println(current.value);
		}
	}

	/**
	 * Metodo que imprime el arbol en In-Orden
	 */
	public void InOrden() {
		InOrdenRecursive(this.root);
	}

	/**
	 * Metodo que imprime el arbol en In-Orden de manera recursiva
	 * 
	 * @param current es el nodo en el que inicia el recorrido
	 */
	private void InOrdenRecursive(Node current) {
		if (current != null) {
			InOrdenRecursive(current.left);
			System.out.println(current.value);
			InOrdenRecursive(current.right);
		}
	}

}
