package main;

/**
 * Binary Search Tree class
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
	 * Method which it returns the height of the tree
	 * 
	 * @return the height of the tree
	 */
	public int getHeight() {
		return getHeightRecursive(this.root);
	}

	/**
	 * Method which it returns the height of the tree. Using a recursive method
	 * 
	 * @param current its the current node (Starts in the root)
	 * @return the height of the tree
	 */
	private int getHeightRecursive(Node current) {
		if (current == null) {
			return 0;
		}

		return 1 + Math.max(getHeightRecursive(current.left), getHeightRecursive(current.right));
	}
}
