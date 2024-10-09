package main;

/**
 * Node class
 * 
 * @author elena
 */

public class Node {
	/**
	 * Attributes
	 */
	int value;
	Node left;
	Node right;

	public Node(int _value) {
		this.value = _value;
		this.left = null;
		this.right = null;
	}

}
