
public class myTree {

	public static void main(String[] args) {
		Tree root = new Tree(10);
		root.r = new Tree(40);
		root.l = new Tree(20);
		root.l.l = new Tree(30);
		root.l.r = new Tree(5);
		root.l.r.l = new Tree(1);
		root.l.r.r = new Tree(2);
		root.l.r.r.r = new Tree(4);
		print(inOrder(root));
	}

	public static int[] preOrder(Tree root) {
		int[] a = new int[size(root)];
		preOrderHelper(root, a, 0);
		return a;
	}

	public static int preOrderHelper(Tree root, int[] a, int start) {
		if (root == null) {
			return start;
		}
		a[start] = root.v;
		int e = preOrderHelper(root.l, a, start + 1);
		return preOrderHelper(root.r, a, e);
	}

	public static int[] postOrder(Tree root) {
		int[] a2 = new int[size(root)];
		postOrderHelper(root, a2, 0);
		return a2;
	}

	public static int postOrderHelper(Tree root, int[] a, int start) {
		if (root == null) {
			return start;
		}
		int e = postOrderHelper(root.l, a, start);
		e = postOrderHelper(root.r, a, e);
		a[e] = root.v;
		return e + 1;
	}

	public static int[] inOrder(Tree root) {
		int[] a3 = new int[size(root)];
		inOrderHelper(root, a3, 0);
		return a3;
	}

	public static int inOrderHelper(Tree root, int[] a, int s) {
		if (root == null) {
			return s;
		}
		int e = inOrderHelper(root.l, a, s);
		a[e] = root.v;
		return inOrderHelper(root.r, a, e + 1);
	}

	public static void print(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static int size(Tree root) {
		if (root == null) {
			return 0;
		}
		return 1 + size(root.l) + size(root.r);
	}

	public static int height(Tree root) {
		if (root == null) {
			return 0;
		}
		int hl = height(root.l);
		int hr = height(root.r);
		return Math.max(hl, hr) + 1;
	}

	public static int sum(Tree root) {
		if (root == null) {
			return 0;
		}
		return root.v + sum(root.r) + sum(root.l);
	}
}
