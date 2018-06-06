package com.ng.learning.ds.linkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ng.learning.ds.linkedList.LinkedList;

/**
 * This class implements all the unit test methods of Linked List class.
 * 
 * @author NikhilGupta
 *
 */
public class TestLinkedList {

	private LinkedList linkedList;

	@Before
	public void setUp() {
		linkedList = new LinkedList();
	}

	@After
	public void tearDown() {
		linkedList = null;
	}

	@Test
	public void addAtBegin() {
		for (int i = 0; i < 10; i++) {
			linkedList.addAtBegin(i);
		}
		assertEquals(linkedList.length(), 10);
	}

	@Test
	public void addAtEnd() {

		for (int i = 0; i < 10; i++) {
			linkedList.addAtEnd(i);
		}
		assertEquals(linkedList.length(), 10);
	}

	@Test
	public void deleteAtBegin() {

		for (int i = 0; i < 10; i++) {
			linkedList.addAtBegin(i);
		}
		assertEquals(linkedList.length(), 10);
		assertEquals(linkedList.deleteAtBegin(), 9);
		assertEquals(linkedList.length(), 9);
	}

	@Test
	public void deleteAtEnd() {

		for (int i = 0; i < 10; i++) {
			linkedList.addAtEnd(i);
		}
		assertEquals(linkedList.length(), 10);
		assertEquals(linkedList.deleteAtEnd(), 9);
		assertEquals(linkedList.length(), 9);
	}

	@Test
	public void addAtIndex() {

		for (int i = 0; i < 10; i++) {
			linkedList.addAtEnd(i);
		}
		assertEquals(linkedList.length(), 10);
		linkedList.addAtIndex(8798, 3);
		assertEquals(linkedList.elementAt(3), 8798);
		assertEquals(linkedList.length(), 11);
	}

	@Test
	public void delteAtIndex() {

		for (int i = 0; i < 10; i++) {
			linkedList.addAtBegin(i);
		}
		assertEquals(linkedList.length(), 10);
		assertEquals(linkedList.deleteAtIndex(6), 3);
		assertEquals(linkedList.length(), 9);
	}

	@Test
	public void elementAt() {

		for (int i = 0; i < 10; i++) {
			linkedList.addAtBegin(i);
		}
		assertEquals(linkedList.length(), 10);
		assertEquals(linkedList.elementAt(3), 6);
	}

	@Test
	public void reverseLinkedList() {

		for (int i = 0; i < 10; i++) {
			linkedList.addAtEnd(i);
		}
		assertEquals(linkedList.length(), 10);
		int count = 9;
		linkedList.reverse();
		for (int i = 0; i < linkedList.length(); i++) {
			assertEquals(linkedList.elementAt(i), count--);
		}
	}

	@Test
	public void length() {
		for (int i = 0; i < 10; i++) {
			linkedList.addAtEnd(i);
		}
		assertEquals(linkedList.length(), 10);
	}

	@Test
	public void swapNodes() {

		for (int i = 10; i < 20; i++) {
			linkedList.addAtBegin(i);
		}
		assertEquals(linkedList.length(), 10);
		int index = linkedList.getIndex(18);
		int index1 = linkedList.getIndex(12);
		linkedList.swapNodes(12, 18);
		assertEquals(linkedList.getIndex(12), index);
		assertEquals(linkedList.getIndex(18), index1);
	}

	@Test
	public void searchFirstIndex() {

		linkedList.addAtBegin(5);
		linkedList.addAtBegin(6);
		linkedList.addAtBegin(7);
		linkedList.addAtBegin(8);
		linkedList.addAtBegin(9);
		linkedList.addAtBegin(9);
		linkedList.addAtBegin(10);
		linkedList.addAtBegin(11);
		linkedList.addAtBegin(12);
		linkedList.addAtBegin(11);
		linkedList.addAtBegin(5);

		assertEquals(linkedList.searchFirstIndex(9), 5);
	}

	@Test
	public void addAtMiddle() {

		for (int i = 1; i < 10; i++) {
			linkedList.addAtBegin(i);
		}
		linkedList.addAtMiddle(99879);
		assertEquals(linkedList.elementAt((linkedList.length() / 2) - 1), 99879);
	}

	@Test
	public void deleteAtMiddle() {

		for (int i = 1; i < 10; i++) {
			linkedList.addAtBegin(i);
		}
		assertEquals(linkedList.deleteAtMiddle(), 5);
	}

