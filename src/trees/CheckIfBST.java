package trees;
import java.util.*;
public class CheckIfBST {

	public CheckIfBST() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Node root = new Node();
		root.data = 100;
		root.left = new Node();
		root.left.data = 50;

		root.right = new Node();
		root.right.data = 150;
		root.left.left = new Node();

		root.left.left.data = 0;
		root.left.right = new Node();
		root.left.right.data = 75;
		root.right.left = new Node();

		root.right.left.data = 125;
		root.right.right = new Node();
		root.right.right.data = 105;

		System.out.println(checkIfBst(root));
		
		System.out.println(checkBst(root));

	}

	// In this mechanism, we will perform an in-order traversal of the whole tree.
	// If the array is in strict increasing order, then we will call the tree as BST.
	public static boolean checkIfBst(Node n) {
		List<Integer> list = new ArrayList<Integer>();
		inorderTraversal(n, list);
		for(int i = 0; i <= list.size() - 2; i++) {
			if (list.get(i) > list.get(i + 1)) return false;
		}

		return true;
	}
	
	public static void inorderTraversal(Node n, List<Integer> list) {
		if (n == null) return;
		inorderTraversal(n.left, list);
		System.out.println(n.data + "\t");
		list.add(n.data);
		inorderTraversal(n.right, list);
	}

	public static boolean checkBst(Node r) {
		if (r == null) return false;
		
		return checkBst(r, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	public static boolean checkBst(Node n, int leftMax, int rightMax) {
		if (n == null) return true;
		if (n.data > rightMax || n.data < leftMax) return false;
		
		return checkBst(n.left, leftMax, n.data) && checkBst(n.right, n.data, rightMax);
	}
}

