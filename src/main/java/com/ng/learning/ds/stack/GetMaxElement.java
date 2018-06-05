package com.ng.learning.ds.stack;

import java.util.Scanner;
import java.util.Stack;

public class GetMaxElement {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		Stack<Integer> S = new Stack<Integer>();
		Stack<Integer> largest_stack = new Stack<Integer>();
		largest_stack.push(0);

		for (int i = 1; i <= n; i++) {
			int query = inp.nextInt();

			if (query == 1) {
				int newtop = inp.nextInt();
				S.push(newtop);

				if (S.peek() >= largest_stack.peek()) {
					largest_stack.push(S.peek());
				}

			}

			if (query == 2) {
				if (S.peek() == largest_stack.peek()) {
					largest_stack.pop();
				}

				S.pop();
			}

			if (query == 3) {
				System.out.println(largest_stack.peek());
			}

		}
	}
}