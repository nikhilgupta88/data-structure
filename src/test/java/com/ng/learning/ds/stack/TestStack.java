package com.ng.learning.ds.stack;

import org.junit.Test;

import com.ng.learning.ds.stack.StackArray;
import com.ng.learning.ds.stack.StackLinkedList;
import com.ng.learning.ds.stack.StackUsingQueue;

public class TestStack {

	@Test
	public void testStack() {
		StackArray s = new StackArray(10);
		s.push(35);
		s.print();
		s.push(25);
		s.print();
		s.pop();
		s.print();
		s.push(16);
		s.print();
		s.push(15);
		s.push(10);
		s.push(11);
		s.print();
		s.pop();
		s.print();
	}

	@Test
	public void testStackLinkedList() {
		StackLinkedList s = new StackLinkedList();
		s.push(18);
		s.display();
		s.push(17);
		s.display();
		s.push(16);
		s.display();
		s.push(15);
		s.display();
		s.pop();
		s.display();
	}

	@Test
	public void reverseLinkedlist() {
		StackLinkedList s = new StackLinkedList();
		System.out.println("\nOriginal string is : ");
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.display();

		// call reverse method
		s.reverse();
		// print the reversed string
		System.out.println("\nReversed string is : ");
		s.display();
	}

	@Test
	public void testStackUsingQueue() {
		StackUsingQueue s = new StackUsingQueue();
		for (int i = 11; i < 20; i++) {
			s.push(i);

		}
		s.pop();
		s.display(s);

	}

}
