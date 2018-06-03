package com.example.data_structure.linkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinkedList {

	@Test
	public void addAtBegin() {
		LinkedListUser l = new LinkedListUser();
		for (int i = 0; i < 10; i++) {
			l.addAtBegin(i);
		}
		l.display();
		assertEquals(l.length(), 10);

	}

	@Test
	public void addAtEnd() {
		LinkedListUser l = new LinkedListUser();
		for (int i = 0; i < 10; i++) {
			l.addAtEnd(i);
		}
		l.display();
		assertEquals(l.length(), 10);
	}

	@Test
	public void deleteAtBegin() {
		LinkedListUser l = new LinkedListUser();
		for (int i = 0; i < 10; i++) {
			l.addAtBegin(i);
		}
		assertEquals(l.length(), 10);
		l.display();
		System.out.println();
		System.out.println(l.deleteAtBegin());
		l.display();
		assertEquals(l.length(), 9);
	}

	@Test
	public void deleteAtEnd() {
		LinkedListUser l = new LinkedListUser();
		for (int i = 0; i < 10; i++) {
			l.addAtEnd(i);
		}
		assertEquals(l.length(), 10);
		l.display();
		System.out.println();
		System.out.println(l.deleteAtEnd());
		l.display();
		assertEquals(l.length(), 9);
	}

	@Test
	public void addAtIndex() {
		LinkedListUser l = new LinkedListUser();
		for (int i = 0; i < 10; i++) {
			l.addAtEnd(i);
		}
		assertEquals(l.length(), 10);
		l.display();
		l.addAtIndex(4566546, 10);
		l.display();
		l.addAtIndex(8798, 3);
		l.display();
		assertEquals(l.length(), 12);
	}

	@Test
	public void delteAtIndex() {

		LinkedListUser l = new LinkedListUser();
		for (int i = 0; i < 10; i++) {
			l.addAtBegin(i);
		}
		assertEquals(l.length(), 10);
		l.display();
		System.out.println(l.deleteAtIndex(0));
		l.display();
		System.out.println(l.deleteAtIndex(5));
		l.display();
		assertEquals(l.length(), 8);
	}

	@Test
	public void elementAt() {
		LinkedListUser l = new LinkedListUser();

		for (int i = 0; i < 10; i++) {
			l.addAtBegin(i);
		}
		assertEquals(l.length(), 10);
		assertEquals(l.elementAt(3), 6);

	}

	@Test
	public void reverseLinkedListUser() {
		LinkedListUser l = new LinkedListUser();
		for (int i = 0; i < 10; i++) {
			l.addAtEnd(i);
		}
		assertEquals(l.length(), 10);
		l.display();
		l.reverse();
		l.display();
	}

	@Test
	public void swapNodes() {
		LinkedListUser l = new LinkedListUser();
		for (int i = 10; i < 20; i++) {
			l.addAtBegin(i);
		}
		assertEquals(l.length(), 10);
		l.display();
		l.swapNodes(12, 11);
		l.swapNodes(18, 15);
		l.display();

	}

	@Test
	public void searchFirstIndex() {
		LinkedListUser l = new LinkedListUser();
		l.addAtBegin(5);
		l.addAtBegin(6);
		l.addAtBegin(7);
		l.addAtBegin(8);
		l.addAtBegin(9);
		l.addAtBegin(9);
		l.addAtBegin(10);
		l.addAtBegin(11);
		l.addAtBegin(12);
		l.addAtBegin(11);
		l.addAtBegin(5);
		l.display();
		assertEquals(l.searchFirstIndex(9), 5);
	}

	@Test
	public void addAtMiddle() {
		LinkedListUser l = new LinkedListUser();
		for (int i = 1; i < 10; i++) {
			l.addAtBegin(i);
		}
		l.display();
		l.addAtMiddle(99879);
		l.display();
	}

	@Test
	public void deleteAtMiddle() {
		LinkedListUser l = new LinkedListUser();
		for (int i = 1; i <= 10; i++) {
			l.addAtBegin(i);
		}
		l.display();
		System.out.println(l.deleteAtMiddle());
		l.display();
	}

	@Test
	public void removeAdjacentDuplicate() {
		LinkedListUser l = new LinkedListUser();
		l.addAtIndex(1, 0);
		l.addAtIndex(1, 1);
		l.addAtIndex(1, 2);
		l.addAtIndex(2, 3);
		l.addAtIndex(3, 4);
		l.addAtIndex(3, 5);
		l.addAtIndex(4, 6);
		l.addAtIndex(5, 7);
		l.addAtIndex(5, 8);
		l.addAtIndex(5, 9);
		l.display();
		l.removeAdjacentDuplicates();
		l.display();
	}

	@Test
	public void rotate() {
		LinkedListUser l = new LinkedListUser();
		l.addAtEnd(10);
		l.addAtEnd(20);
		l.addAtEnd(30);
		l.addAtEnd(40);
		l.addAtEnd(50);
		l.addAtEnd(60);
		l.display();
		l.rotate(4);

	}

	@Test
	public void getNthNodeLast() {
		LinkedListUser l = new LinkedListUser();
		for (int i = 11; i < 20; i++) {
			l.addAtEnd(i);
		}
		l.display();
		System.out.println(l.getNthFromLast1(3));
		System.out.println(l.getNthFromLast(3));

	}

	@Test
	public void countNo() {
		LinkedListUser l = new LinkedListUser();
		l.addAtEnd(11);
		l.addAtEnd(13);
		l.addAtEnd(25);
		l.addAtEnd(20);
		l.addAtEnd(11);
		l.addAtEnd(3);
		l.addAtEnd(13);
		l.addAtEnd(12);
		l.addAtEnd(16);
		l.addAtEnd(5);
		l.addAtEnd(5);
		l.addAtEnd(15);
		l.addAtEnd(23);
		l.addAtEnd(26);
		l.addAtEnd(21);
		l.addAtEnd(25);
		l.addAtEnd(13);
		System.out.println(l.count(13));
		l.display();
	}

	@Test
	public void mergeLists() {
		LinkedListUser l1 = new LinkedListUser();
		l1.addAtEnd(5);
		l1.addAtEnd(10);
		l1.addAtEnd(15);
		l1.addAtEnd(40);
		LinkedListUser l2 = new LinkedListUser();
		l2.addAtEnd(2);
		l2.addAtEnd(3);
		l2.addAtEnd(20);
		l1.display();
		l2.display();
		LinkedListUser l3 = new LinkedListUser();
		l3.mergeSortListsRec(l2, l1);

	}

	@Test
	public void isPalindrome() {
		LinkedListUser l = new LinkedListUser();
		l.addAtEnd(1);
		l.addAtEnd(2);
		l.addAtEnd(3);
		l.addAtEnd(2);
		l.addAtEnd(1);
		System.out.println(l.isPalindrome());
		System.out.println(l.isPalindromeUsingRev());
		LinkedListUser ll = new LinkedListUser();
		ll.addAtEnd(1);
		ll.addAtEnd(2);
		ll.addAtEnd(3);
		ll.addAtEnd(3);
		ll.addAtEnd(2);
		ll.addAtEnd(1);
		System.out.println(ll.isPalindrome());
		System.out.println(ll.isPalindromeUsingRev());

	}

	@Test
	public void addTwoLists() {
		LinkedListUser l = new LinkedListUser();
		l.addAtEnd(5);
		l.addAtEnd(9);
		l.display();
		LinkedListUser ll = new LinkedListUser();
		ll.addAtEnd(8);
		ll.addAtEnd(7);
		ll.addAtEnd(3);
		ll.display();
		LinkedListUser lll = new LinkedListUser();
		lll.sumTwoLists(l, ll);
	}

	@Test
	public void pairWiseSwap() {
		LinkedListUser l = new LinkedListUser();
		l.addAtEnd(1);
		l.addAtEnd(2);
		l.addAtEnd(3);
		l.addAtEnd(4);
		l.display();
		l.pairWiseSwap();

	}

	@Test
	public void compareTwoList() {
		LinkedListUser l = new LinkedListUser();
		l.addAtBegin(1);
		l.addAtBegin(3);
		l.addAtBegin(2);
		LinkedListUser ll = new LinkedListUser();
		ll.addAtBegin(1);
		ll.addAtBegin(3);
		ll.addAtBegin(2);
		System.out.println(LinkedListUser.CompareLists(l, ll));
	}
}
