package com.ng.learning.ds.tree;

import org.junit.Test;

import com.ng.learning.ds.tree.BinarySearchTreeRecursive;
import com.ng.learning.ds.tree.TreeTraversal;

public class TestTreeTraversal {

	@Test
	public void inorderUsingStack() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		tt.inorderUsingStack(b);
	}

	@Test
	public void inorderUsingMorris() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		tt.inorderUsingMorrisTraversal(b);
	}

	@Test
	public void preorderUsingStack() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		tt.preorderTraversalUsingStack(b);
	}

	@Test
	public void preorderUsingMorris() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		tt.preorderUsingMorrisTraversal(b);
	}

	@Test
	public void postorderUsingTwoStack() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		tt.postorderUsingTwoStack(b);
	}

	@Test
	public void postorderUsingOneStack() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		System.out.println(tt.postorderUsingOneStack(b));
	}

	@Test
	public void reverseLevelorderUsingRecursion() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		tt.reverseLevelOrderUsingRecursion(b);
	}

	@Test
	public void LevelorderUsingRecursion() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		tt.printLevelOrder(b);
	}

	@Test
	public void LevelorderLineByLine() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		tt.printLineByLineLevelOrder(b);
	}

	@Test
	public void reverseLevelorderUsingStackQueue() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		tt.reverseLevelOrderUsingStackQueue(b);
	}

	@Test
	public void LevelorderLineByLineUsingTwoQueue() {
		BinarySearchTreeRecursive b = new BinarySearchTreeRecursive();
		b.insert(60);
		b.insert(30);
		b.insert(90);
		b.insert(40);
		b.insert(10);
		b.insert(80);
		b.insert(100);
		TreeTraversal tt = new TreeTraversal();
		tt.levelOrderLineByLineUsingTwoQueue(b);
	}

}
