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
	private Node root;

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
	 * Add the even nodes in the tree
	 * 
	 * @return the summary of the even nodes in the tree
	 */
	public int evenSummary() {
		return evenSummaryRecursive(this.root);
	}

	/**
	 * Add the even nodes in the tree. Using a recursive method
	 * 
	 * @param current its the current node (Starting in the root)
	 * @return the summary of the even nodes in the tree
	 */
	private int evenSummaryRecursive(Node current) {
		if (current == null) {
			return 0;
		}

		// int even = (current.value % 2 == 0) ? current.value : 0;
		int even = 0;
		if (current.value % 2 == 0) {
			even = current.value;
		}

		return even + evenSummaryRecursive(current.left) + evenSummaryRecursive(current.right);
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
