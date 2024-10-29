package main;

/**
 * Aditional Binary Search Tree class
 * 
 * @author elena
 */

public class AditionalBST {

	/**
	 * Attribute
	 */
	Node root;

	/**
	 * Add the user value into a node
	 * 
	 * @param _value its the user value
	 */
	public void add(int _value) {
		this.root = addRecursive(this.root, _value);
	}

	/**
	 * Add the user value into a node. Using a recursive method
	 * 
	 * @param current its the current node (Starting in the root)
	 * @param _value  its the user value
	 * @return return the node with the user value
	 */
	private Node addRecursive(Node current, int _value) {
		if (current == null) {
			return new Node(_value);
		}

		if (_value < current.value) {
			current.left = addRecursive(current.left, _value);
		} else if (_value > current.value) {
			current.right = addRecursive(current.right, _value);
		} else {
			return current;
		}
		return current;
	}

	public boolean search(int _value) {
		return searchRecursive(this.root, _value);
	}

	private boolean searchRecursive(Node current, int _value) {
		if (current == null) {
			return false;
		}

		if (_value == current.value) {
			return true;
		}

		return _value < current.value ? searchRecursive(current.left, _value) : searchRecursive(current.right, _value);
	}
	
	public void Pre_Orden() {
		Pre_Orden_Recursive(this.root);
	}
	
	private void Pre_Orden_Recursive(Node current) {
		if(current != null) {
			System.out.println("Valor: " + current.value);
			Pre_Orden_Recursive(current.left);
			Pre_Orden_Recursive(current.right);
		}
	}
	
	public void Post_Orden() {
		Post_Orden_Recursive(this.root);
	}
	
	private void Post_Orden_Recursive(Node current) {
		if(current != null) {
			Post_Orden_Recursive(current.left);
			Post_Orden_Recursive(current.right);
			System.out.println("Valor: " + current.value);
		}
	}
	
	public void In_Orden() {
		In_Orden_Recursive(this.root);
	}
	
	private void In_Orden_Recursive(Node current) {
		if(current != null) {
			In_Orden_Recursive(current.left);
			System.out.println("Valor: " + current.value);
			In_Orden_Recursive(current.right);
		}
	}

}
