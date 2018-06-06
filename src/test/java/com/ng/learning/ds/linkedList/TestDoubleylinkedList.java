package com.ng.learning.ds.linkedList;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ng.learning.ds.linkedList.DoubleyLinkedList;

public class TestDoubleylinkedList {

	@Test
	public void addAtBegin() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<=10 ; i++) {
			dl.addAtBegin(i);
		}
		dl.display();
		assertEquals(dl.length(), 10);
	}
	
	@Test
	public void addAtEnd() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<=10 ; i++) {
			dl.addAtEnd(i);
			dl.addAtBegin(i+10);
		}
		dl.display();
		
		
	}
	@Test
	public void addAtIndex() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<=10 ; i++) {
			dl.addAtBegin(i);
		}
		dl.display();
		dl.addAtIndex(5616565, 10);
		dl.addAtIndex(989, 0);
		dl.addAtIndex(1253989, 3);
		dl.addAtIndex(129, 9);
		dl.addAtIndex(7859, 1);
		dl.display();
	}
	@Test
	public void deleteAtBegin() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<=10 ; i++) {
			dl.addAtBegin(i);
		}
		dl.display();
		assertEquals(dl.length(),10);
		dl.deleteAtBegin();
		dl.display();
		assertEquals(dl.length(),9);
	}
	@Test
	public void deleteAtEnd() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<=10 ; i++) {
			dl.addAtBegin(i);
		}
		assertEquals(dl.length(),10);dl.display();
		dl.deleteAtEnd();
		dl.display();
		assertEquals(dl.length(),9);
		
	}
	@Test
	public void deleteAtIndex() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<=10 ; i++) {
			dl.addAtBegin(i);
		}
		assertEquals(dl.length(),10);
		dl.display();
		dl.deleteAtIndex(10);
		dl.deleteAtIndex(0);
		dl.deleteAtIndex(3);
		dl.deleteAtIndex(1);
		dl.display();
		assertEquals(dl.length(), 6);
	}
	@Test
	public void remove() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<=10 ; i++) {
			dl.addAtBegin(i);
		}
		assertEquals(dl.length(),10);
		dl.display();
		dl.remove(9);
		dl.remove(5);		
		dl.remove(1);
		dl.display();
		assertEquals(dl.length(), 7);
	}
	@Test
	public void reverse() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<=10 ; i++) {
			dl.addAtBegin(i);
		}
		dl.display();
		dl.reverse();
		dl.display();
		}
	
	@Test
	public void searchFirstIndex() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		dl.addAtBegin(5);
		dl.addAtBegin(6);
		dl.addAtBegin(7);
		dl.addAtBegin(8);
		dl.addAtBegin(9);
		dl.addAtBegin(9);
		dl.addAtBegin(10);
		dl.addAtBegin(11);
		dl.addAtBegin(12);
		dl.addAtBegin(11);
		dl.addAtBegin(5);
		assertEquals(dl.searchFirstIndex(9), 5);
	}
	@Test
	public void addAtMiddle() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<=10 ; i++) {
			dl.addAtBegin(i);
		}
		dl.display();
		dl.addAtMiddle(99879);
		dl.display();
	
	}
	@Test
	public void deleteAtMiddle() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<10 ; i++) {
			dl.addAtBegin(i);
		}
		dl.display();
		dl.deleteAtMiddle();
		dl.display();
	}
	@Test
	public void getNodeFromLast() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		for(int i=1; i<=10 ; i++) {
			dl.addAtBegin(i);
		}
		dl.display();
		System.out.println(dl.GetNodeFromLast(6));
		}
	@Test
	public void sortedInsert() {
		DoubleyLinkedList dl = new DoubleyLinkedList();
		
		dl.sortedInsert(2);
		dl.sortedInsert(1);
		
		dl.sortedInsert(4);
		dl.sortedInsert(3);
		dl.display();
		
	}
		
}
