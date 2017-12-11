package trees;

public class CheckIfBinaryEqual {

	public CheckIfBinaryEqual() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Node root1 = new Node();
		root1.data = 100;
		root1.left = new Node();
		root1.left.data = 50;

		root1.right = new Node();
		root1.right.data = 150;
		root1.left.left = new Node();

		root1.left.left.data = 0;
		root1.left.right = new Node();
		root1.left.right.data = 75;
		root1.right.left = new Node();

		root1.right.left.data = 125;
		root1.right.right = new Node();
		root1.right.right.data = 105;
		
		Node root2 = new Node();
		root2.data = 100;
		root2.left = new Node();
		root2.left.data = 50;

		root2.right = new Node();
		root2.right.data = 150;
		root2.left.left = new Node();

		root2.left.left.data = 0;
		root2.left.right = new Node();
		root2.left.right.data = 75;
		root2.right.left = new Node();

		root2.right.left.data = 125;
		root2.right.right = new Node();
		root2.right.right.data = 105;

		Node root3 = new Node();
		root3.data = 100;
		root3.left = new Node();
		root3.left.data = 50;

		root3.right = new Node();
		root3.right.data = 150;
		root3.left.left = new Node();

		root3.left.left.data = 0;
		root3.left.right = new Node();
		root3.left.right.data = 75;
		root3.right.left = new Node();

		root3.right.left.data = 125;
//		root3.right.right = new Node();
//		root3.right.right.data = -1;
		System.out.println(areIdentical(root1, root3));
		System.out.println(areIdentical(root1, root2));
	}

	public static boolean areIdentical(Node n1, Node n2) {
		if (n1 == null && n2 == null) return true;
		if ((n1 == null && n2 != null) || (n1 != null && n2 == null)) return false;
		if (n1.data != n2.data) return false;
		return areIdentical(n1.left, n2.left) && areIdentical(n1.right, n2.right);
	}
}
