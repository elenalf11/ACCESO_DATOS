package main;

/**
 * Binary Search Tree class
 * 
 * @author elena
 */

public class BST {

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

	/**
	 * Check if two trees are equals. Two trees are equals if their nodes, node to
	 * node, are equal
	 * 
	 * @param other its the other tree
	 * @return true if both of the trees are equals, if not, false
	 */
	public boolean isIdentical(AditionalBST other) {
		return isIdenticalRecursive(this.root, other.root);
	}

	/**
	 * Check if two trees are equals. Two trees are equals if their nodes, node to
	 * node, are equal. Using a recursive method. The route has been carried out
	 * through a pre-orden tour
	 * 
	 * @param main  its the main tree
	 * @param other its the other tree
	 * @return true if both of the trees are equals, if not, false
	 */
	private boolean isIdenticalRecursive(Node main, Node other) {
		if (main == null && other == null) {
			return true;
		}

		if (main == null || other == null) {
			return false;
		}

		return (main.value == other.value) && isIdenticalRecursive(main.left, other.left)
				&& isIdenticalRecursive(main.right, other.right);
	}

	public boolean search(int element) {
		return searchRecursive(this.root, element);
	}

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