package main;

/**
 * Binary Search Tree Class
 * 
 * @author elena
 */

public class BST {
	/**
	 * Attributes
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
	 * @param current its the current node (Starts in the root)
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
	 * Check if the tree be strict, that it to say if the tree has 2 children or
	 * none
	 * 
	 * @return true if its strict or false if it isn't strict
	 */
	public boolean isStrict() {
		return isStrictRecursive(this.root);
	}

	/**
	 * Check if the tree be strict. Using a recursive method
	 * 
	 * @param current its the current node (Starts in the root)
	 * @return true if its strict or false if it isn't strict
	 */
	private boolean isStrictRecursive(Node current) {
		if (current == null) {
			return true;
		}

		if ((current.left == null && current.right != null) || (current.left != null && current.right == null)) {
			return false;
		}
		
		if(current.left != null && current.right != null) {
			return true;
		}

		return isStrictRecursive(current.left) && isStrictRecursive(current.right);
	}

}
