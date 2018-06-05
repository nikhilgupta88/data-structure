package com.ng.learning.ds.stack;

public class StackArray {

	private int top;
	private int[] a;
	private int MAX_SIZE;

	public StackArray(int MAX_SIZE) {
		this.MAX_SIZE = MAX_SIZE;
		this.a = new int[MAX_SIZE];
		this.top = -1;
	}

	public void push(int data) {
		if (top == MAX_SIZE - 1) {
			System.out.println("Error: Stack Overflow\n");

		}
		a[++top] = data;

	}

	public void pop() {
		if (isEmpty()) {
			System.out.println("Error: 	No Element to pop\n");

		}
		top--;

	}

	public int top() {
		return a[top];
	}

	public boolean isEmpty() {
		if (top == -1)
			return true;
		return false;
	}

	public void print() {
		System.out.print("\nStack: ");
		for (int i = 0; i <= top; i++) {
			System.out.print("  " + a[i]);

		}

	}
}
