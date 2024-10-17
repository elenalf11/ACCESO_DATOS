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
	 * Count the number of leaves of a tree. A leave is a node that doesn't has any
	 * children
	 * 
	 * @return the number of leaves of a tree
	 */
	public int countLeaves() {
		return countLeavesRecursive(this.root);
	}

	/**
	 * Count the number of leaves of a tree. A leave is a node that doesnt't has any
	 * children. Using a recursive method
	 * 
	 * @param current its the current node. Starting in the root
	 * @return the number of leaves of a tree
	 */
	private int countLeavesRecursive(Node current) {
		int counter = 0;
		if (current == null) {
			return 0;
		}
		if (current.left == null && current.right == null) {
			counter++;
		}

		return counter + countLeavesRecursive(current.left) + countLeavesRecursive(current.right);

	}

}
