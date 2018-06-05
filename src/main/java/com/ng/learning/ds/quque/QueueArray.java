package com.ng.learning.ds.quque;

public class QueueArray {

	private int[] a;
	private int front, rear;

	public QueueArray(int MAX_SIZE) {
		this.a = new int[MAX_SIZE];
		front = -1;
		rear = -1;
	}

	public boolean IsEmpty() {
		return (front == -1 && rear == -1);
	}

	public void enqueue(int x) {
		int N = a.length;

		if (IsFull()) {
			System.out.print("\nError: Queue is Full.");
			return;
		} else if (IsEmpty()) {
			front = rear = 0;
		} else {
			rear = ((rear + 1) % N);
		}
		a[rear] = x;
	}

	public void dequeue() {
		int N = a.length;

		if (IsEmpty()) {
			System.out.print("\nError: Queue is Empty.");
			return;
		} else if (front == rear) {
			front = rear = -1;
		} else {
			front = ((front + 1) % N);
		}

	}

	public int front() {
		if (front == -1) {
			System.out.println("\nError: cannot return front from empty queue.");
			return -1;
		}
		return a[front];
	}

	public boolean IsFull() {
		int N = a.length;

		return (rear + 1) % N == front ? true : false;
	}

	public void print() {
		int N = a.length;

		System.out.print("\nThe Queue:");
		int count = (rear + N - front) % N + 1;
		for (int i = 0; i < count; i++) {
			int index = (front + i) % N;
			System.out.print(" " + a[index]);

		}

	}

}
