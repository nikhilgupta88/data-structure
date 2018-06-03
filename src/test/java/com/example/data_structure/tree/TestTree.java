package com.example.data_structure.tree;

import java.util.Scanner;

import org.junit.Test;

public class TestTree {

	@Test
	public void binarySearchTreeRecursive() {
		BinarySearchTreeRecursive t = new BinarySearchTreeRecursive();

		t.insert(15);
		t.insert(63);
		t.insert(25);
		t.insert(22);
		t.insert(17);
		t.preorder();
		System.out.println();
		t.inorder();
		System.out.println();
		t.postorder();

		System.out.print("\n" + t.search(33));
	}

	@Test
	public void binarySearchTreeIterative() {
		BinarySearchTreeIterative t = new BinarySearchTreeIterative();

		t.insertIterativeTwoPointer(50);
		t.insertIterativeTwoPointer(40);
		t.insertIterativeTwoPointer(30);

		t.insertIterativeTwoPointer(60);
		t.insertIterativeTwoPointer(55);
		t.insertIterativeTwoPointer(65);
		t.insertIterativeTwoPointer(45);

	}

	@Test
	public void topViewRecusrsive() {
		BinarySearchTreeRecursive t = new BinarySearchTreeRecursive();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (x = 0; x < 50; x++) {

			t.insert(sc.nextInt());
		}
		t.inorder();
		t.topView();
	}

	@Test
	public void topViewIterative() {
		BinarySearchTreeIterative t = new BinarySearchTreeIterative();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (x = 0; x < 50; x++) {

			t.insertIterativeTwoPointer(sc.nextInt());
		}

		t.printTopView();
	}

	@Test
	public void findMinimumMaximumRecusrsive() {
		BinarySearchTreeRecursive t = new BinarySearchTreeRecursive();
		t.insert(50);
		t.insert(40);
		t.insert(30);
		t.insert(60);
		t.insert(55);
		t.insert(65);
		t.insert(45);
		System.out.println("The Maximum Element :" + t.findMaximum());
		System.out.println("The Minimum Element :" + t.findMinimum());

	}

	@Test
	public void findMinimumMaximumIterative() {
		BinarySearchTreeIterative t = new BinarySearchTreeIterative();

		t.insertIterativeTwoPointer(50);
		t.insertIterativeTwoPointer(40);
		t.insertIterativeTwoPointer(30);
		t.insertIterativeTwoPointer(60);
		t.insertIterativeTwoPointer(55);
		t.insertIterativeTwoPointer(65);
		t.insertIterativeTwoPointer(45);

		System.out.println("The Minimum Element :" + t.findMinimum());
		System.out.println("The Maximum Element :" + t.findMaximum());

	}

	@Test
	public void levelOrderTraversal() {
		BinarySearchTreeIterative t = new BinarySearchTreeIterative();

		t.insertIterativeTwoPointer(50);
		t.insertIterativeTwoPointer(40);
		t.insertIterativeTwoPointer(30);
		t.insertIterativeTwoPointer(60);
		t.insertIterativeTwoPointer(55);
		t.insertIterativeTwoPointer(65);
		t.insertIterativeTwoPointer(45);
		System.out.println("Level Order Traversal :");
		t.levelOrderTraversal();
	}

	@Test
	public void isBinarySearchTreeApproach1() {
		BinarySearchTreeRecursive t = new BinarySearchTreeRecursive();
		t.insert(7);
		t.insert(9);
		t.insert(4);
		t.insert(6);
		t.insert(1);
		t.insert(-4);
		t.insert(-5);
		t.insert(43);
		t.insert(61);
		t.insert(11);
		t.insert(-3);
		t.insert(8);
		t.insert(45);
		t.insert(69);
		t.insert(19);
		System.out.println(t.isBinarySearchTreeApproach1());
	}

	@Test
	public void isBinarySearchTreeApproach2() {
		BinarySearchTreeRecursive t = new BinarySearchTreeRecursive();
		t.insert(7);
		t.insert(9);
		t.insert(4);
		t.insert(6);
		t.insert(1);
		t.insert(-4);
		t.insert(-5);
		t.insert(43);
		t.insert(61);
		t.insert(11);
		t.insert(-3);
		t.insert(8);
		t.insert(45);
		t.insert(69);
		t.insert(19);
		System.out.println(t.isBinarySearchTreeApproach2());
	}

	@Test
	public void delete() {
		BinarySearchTreeRecursive t = new BinarySearchTreeRecursive();
		t.insert(7);
		t.insert(9);
		t.insert(4);
		t.insert(6);
		t.insert(1);
		t.insert(-4);
		t.insert(-5);
		t.insert(43);
		t.insert(61);
		t.insert(11);
		t.insert(-3);
		t.insert(8);
		t.insert(45);
		t.insert(69);
		t.insert(19);
		t.inorder();
		t.delete(4);
		System.out.println();
		t.inorder();
	}

	@Test
	public void SumAllNode() {
		BinarySearchTreeRecursive t = new BinarySearchTreeRecursive();
		t.insert(7);
		t.insert(9);
		t.insert(4);
		t.insert(6);
		t.insert(1);
		t.insert(-4);
		t.insert(-5);
		t.insert(43);
		t.insert(61);
		t.insert(11);
		t.insert(-3);
		t.insert(8);
		t.insert(45);
		t.insert(69);
		t.insert(19);
		t.inorder();
		System.out.print("\nSum of All Node: " + t.sumAllNode());
	}

	@Test
	public void printLeftView() {
		BinarySearchTreeRecursive t = new BinarySearchTreeRecursive();
		t.insert(7);
		t.insert(9);
		t.insert(4);
		t.insert(6);
		t.insert(1);
		t.insert(-4);
		t.insert(-5);
		t.insert(43);
		t.insert(61);
		t.insert(11);
		t.insert(-3);
		t.insert(8);
		t.insert(45);
		t.insert(69);
		t.insert(19);
		t.inorder();
		System.out.println();
		t.printLeftView(t.root);
	}

	@Test
	public void printRightView() {
		BinarySearchTreeRecursive t = new BinarySearchTreeRecursive();
		t.insert(7);
		t.insert(9);
		t.insert(4);
		t.insert(6);
		t.insert(1);
		t.insert(-4);
		t.insert(-5);
		t.insert(43);
		t.insert(61);
		t.insert(11);
		t.insert(-3);
		t.insert(8);
		t.insert(45);
		t.insert(69);
		t.insert(19);
		t.inorder();
		System.out.println();
		t.printRightView(t.root);
	}
}
