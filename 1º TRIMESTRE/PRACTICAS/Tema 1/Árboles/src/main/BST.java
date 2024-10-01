package main;
/**
 * @author elena Clase Arbol Binario de Busqueda (Binay Search Tree)
 */

public class BST {
	private Node root;
	
	
	public void add(int element) {
		this.root = addRecursive(this.root, element);
	}
	
	private Node addRecursive(Node current, int element) {
		if(current == null) {
			return new Node (element);
		}
		
		if(element < current.value) {
			current.left = addRecursive(current.left, element);
		}else if (element > current.value) {
			current.right = addRecursive(current.right, element);
		}else {
			return current;
		}
		return current;
	}
	
	public boolean search(int element) {
		return searchRecursive(this.root, element);
	}
	
	private boolean searchRecursive(Node current, int element) {
		if(current == null) {
			return false;
		}
		if(element == current.value) {
			return true;
		}
		
		return element < current.value ? searchRecursive(current.left, element) : searchRecursive(current.right, element);
		
	}

}
