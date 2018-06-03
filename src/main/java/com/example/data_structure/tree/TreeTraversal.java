package com.example.data_structure.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversal {

	public void inorderUsingStack(BinarySearchTreeRecursive b) {
		Stack<BSTNode> stack = new Stack<BSTNode>();
		BSTNode current = b.root;
		while (current != null) {
			stack.push(current);
			current = current.left;
		}
		while (stack.size() > 0) {

			// visit the top node
			current = stack.pop();
			System.out.print(current.data + " ");
			if (current.right != null) {
				current = current.right;

				// the next node to be visited is the leftmost
				while (current != null) {
					stack.push(current);
					current = current.left;
				}
			}

		}

	}

	public void inorderUsingMorrisTraversal(BinarySearchTreeRecursive b) {
		BSTNode current = b.root, pre;
		while (current != null) {
			if (current.left == null) {
				System.out.print(current.data + " ");
				current = current.right;

			} else {
				pre = current.left;
				while (pre.right != null && pre.right != current)
					pre = pre.right;

				/* Make current as right child of its inorder predecessor */
				if (pre.right == null) {
					pre.right = current;
					current = current.left;
				}

				/*
				 * Revert the changes made in if part to restore the original tree i.e.,fix the
				 * right child of predecssor
				 */
				else {
					pre.right = null;
					System.out.print(current.data + " ");
					current = current.right;
				} /* End of if condition pre->right == NULL */

			}

		}

	}

	public void preorderTraversalUsingStack(BinarySearchTreeRecursive b) {

		BSTNode current = b.root;

		if (current == null)
			return;
		Stack<BSTNode> stack = new Stack<BSTNode>();
		stack.push(current);
		while (!stack.isEmpty()) {
			BSTNode tempNode = stack.peek();
			System.out.print(tempNode.data + " ");
			stack.pop();

			if (tempNode.right != null) {
				stack.push(tempNode.right);
			}
			if (tempNode.left != null) {
				stack.push(tempNode.left);
			}
		}
	}

	public void preorderUsingMorrisTraversal(BinarySearchTreeRecursive b) {
		BSTNode current = b.root;
		if (current == null)
			return;
		while (current != null) {
			if (current.left == null) {
				System.out.print(current.data + " ");
				current = current.right;
			} else {
				BSTNode tempNode = current.left;
				while (tempNode.right != null && tempNode.left != null) {
					tempNode = tempNode.right;

				}
				if (tempNode.right == current) {
					tempNode.right = null;
					current = current.right;
				} else {
					System.out.print(current.data + " ");
					tempNode.right = current;
					current = current.left;
				}
			}
		}
	}

	public void postorderUsingTwoStack(BinarySearchTreeRecursive b) {
		BSTNode current = b.root;
		if (current == null)
			return;

		Stack<BSTNode> stack1 = new Stack<BSTNode>();
		Stack<BSTNode> stack2 = new Stack<BSTNode>();
		stack1.push(current);

		while (!stack1.isEmpty()) {
			BSTNode temp = stack1.pop();
			stack2.push(temp);

			if (temp.left != null) {
				stack1.push(temp.left);
			}
			if (temp.right != null) {
				stack1.push(temp.right);
			}

		}

		while (!stack2.isEmpty()) {
			BSTNode temp = stack2.pop();
			System.out.print(temp.data + " ");
		}
	}

	public ArrayList<Integer> postorderUsingOneStack(BinarySearchTreeRecursive b) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		BSTNode current = b.root;
		Stack<BSTNode> stack = new Stack<BSTNode>();

		if (current == null)
			return list;

		stack.push(current);

		BSTNode prev = null;

		while (!stack.isEmpty()) {
			BSTNode temp = stack.peek();
			if (prev == null || prev.left == temp || prev.right == temp) {
				if (temp.left != null) {
					stack.push(temp.left);
				} else if (temp.right != null) {
					stack.push(temp.right);
				} else {
					stack.pop();
					list.add(temp.data);
				}
			} else if (temp.left == prev) {
				if (temp.right != null)
					stack.push(temp.right);
				else {
					stack.pop();
					list.add(temp.data);
				}

				/*
				 * go up the tree from right node and after coming back from right node process
				 * parent and pop stack
				 */
			} else if (temp.right == prev) {
				stack.pop();
				list.add(temp.data);
			}

			prev = temp;
		}

		return list;
	}

	/* Time Complexity O(n^2) */
	public void printLevelOrder(BinarySearchTreeRecursive b) {
		BSTNode root = b.root;
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printGivenLevel(root, i);
	}

	/*
	 * Compute the "height" of a tree -- the number of nodes along the longest path
	 * from the root node down to the farthest leaf node.
	 */
	private static int height(BSTNode root) {
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}

	/* Print nodes at the given level */
	private static void printGivenLevel(BSTNode root, int level) {
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printGivenLevel(root.left, level - 1);
			printGivenLevel(root.right, level - 1);
		}

	}

	public void printLineByLineLevelOrder(BinarySearchTreeRecursive b) {
		// Base Case
		BSTNode root = b.root;
		if (root == null)
			return;

		// Create an empty queue for level order tarversal
		Queue<BSTNode> q = new LinkedList<BSTNode>();

		// Enqueue Root and initialize height
		q.add(root);

		while (true) {

			// nodeCount (queue size) indicates number of nodes
			// at current level.
			int nodeCount = q.size();
			if (nodeCount == 0)
				break;

			// Dequeue all nodes of current level and Enqueue all
			// nodes of next level
			while (nodeCount > 0) {
				BSTNode node = q.peek();
				System.out.print(node.data + " ");
				q.remove();
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
				nodeCount--;
			}
			System.out.println();
		}
	}

	public void reverseLevelOrderUsingRecursion(BinarySearchTreeRecursive b) {
		BSTNode root = b.root;
		int h = height(root);
		for (int i = h; i >= 0; i--) {
			printGivenLevel(root, i);
		}

	}

	public void reverseLevelOrderUsingStackQueue(BinarySearchTreeRecursive b) {
		BSTNode root = b.root;

		if (root == null)
			return;
		Stack<BSTNode> s = new Stack<BSTNode>();
		Queue<BSTNode> q = new LinkedList<BSTNode>();

		q.add(root);
		while (!q.isEmpty()) {
			BSTNode current = q.peek();
			q.remove();
			s.push(current);

			if (current.right != null) {
				q.add(current.right);
			}
			if (current.left != null) {
				q.add(current.left);
			}
		}

		while (!s.isEmpty()) {
			BSTNode temp = s.peek();
			System.out.print(temp.data + " ");
			s.pop();
		}
	}

	public void levelOrderLineByLineUsingTwoQueue(BinarySearchTreeRecursive b) {
		Queue<BSTNode> q1 = new LinkedList<BSTNode>();
		Queue<BSTNode> q2 = new LinkedList<BSTNode>();
		BSTNode root = b.root;
		if (root == null)
			return;

		q1.add(root);
		while (!q1.isEmpty() || !q2.isEmpty()) {
			while (!q1.isEmpty()) {
				BSTNode temp = q1.peek();
				if (temp.left != null)
					q2.add(temp.left);
				if (temp.right != null)
					q2.add(temp.right);
				System.out.print(temp.data + " ");
				q1.remove();
			}
			System.out.println();
			while (!q2.isEmpty()) {
				BSTNode temp = q2.peek();
				if (temp.left != null)
					q1.add(temp.left);
				if (temp.right != null)
					q1.add(temp.right);
				System.out.print(temp.data + " ");
				q2.remove();
			}
			System.out.println();
		}
	}

}
