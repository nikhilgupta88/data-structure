package com.ng.learning.ds.searchingandsorting;

import org.junit.Test;

import com.ng.learning.ds.searchingandsorting.SortedArray;

public class TestSortedArray {

	@Test
	public void binarySearch() {
		SortedArray sa = new SortedArray();
		int[] a = { 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		System.out.println(sa.binarySearchIte(a, 10));
		System.out.println(sa.binarySearchRec(a, 10, 0, a.length - 1));

	}

	@Test
	public void insertElement() {
		SortedArray ss = new SortedArray();
		int arr[] = new int[20];
		arr[0] = 12;
		arr[1] = 16;
		arr[2] = 20;
		arr[3] = 40;
		arr[4] = 50;
		arr[5] = 70;
		System.out.print("\nBefore Insertion : ");
		ss.printArray(arr, 6);
		int n = ss.insertElement(arr, 6, 26, arr.length);
		System.out.print("\nAfter Insertion : ");
		ss.printArray(arr, n);
	}

	@Test
	public void deleteElement() {
		SortedArray ss = new SortedArray();
		int[] a = { 11, 12, 13, 14, 15, 16, 17, 18, 19 };
		System.out.print("\nBefore Delteion : ");
		ss.printArray(a, a.length);
		int n = ss.deleteElement(a, 15);
		System.out.print("\nAfter Delteion : ");
		ss.printArray(a, n);
	}

}
