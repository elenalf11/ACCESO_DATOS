package main;

public class BST {
	Node root;

	public void add(int _value) {
		this.root = addRecursive(this.root, _value);
	}

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
	
	public boolean isStrict() {
		return isStrictRecursive(this.root);
	}
	
	private boolean isStrictRecursive(Node current) {
		if(current == null) {
			return true;
		}
		
		if((current.left == null && current.right != null) || (current.left != null && current.right == null)){
			return false;
		}
		
		return isStrictRecursive(current.left) && isStrictRecursive(current.right);
	}
	
	public int getHeight() {
		return getHeightRecursive(this.root);
	}
	
	private int getHeightRecursive(Node current) {
		if(current == null) {
			return 0;
		}
		
		return 1 + Math.max(getHeightRecursive(current.left), getHeightRecursive(current.right));
	}
	
	public int maxValue() {
		return maxValueRecursive(this.root);
	}
	
	private int maxValueRecursive(Node current) {
		if(current == null) {
			return -1;
		}
		
		int max = current.value;
		
		return Math.max(max, Math.max(maxValueRecursive(current.left), maxValueRecursive(current.right)));
	}
	
	public int getNodes() {
		return getNodesRecursive(this.root);
	}
	
	private int getNodesRecursive(Node current) {
		if(current == null) {
			return 0;
		}
		
		return 1 + getNodesRecursive(current.left) + getNodesRecursive(current.right);
	}
	
	public int countLeaves() {
		return countLeavesRecursive(this.root);
	}
	
	private int countLeavesRecursive(Node current) {
		if(current == null) {
			return 0;
		}
		
		if(current.left == null && current.right == null) {
			return 1;
		}
		
		return countLeavesRecursive(current.left) + countLeavesRecursive(current.right);
	}
	
	public int summary() {
		return summaryRecursive(this.root);
	}
	
	private int summaryRecursive(Node current) {
		if(current == null) {
			return 0;
		}
		
		return current.value +  summaryRecursive(current.left) + summaryRecursive(current.right);
	}
	
	public int evenSummary() {
		return evenSummaryRecursive(this.root);
	}
	
	private int evenSummaryRecursive(Node current) {
		if(current == null) {
			return 0;
		}
		
		int even = 0;
		if(current.value % 2 == 0) {
			even = current.value;
		}
		
		return even + evenSummaryRecursive(current.left) + evenSummaryRecursive(current.right);
	}
}
