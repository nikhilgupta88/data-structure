package com.example.data_structure.quque;

import java.util.Stack;

public class QueueOperation {

	public void reverse(QueueLinkedList queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while (!queue.IsEmpty()) {
			stack.push(queue.front());
			queue.dequeue();
		}
		while (!stack.isEmpty()) {
			queue.enqueue(stack.peek());
			stack.pop();
		}
	}

	public void reverseA(QueueArray queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while (!queue.IsEmpty()) {
			stack.push(queue.front());
			queue.dequeue();
		}
		while (!stack.isEmpty()) {
			queue.enqueue(stack.peek());
			stack.pop();
		}
	}

	public void reverseQueueFirstKElements(QueueLinkedList queue, int k) {

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < k; i++) {
			stack.push(queue.front());
			stack.pop();
		}
		while (!stack.isEmpty()) {
			queue.enqueue(stack.peek());
			stack.pop();
		}
		for (int i = 0; i < queue.size() - k; i++) {
			queue.enqueue(queue.front());
			queue.dequeue();
		}
	}

	public void interLeave(QueueLinkedList queue) {
		Stack<Integer> stack = new Stack<Integer>();
		if (queue.size() % 2 != 0) {
			return;
		}
		int halfSize = queue.size() / 2;
		for (int i = 0; i < halfSize; i++) {
			stack.push(queue.front());
			queue.dequeue();
		}
		while (!stack.isEmpty()) {
			queue.enqueue(stack.peek());
			stack.pop();
		}
		for (int i = 0; i < halfSize; i++) {
			queue.enqueue(queue.front());
			queue.dequeue();
		}

		for (int i = 0; i < halfSize; i++) {
			stack.push(queue.front());
			queue.dequeue();
		}

		// interleave the elements of queue and stack
		// queue: 11 16 12 17 13 18 14 19 15 20
		while (!stack.empty()) {
			queue.enqueue(stack.peek());
			stack.pop();
			queue.enqueue(queue.front());
			queue.dequeue();
		}
	}

}
