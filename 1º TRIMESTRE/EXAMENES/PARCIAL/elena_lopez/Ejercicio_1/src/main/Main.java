package main;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

class Ejercicio1 {
	public static boolean exists(TreeNode root, int target) {
		if (root == null) {
			return false;
		}

		if (target == root.val) {
			return true;
		}

		return exists(root.left, target) || exists(root.right, target);
	}
}

public class Main {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		
		if(Ejercicio1.exists(root, 8)) {
			System.out.println("El valor SI existe en el árbol");
		}else {
			System.out.println("El valor NO existe en el árbol");
		}

	}

}
