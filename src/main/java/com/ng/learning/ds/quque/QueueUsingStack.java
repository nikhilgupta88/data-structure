package com.ng.learning.ds.quque;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void enqueue(int value) {
		stack1.push(value);
	}

	public int dequeue() {
		if (stack2.isEmpty()) {
			if (stack1.isEmpty()) {
				System.out.print("\nError: Queue is Empty.");
				System.exit(0);
			} else {
				while (!stack1.isEmpty()) {

					stack2.push(stack1.pop());
				}
			}
		}
		return stack2.pop();
	}

	public int front() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		return stack2.peek();
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		QueueUsingStack queue = new QueueUsingStack();
		for (int i = 0; i < Q; i++) {
			int q = sc.nextInt();

			if (q == 1) {
				queue.enqueue(sc.nextInt());
			} else if (q == 2) {
				queue.dequeue();
			}

			else if (q == 3) {
				System.out.println(queue.front());
			}

		}
	}
	/*
	 * private static long solve(List<Integer> numbers, int d, int N) {
	 * Queue<Integer> window = new LinkedList<>(); int min = Integer.MAX_VALUE; int
	 * max = -1; for (int i = 0; i < d; i++) { int current = numbers.get(i);
	 * window.add(current); if (current > max) max = current; }
	 * 
	 * if (max < min) min = max;
	 * 
	 * for (int i = 1; i <= N - d; i++) { int numToAdd = numbers.get(i + d - 1);
	 * window.add(numToAdd); if (numToAdd >= max) max = numToAdd;
	 * 
	 * if (window.remove() == max) { max = Collections.max(window); }
	 * 
	 * if (max < min) min = max; }
	 * 
	 * return min; }
	 */

}
