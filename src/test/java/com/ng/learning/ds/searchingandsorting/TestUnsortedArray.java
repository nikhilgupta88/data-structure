package com.ng.learning.ds.searchingandsorting;

import org.junit.Test;

import com.ng.learning.ds.searchingandsorting.UnsortedArray;

public class TestUnsortedArray {

	@Test
	public void findElement() {
		UnsortedArray ss = new UnsortedArray();
		int[] a = { 55, 8, 9, 65, 78, 23, 01, 10, 85, 69 };
		System.out.println(ss.findElement(a, 23));

	}

	@Test
	public void deleteElement() {
		UnsortedArray ss = new UnsortedArray();
		int[] a = { 55, 8, 9, 65, 78, 23, 01, 10, 85, 69 };
		System.out.print("\nBefore Delteion : ");
		ss.printArray(a, a.length);
		int n = ss.deleteElement(a, 55);
		System.out.print("\nAfter Delteion : ");
		ss.printArray(a, n);
	}

	@Test
	public void insertElement() {
		UnsortedArray ss = new UnsortedArray();
		int[] a = new int[20];
		a[0] = 9;
		a[1] = 19;
		a[2] = 91;
		a[3] = 39;
		a[4] = 49;
		a[5] = 95;
		a[6] = 96;
		a[7] = 85;
		System.out.print("\nBefore Insertion : ");
		ss.printArray(a, 8);
		int n = ss.insertElement(a, 8, 55, 20);
		System.out.print("\nAfter Insertion : ");
		ss.printArray(a, n);
	}

}
