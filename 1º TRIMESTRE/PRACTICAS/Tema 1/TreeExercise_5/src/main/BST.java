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
		if (main == null || other == null) {
			return true;
		}
		isIdenticalRecursive(main.left, other.left);
		isIdenticalRecursive(main.right, other.right);
		if (main.value != other.value) {
			return false;
		} else if (main.value == other.value) {
			return true;
		} else {
			return false;
		}
	}
}