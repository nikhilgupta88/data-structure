package com.example.data_structure.stack;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		String s = "";
		Stack<String> stack = new Stack<String>();

		for (int i = 0; i < Q; i++) {
			int q = sc.nextInt();
			if (q == 1) {
				String s1 = sc.next();
				s = s + s1;
				stack.push(s);

			} else if (q == 2) {
				int j = sc.nextInt();
				s = s.substring(0, s.length() - j);
				stack.push(s);
			} else if (q == 3) {
				int j = sc.nextInt();
				System.out.println(s.charAt(j - 1));
			} else if (q == 4) {
				stack.pop();
				s = stack.peek();
			}
		}

	}
}