	@Test
	public void removeAdjacentDuplicate() {

		linkedList.addAtIndex(1, 0);
		linkedList.addAtIndex(1, 1);
		linkedList.addAtIndex(1, 2);
		linkedList.addAtIndex(2, 3);
		linkedList.addAtIndex(3, 4);
		linkedList.addAtIndex(3, 5);
		linkedList.addAtIndex(4, 6);
		linkedList.addAtIndex(5, 7);
		linkedList.addAtIndex(5, 8);
		linkedList.addAtIndex(5, 9);

		assertEquals(linkedList.length(), 10);
		linkedList.removeAdjacentDuplicates();
		assertEquals(linkedList.length(), 5);
	}

	@Test
	public void rotate() {

		linkedList.addAtEnd(10);
		linkedList.addAtEnd(20);
		linkedList.addAtEnd(30);
		linkedList.addAtEnd(40);
		linkedList.addAtEnd(50);
		linkedList.addAtEnd(60);
		linkedList.rotate(4);
	}

	@Test
	public void getNthNodeLastApproach1() {

		for (int i = 11; i < 20; i++) {
			linkedList.addAtEnd(i);
		}
		assertEquals(linkedList.getNthFromLastApproach1(3), 17);
	}

	@Test
	public void getNthNodeLastApproach2() {

		for (int i = 11; i < 20; i++) {
			linkedList.addAtEnd(i);
		}
		assertEquals(linkedList.getNthFromLastApproach2(3), 17);
	}

	@Test
	public void countNo() {

		linkedList.addAtEnd(11);
		linkedList.addAtEnd(13);
		linkedList.addAtEnd(25);
		linkedList.addAtEnd(20);
		linkedList.addAtEnd(11);
		linkedList.addAtEnd(3);
		linkedList.addAtEnd(13);
		linkedList.addAtEnd(12);
		linkedList.addAtEnd(16);
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(5);
		linkedList.addAtEnd(15);
		linkedList.addAtEnd(23);
		linkedList.addAtEnd(26);
		linkedList.addAtEnd(21);
		linkedList.addAtEnd(25);
		linkedList.addAtEnd(13);
		assertEquals(linkedList.count(13), 3);
	}

	@Test
	public void mergeLists() {
		LinkedList linkedList1 = new LinkedList();
		linkedList1.addAtEnd(5);
		linkedList1.addAtEnd(10);
		linkedList1.addAtEnd(15);
		linkedList1.addAtEnd(40);
		LinkedList linkedList2 = new LinkedList();
		linkedList2.addAtEnd(2);
		linkedList2.addAtEnd(3);
		linkedList2.addAtEnd(20);
		LinkedList linkedList3 = LinkedList.mergeSortListsRec(linkedList2, linkedList1);
		assertEquals(linkedList3.elementAt(0), 2);
	}

	@Test
	public void isPalindrome() {

		linkedList.addAtEnd(1);
		linkedList.addAtEnd(2);
		linkedList.addAtEnd(3);
		linkedList.addAtEnd(3);
		linkedList.addAtEnd(2);
		linkedList.addAtEnd(1);
		assertTrue("true", linkedList.isPalindrome());
	}

	@Test
	public void isPalindromeUsingRev() {

		linkedList.addAtEnd(1);
		linkedList.addAtEnd(2);
		linkedList.addAtEnd(3);
		linkedList.addAtEnd(2);
		linkedList.addAtEnd(1);
		assertTrue("true", linkedList.isPalindromeUsingRev());
	}

	@Test
	public void sumTwoLists() {

		linkedList.addAtBegin(5);
		linkedList.addAtBegin(9);
		LinkedList linkedListl = new LinkedList();
		linkedListl.addAtBegin(8);
		linkedListl.addAtBegin(7);
		linkedListl.addAtBegin(3);
		LinkedList linkedList2 = LinkedList.sumTwoLists(linkedList, linkedListl);
	}

	@Test
	public void pairWiseSwap() {

		linkedList.addAtEnd(1);
		linkedList.addAtEnd(2);
		linkedList.addAtEnd(3);
		linkedList.addAtEnd(4);

		linkedList.pairWiseSwap();
	}

	@Test
	public void compareTwoList() {

		linkedList.addAtBegin(1);
		linkedList.addAtBegin(3);
		linkedList.addAtBegin(2);
		LinkedList linkedListl = new LinkedList();
		linkedListl.addAtBegin(1);
		linkedListl.addAtBegin(3);
		linkedListl.addAtBegin(2);
		assertTrue("true", LinkedList.CompareLists(linkedList, linkedListl));
	}
}
