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
	 * Return the max value of the tree
	 * 
	 * @return the max value of the tree
	 */
	public int maxValue() {
		return maxValueRecursive(this.root);
	}

	/**
	 * Return the max value of the tree. Using a recursive method
	 * 
	 * @param current its the current node (Starting in the root)
	 * @return the max value of the tree
	 */
	private int maxValueRecursive(Node current) {
		if (current == null) {
			return -1;
		}
		int max = current.value;
		int maxR = maxValueRecursive(current.right);
		int maxL = maxValueRecursive(current.left);

		return Math.max(Math.max(maxR, maxL), max);

	}

}
