package com.example.data_structure.linkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ng.learning.ds.linkedList.LinkedList;

public class TestLinkedList {

	LinkedList l;

	@Before
	public void setUp() {
		l = new LinkedList();
	}

	@After
	public void tearUp() {
		l = null;
	}

	@Test
	public void addAtBegin() {
		for (int i = 0; i < 10; i++) {
			l.addAtBegin(i);
		}
		assertEquals(l.length(), 10);
	}

	@Test
	public void addAtEnd() {

		for (int i = 0; i < 10; i++) {
			l.addAtEnd(i);
		}
		assertEquals(l.length(), 10);
	}

	@Test
	public void deleteAtBegin() {

		for (int i = 0; i < 10; i++) {
			l.addAtBegin(i);
		}
		assertEquals(l.length(), 10);
		assertEquals(l.deleteAtBegin(), 9);
		assertEquals(l.length(), 9);
	}

	@Test
	public void deleteAtEnd() {

		for (int i = 0; i < 10; i++) {
			l.addAtEnd(i);
		}
		assertEquals(l.length(), 10);
		assertEquals(l.deleteAtEnd(), 9);
		assertEquals(l.length(), 9);
	}

	@Test
	public void addAtIndex() {

		for (int i = 0; i < 10; i++) {
			l.addAtEnd(i);
		}
		assertEquals(l.length(), 10);
		l.addAtIndex(8798, 3);
		assertEquals(l.elementAt(3), 8798);
		assertEquals(l.length(), 11);
	}

	@Test
	public void delteAtIndex() {

		for (int i = 0; i < 10; i++) {
			l.addAtBegin(i);
		}
		assertEquals(l.length(), 10);
		assertEquals(l.deleteAtIndex(6), 3);
		assertEquals(l.length(), 9);
	}

	@Test
	public void elementAt() {

		for (int i = 0; i < 10; i++) {
			l.addAtBegin(i);
		}
		assertEquals(l.length(), 10);
		assertEquals(l.elementAt(3), 6);
	}

	@Test
	public void reverseLinkedList() {

		for (int i = 0; i < 10; i++) {
			l.addAtEnd(i);
		}
		assertEquals(l.length(), 10);
		int count = 9;
		l.reverse();
		for (int i = 0; i < l.length(); i++) {
			assertEquals(l.elementAt(i), count--);
		}
	}

	@Test
	public void length() {
		for (int i = 0; i < 10; i++) {
			l.addAtEnd(i);
		}
		assertEquals(l.length(), 10);
	}

	@Test
	public void swapNodes() {

		for (int i = 10; i < 20; i++) {
			l.addAtBegin(i);
		}
		assertEquals(l.length(), 10);
		int index = l.getIndex(18);
		int index1 = l.getIndex(12);
		l.swapNodes(12, 18);
		assertEquals(l.getIndex(12), index);
		assertEquals(l.getIndex(18), index1);
	}

	@Test
	public void searchFirstIndex() {

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

		assertEquals(l.searchFirstIndex(9), 5);
	}

	@Test
	public void addAtMiddle() {

		for (int i = 1; i < 10; i++) {
			l.addAtBegin(i);
		}
		l.addAtMiddle(99879);
		assertEquals(l.elementAt((l.length() / 2) - 1), 99879);
	}

	@Test
	public void deleteAtMiddle() {

		for (int i = 1; i < 10; i++) {
			l.addAtBegin(i);
		}
		assertEquals(l.deleteAtMiddle(), 5);
	}

	@Test
	public void removeAdjacentDuplicate() {

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

		assertEquals(l.length(), 10);
		l.removeAdjacentDuplicates();
		assertEquals(l.length(), 5);
	}

	@Test
	public void rotate() {

		l.addAtEnd(10);
		l.addAtEnd(20);
		l.addAtEnd(30);
		l.addAtEnd(40);
		l.addAtEnd(50);
		l.addAtEnd(60);
		l.rotate(4);
	}

	@Test
	public void getNthNodeLastApproach1() {

		for (int i = 11; i < 20; i++) {
			l.addAtEnd(i);
		}
		assertEquals(l.getNthFromLastApproach1(3), 17);
	}

	@Test
	public void getNthNodeLastApproach2() {

		for (int i = 11; i < 20; i++) {
			l.addAtEnd(i);
		}
		assertEquals(l.getNthFromLastApproach2(3), 17);
	}

	@Test
	public void countNo() {

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
		assertEquals(l.count(13), 3);
	}

	@Test
	public void mergeLists() {
		LinkedList l1 = new LinkedList();
		l1.addAtEnd(5);
		l1.addAtEnd(10);
		l1.addAtEnd(15);
		l1.addAtEnd(40);
		LinkedList l2 = new LinkedList();
		l2.addAtEnd(2);
		l2.addAtEnd(3);
		l2.addAtEnd(20);
		LinkedList l3 = LinkedList.mergeSortListsRec(l2, l1);
		assertEquals(l3.elementAt(0), 2);
	}

	@Test
	public void isPalindrome() {

		l.addAtEnd(1);
		l.addAtEnd(2);
		l.addAtEnd(3);
		l.addAtEnd(3);
		l.addAtEnd(2);
		l.addAtEnd(1);
		assertTrue("true", l.isPalindrome());
	}

	@Test
	public void isPalindromeUsingRev() {

		l.addAtEnd(1);
		l.addAtEnd(2);
		l.addAtEnd(3);
		l.addAtEnd(2);
		l.addAtEnd(1);
		assertTrue("true", l.isPalindromeUsingRev());
	}

	@Test
	public void addTwoLists() {

		l.addAtEnd(5);
		l.addAtEnd(9);

		LinkedList ll = new LinkedList();
		ll.addAtEnd(8);
		ll.addAtEnd(7);
		ll.addAtEnd(3);

		LinkedList lll = new LinkedList();
		lll.sumTwoLists(l, ll);
	}

	@Test
	public void pairWiseSwap() {

		l.addAtEnd(1);
		l.addAtEnd(2);
		l.addAtEnd(3);
		l.addAtEnd(4);

		l.pairWiseSwap();
	}

	@Test
	public void compareTwoList() {

		l.addAtBegin(1);
		l.addAtBegin(3);
		l.addAtBegin(2);
		LinkedList ll = new LinkedList();
		ll.addAtBegin(1);
		ll.addAtBegin(3);
		ll.addAtBegin(2);
		assertTrue("true", LinkedList.CompareLists(ll, ll));
	}
}
