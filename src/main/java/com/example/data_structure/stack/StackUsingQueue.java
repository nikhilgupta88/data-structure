package com.example.data_structure.stack;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {

	Queue<Integer> q = new LinkedList<Integer>();

	public void push(int val) {
		// get previous size of queue
		int size = q.size();

		// Add current element
		q.add(val);

		// Pop (or Dequeue) all previous
		// elements and put them after current
		// element
		for (int i = 0; i < size; i++) {
			// this will add front element into
			// rear of queue
			int x = q.remove();
			q.add(x);
		}
	}

	// Removes the top element
	public int pop() {
		if (q.isEmpty()) {
			System.out.println("No elements");
			return -1;
		}
		int x = q.remove();
		return x;
	}

	// Returns top of stack
	public int top() {
		if (q.isEmpty())
			return -1;
		return q.peek();
	}

	// Returns true if Stack is empty else false
	public boolean isEmpty() {
		return q.isEmpty();
	}

	public void display(StackUsingQueue s) {
		if (s.isEmpty()) {
			return;

		}
		while (!s.isEmpty()) {
			System.out.print(s.top() + " ");
			s.pop();
		}

	}

}
