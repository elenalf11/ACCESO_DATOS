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

		int even = 0;
		if (current.value % 2 == 0) {
			even = current.value;
		}

		return even + evenSummaryRecursive(current.left) + evenSummaryRecursive(current.right);
	}
}
