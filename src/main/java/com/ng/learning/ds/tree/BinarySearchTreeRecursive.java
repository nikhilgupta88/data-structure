package com.ng.learning.ds.tree;

public class BinarySearchTreeRecursive {

	public BSTNode root;

	public BinarySearchTreeRecursive(int data) {
		this.root = new BSTNode(data);
	}

	public BinarySearchTreeRecursive() {
		root = null;
	}

	static BSTNode insertRec(BSTNode root, int data) {
		BSTNode newNode = new BSTNode(data);
		if (root == null) {
			root = newNode;

		} else if (data <= root.data) {
			root.left = insertRec(root.left, data);
		} else {
			root.right = insertRec(root.right, data);
		}
		return root;
	}

	public void insert(int data) {
		root = insertRec(root, data);
	}

	public boolean search(int data) {
		return searchKey(root, data) ? true : false;
	}

	static boolean searchKey(BSTNode root, int data) {

		if (root == null) {
			return false;
		} else if (root.data == data) {
			return true;

		} else if (data <= root.data) {
			return searchKey(root.left, data);

		} else {

			return searchKey(root.right, data);

		}

	}

	public int height() {
		return heightRec(root);
	}

	static int heightRec(BSTNode root) {
		if (root == null) {
			return -1;
		}
		int leftHeight = heightRec(root.left);
		int rightHeight = heightRec(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}

	public void topView() {
		topViewRec(root);
	}

	static void travLeft(BSTNode root) {
		if (root.left != null) {
			travLeft(root.left);
		}
		System.out.print(root.data + " ");
	}

	static void travRight(BSTNode root) {
		System.out.print(root.data + " ");
		if (root.right != null) {
			travRight(root.right);
		}
	}

	static void topViewRec(BSTNode root) {

		if (root.left != null) {
			travLeft(root.left);
		}
		System.out.print(root.data + " ");
		if (root.right != null) {
			travRight(root.right);
		}

	}

	public int findMinimum() {

		return findMinimumRec(root);
	}

	static int findMinimumRec(BSTNode root) {
		if (root == null) {
			System.out.println("Error: Tree is Empty.");
			return -1;
		} else if (root.left == null) {
			return root.data;
		}
		return findMinimumRec(root.left);
	}

	public int findMaximum() {

		return findMaximumRec(root);
	}

	static int findMaximumRec(BSTNode root) {
		if (root == null) {
			System.out.println("Error: Tree is Empty.");
			return -1;
		} else if (root.right == null) {
			return root.data;
		}
		return findMaximumRec(root.right);
	}

	public void preorder() {
		System.out.print("Preorder: ");
		preorderRec(root);
	}

	static void preorderRec(BSTNode root) {
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preorderRec(root.left);
		preorderRec(root.right);
	}

	public void inorder() {
		System.out.print("Inorder: ");
		inorderRec(root);
	}

	static void inorderRec(BSTNode root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.data + " ");
			inorderRec(root.right);
		}
	}

	public void postorder() {
		System.out.print("Postorder: ");
		postorderRec(root);
	}

	static void postorderRec(BSTNode root) {

		if (root == null)
			return;
		postorderRec(root.left);
		postorderRec(root.right);
		System.out.print(root.data + " ");

	}

	public boolean isBinarySearchTreeApproach1() {
		return isBinarySearchTreeRec(root);
	}

	static boolean isBinarySearchTreeRec(BSTNode root) {
		if (root == null)
			return true;
		if (isSubtreeLesser(root.left, root.data) && isSubtreeGreater(root.right, root.data)
				&& isBinarySearchTreeRec(root.left) && isBinarySearchTreeRec(root.right))
			return true;
		else
			return false;

	}

	static boolean isSubtreeLesser(BSTNode root, int value) {
		if (root == null)
			return true;
		if (root.data <= value && isSubtreeLesser(root.left, value) && isSubtreeLesser(root.right, value)) {
			return true;
		} else {
			return false;
		}
	}

	static boolean isSubtreeGreater(BSTNode root, int value) {
		if (root == null)
			return true;
		if (root.data > value && isSubtreeGreater(root.left, value) && isSubtreeGreater(root.right, value)) {

			return true;
		} else {
			return false;
		}
	}

	public boolean isBinarySearchTreeApproach2() {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	static boolean isBSTUtil(BSTNode root, int minValue, int maxValue) {
		if (root == null)
			return true;
		if (root.data > minValue && root.data < maxValue && isBSTUtil(root.left, minValue, root.data)
				&& isBSTUtil(root.right, root.data, maxValue))
			return true;
		else
			return false;

	}

	public void delete(int data) {
		deleteRec(root, data);

	}

	public static BSTNode deleteRec(BSTNode root, int data) {
		if (root == null)
			return root;
		else if (data < root.data)
			root.left = deleteRec(root.left, data);
		else if (data > root.data)
			root.right = deleteRec(root.right, data);
		else {
			if (root.left == null && root.right == null) {

				root = null;
			} else if (root.left == null) {
				root = root.right;

			} else if (root.right == null) {
				BSTNode current = root;
				root = root.left;
				current = null;

			} else {
				BSTNode current = FindMin(root.right);
				root.data = current.data;
				root.right = deleteRec(root.right, current.data);
			}

		}
		return root;
	}

	static BSTNode FindMin(BSTNode root) {
		while (root.left != null)
			root = root.left;
		return root;
	}

	public int sumAllNode() {
		return sumAllNodeRec(root);
	}

	static int sumAllNodeRec(BSTNode root) {
		if (root == null)
			return 0;
		return sumAllNodeRec(root.left) + root.data + sumAllNodeRec(root.right);
	}

	static int maxlevel = 0;

	void leftViewRec(BSTNode root, int level) {
		if (root == null) {
			return;
		}
		if (level > maxlevel) {
			System.out.print(root.data + " ");
			maxlevel = level;
		}

		leftViewRec(root.left, level + 1);
		leftViewRec(root.right, level + 1);
	}

	public void printLeftView(BSTNode root) {

		leftViewRec(root, 1);
	}

	void rightViewRec(BSTNode root, int level) {
		if (root == null) {
			return;
		}
		if (level > maxlevel) {
			System.out.print(root.data + " ");
			maxlevel = level;
		}

		rightViewRec(root.right, level + 1);
		rightViewRec(root.left, level + 1);

	}

	public void printRightView(BSTNode root) {

		rightViewRec(root, 1);
	}
}
