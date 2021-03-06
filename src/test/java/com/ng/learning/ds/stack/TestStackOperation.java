package com.ng.learning.ds.stack;

import org.junit.Test;

import com.ng.learning.ds.stack.StackOperation;

public class TestStackOperation {
	@Test
	public void reverseArray() {
		StackOperation s = new StackOperation();
		StringBuffer ss = new StringBuffer("Hello World");
		System.out.println("Original string is : " + ss);

		// call reverse method
		s.reverse(ss);

		// print the reversed string
		System.out.println("Reversed string is : " + ss);

	}

	@Test
	public void isBalanced() {
		String exp = "{(())}";
		System.out.println((StackOperation.isBalanced(exp)) ? "YES" : "NO");

	}

	@Test
	public void infixToPostfix() {
		String exp = "a+b*(c^d-e)^(f+g*h)-i";
		System.out.println(StackOperation.infixToPostfix(exp));
	}

	@Test
	public void maximumRectangular() {
		int hist[] = { 6, 2, 5, 4, 5, 1, 6 };
		System.out.println("Maximum area is " + StackOperation.getMaxArea(hist));
	}
}
