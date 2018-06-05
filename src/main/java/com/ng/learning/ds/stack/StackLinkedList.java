package com.ng.learning.ds.stack;

import java.util.Stack;

public class StackLinkedList {
	private static class StackNode {

		private int data;
		StackNode next;

		public StackNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private StackNode top;

	public void push(int data) {
		StackNode newStackNode = new StackNode(data);
		if (top == null) {
		}
		newStackNode.next = top;
		top = newStackNode;
	}

	public int pop() {

		if (top == null)
			return -1;
		int item = top.data;
		top = top.next;
		return item;

	}

	public int peek() {
		if (top == null)
			return -1;
		return top.data;
	}

	public boolean isEmpty() {
		return top == null;

	}

	public void display() {
		if (top == null) {
			return;

		}

		StackNode current = top;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

	}

	public void reverse() {
		Stack<StackNode> s = new Stack<StackNode>();

		StackNode temp = top;

		if (top == null) {
			return;
		}

		while (temp != null) {
			s.push(temp);
			temp = temp.next;

		}
		StackNode temp1 = s.peek();
		top = temp1;
		s.pop();
		while (!s.empty()) {
			temp1.next = s.peek();
			s.pop();
			temp1 = temp1.next;
		}
		temp1.next = null;
	}

}
