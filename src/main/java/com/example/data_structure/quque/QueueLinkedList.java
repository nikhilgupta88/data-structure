package com.example.data_structure.quque;

import java.util.NoSuchElementException;

public class QueueLinkedList {

	static class QueueNode {

		private int data;
		private QueueNode next;

		public QueueNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private QueueNode rear;
	private QueueNode front;

	public QueueLinkedList() {
		this.front = null;
		this.rear = null;
	}

	public void enqueue(int data) {
		QueueNode newQueueNode = new QueueNode(data);

		if (IsEmpty()) {
			front = rear = newQueueNode;
		} else {
			rear.next = newQueueNode;

		}
		rear = newQueueNode;
	}

	public int dequeue() {
		if (front == null)
			return -1;
		int data = front.data;
		if (front == rear) {
			front = rear = null;
		} else {
			front = front.next;
		}
		return data;
	}

	public int front() {
		if (front == null)
			throw new NoSuchElementException();
		return front.data;
	}

	public boolean IsEmpty() {
		return (front == null && rear == null);
	}

	public void print() {
		if (IsEmpty()) {
			System.out.println("\nQueue is Empty");
		}
		System.out.print("\nQueue is: ");
		QueueNode current = front;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

	}

	public int size() {
		int count = 0;
		QueueNode temp = front;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}
}
