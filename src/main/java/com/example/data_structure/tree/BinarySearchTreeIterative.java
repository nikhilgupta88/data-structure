package com.example.data_structure.tree;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeIterative {

	public BSTNode root;

	public BinarySearchTreeIterative(int data) {
		this.root = new BSTNode(data);
	}

	public BinarySearchTreeIterative() {
		root = null;
	}

	public int height() {

		if (root == null)
			return 0;

		Queue<BSTNode> queue = new LinkedList<BSTNode>();
		queue.add(root);
		int height = -1;

		while (true) {

			int nodeCount = queue.size();
			if (nodeCount == 0) {
				return height;
			}
			height++;

			while (nodeCount > 0) {

				BSTNode node = queue.peek();
				queue.remove(node);

				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
				nodeCount--;
			}

		}
	}

	public int heightN() {

		ArrayDeque<BSTNode> stack = new ArrayDeque<BSTNode>();
		stack.add(root);
		int size = stack.size();
		int height = 0;
		while (size-- > 0) {
			BSTNode n = stack.pop();
			if (n.left != null)
				stack.add(n.left);
			if (n.right != null)
				stack.add(n.right);

			if (size == 0 && stack.size() > 0) {
				height++;
				size = stack.size();
			}
		}
		return height;
	}

	public int heightNN() {
		Queue<BSTNode> queue = new LinkedList<BSTNode>();
		int min = Integer.MIN_VALUE;
		if (root != null) {
			queue.add(root);
			queue.add(new BSTNode(min));
		}
		int count = 0;
		while (queue != null && queue.size() > 1) {
			if (queue.element().data == min) {
				queue.add(new BSTNode(min));
				count++;
				queue.poll();
			} else {
				BSTNode currentNode = queue.poll();
				if (currentNode.left != null) {
					queue.add(currentNode.left);
				}
				if (currentNode.right != null) {
					queue.add(currentNode.right);
				}
			}
		}
		return count;

	}

	public void insertIterativeTwoPointer(int data) {
		BSTNode newNode = new BSTNode(data);
		if (root == null) {
			root = newNode;
			return;
		}
		BSTNode parent = null, current = root;
		while (current != null) {
			parent = current;
			if (current.data <= data) {
				current = current.right;
			} else {
				current = current.left;
			}
		}
		if (parent.data <= data) {
			parent.right = newNode;
		} else {
			parent.left = newNode;
		}
		return;
	}

	public BSTNode InsertIterativeOnePointer(int value) {
		BSTNode newNode = new BSTNode(value);
		if (root == null) {
			return newNode;
		}

		BSTNode current = root;
		while (current != null) {
			if (value < current.data) {
				if (current.left == null) {
					current.left = newNode;
					break;
				}
				current = current.left;
			} else {
				if (current.right == null) {
					current.right = newNode;
					break;
				}
				current = current.right;
			}
		}
		return root;
	}

	class QItem {
		BSTNode node;
		int hd;

		public QItem(BSTNode n, int h) {
			node = n;
			hd = h;
		}
	}

	public void printTopView() {
		// base case
		if (root == null) {
			return;
		}

		// Creates an empty hashset
		HashSet<Integer> set = new HashSet<Integer>();

		// Create a queue and add root to it
		Queue<QItem> Q = new LinkedList<QItem>();
		Q.add(new QItem(root, 0)); // Horizontal distance of root is 0

		// Standard BFS or level order traversal loop
		while (!Q.isEmpty()) {
			// Remove the front item and get its details
			QItem qi = Q.remove();
			int hd = qi.hd;
			BSTNode n = qi.node;

			// If this is the first node at its horizontal distance,
			// then this node is in top view
			if (!set.contains(hd)) {
				set.add(hd);
				System.out.print(n.data + " ");
			}

			// Enqueue left and right children of current node
			if (n.left != null)
				Q.add(new QItem(n.left, hd - 1));
			if (n.right != null)
				Q.add(new QItem(n.right, hd + 1));
		}
	}

	public int findMinimum() {
		BSTNode root = this.root;
		if (root == null) {
			System.out.println("Error: Tree is Empty");
			return -1;
		}
		while (root.left != null) {
			root = root.left;
		}

		return root.data;
	}

	public int findMaximum() {

		BSTNode root = this.root;

		if (root == null) {
			System.out.println("Error: Tree is Empty");
			return -1;
		}
		while (root.right != null) {
			root = root.right;
		}

		return root.data;
	}

	public void levelOrderTraversal() {

		if (root == null) {
			return;
		}
		Queue<BSTNode> queue = new LinkedList<BSTNode>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BSTNode current = queue.peek();
			System.out.print(current.data + " ");
			if (current.left != null)
				queue.add(current.left);
			if (current.right != null)
				queue.add(current.right);
			queue.remove();

		}

	}
}
