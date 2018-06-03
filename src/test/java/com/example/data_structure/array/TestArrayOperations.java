package com.example.data_structure.array;

import org.junit.Test;

public class TestArrayOperations {

	@Test
	public void reverseArray() {
		ArrayOperations ra = new ArrayOperations();
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		ra.printArray(arr);
		ra.reverseArrayIterative(arr);
		ra.reverseArrayRecursive(arr, 0, arr.length - 1);
		ra.printArray(arr);
	}

	@Test
	public void findMinimum() {
		ArrayOperations ao = new ArrayOperations();
		int[] arr = { 5, 6, 9, 4, 8, 3, 7, 10 };
		System.out.println(ao.findMiniMum(arr));
	}

	@Test
	public void findMaximum() {
		ArrayOperations ao = new ArrayOperations();
		int[] arr = { 5, 6, 9, 4, 8, 3, 7, 10 };

		System.out.println(ao.findMaxiMum(arr));
	}

	@Test
	public void findMinRotatedApproach1() {
		ArrayOperations ao = new ArrayOperations();
		int arr1[] = { 5, 6, 1, 2, 3, 4 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach1(arr1));

		int arr2[] = { 1, 2, 3, 4 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach1(arr2));

		int arr3[] = { 1 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach1(arr3));

		int arr4[] = { 1, 2 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach1(arr4));

		int arr5[] = { 2, 1 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach1(arr5));

		int arr6[] = { 5, 6, 7, 1, 2, 3, 4 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach1(arr6));

		int arr7[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach1(arr7));

		int arr8[] = { 2, 3, 4, 5, 6, 7, 8, 1 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach1(arr8));

		int arr9[] = { 3, 4, 5, 1, 2 };

		System.out.println("The minimum element is " + ao.findMinRotatedApproach1(arr9));
	}

	@Test
	public void findMinRotatedApproach2() {
		ArrayOperations ao = new ArrayOperations();
		int arr1[] = { 5, 6, 1, 2, 3, 4 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach2(arr1));

		int arr2[] = { 1, 2, 3, 4 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach2(arr2));

		int arr3[] = { 1 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach2(arr3));

		int arr4[] = { 1, 2 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach2(arr4));

		int arr5[] = { 2, 1 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach2(arr5));

		int arr6[] = { 5, 6, 7, 1, 2, 3, 4 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach2(arr6));

		int arr7[] = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach2(arr7));

		int arr8[] = { 2, 3, 4, 5, 6, 7, 8, 1 };
		System.out.println("The minimum element is " + ao.findMinRotatedApproach2(arr8));

		int arr9[] = { 3, 4, 5, 1, 2 };

		System.out.println("The minimum element is " + ao.findMinRotatedApproach2(arr9));
	}

	@Test
	public void leftRotationMultiple() {
		ArrayOperations ao = new ArrayOperations();
		int arr[] = { 1, 3, 5, 7, 9 };

		int k = 1;
		ao.leftRotationsMultiple(arr, k);

		k = 2;
		ao.leftRotationsMultiple(arr, k);

		k = 3;
		ao.leftRotationsMultiple(arr, k);

		k = 4;
		ao.leftRotationsMultiple(arr, k);

		k = 14;
		ao.leftRotationsMultiple(arr, k);

	}

	@Test
	public void countRotation1() {
		ArrayOperations ao = new ArrayOperations();
		int arr[] = { 12, 13, 14, 25, 6, 11 };
		System.out.print("k = " + ao.countRotationApproach1(arr));
	}

	@Test
	public void countRotation2() {
		ArrayOperations ao = new ArrayOperations();
		int arr[] = { 12, 13, 14, 24, 6, 11 };
		System.out.print("k = " + ao.countRotationApproach2(arr));
	}

	@Test
	public void findMaxSumRotatedArray1() {
		ArrayOperations ao = new ArrayOperations();
		int arr[] = { 8, 3, 1, 2 };
		System.out.print("Max : " + ao.findMaxSumRotatedArrayApproach1(arr));
	}

	@Test
	public void findMaxSumRotatedArray2() {
		ArrayOperations ao = new ArrayOperations();
		int arr[] = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.print("Max : " + ao.findMaxSumRotatedArrayApproach2(arr));
	}

	@Test
	public void findMaxSumRotatedArray3() {
		ArrayOperations ao = new ArrayOperations();
		int arr[] = { 8, 3, 1, 2 };
		System.out.println("Max : " + ao.findMaxSumRotatedArrayApproach3(arr));
		int arr1[] = { 1, 20, 2, 10 };
		System.out.println("Max : " + ao.findMaxSumRotatedArrayApproach3(arr1));

	}

	@Test
	public void isPairSumInSortedRotated() {
		ArrayOperations ao = new ArrayOperations();
		int arr[] = { 11, 15, 6, 8, 9, 10 };
		int sum = 16;
		System.out.println(ao.pairSumInSortedRotated(arr, sum));
	}

	@Test
	public void searchElementApproach1() {
		ArrayOperations ao = new ArrayOperations();
		int arr[] = { 14, 5, 6, 7, 8, 9, 1, 2, 3 };
		ao.searchElementApproach1(arr, 6);
		int arr1[] = { 14, 6, 7, 8, 9, 10, 11, 12, 13 };
		ao.searchElementApproach1(arr1, 10);

	}

	@Test
	public void searchElementApproach2() {
		ArrayOperations ao = new ArrayOperations();
		int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		ao.SearchElementApproach2(arr, 6);
		int arr1[] = { 5, 6, 7, 8, 9, 10, 1, 2, 3 };
		ao.SearchElementApproach2(arr1, 5);

	}

	@Test
	public void binarySearchRec() {
		ArrayOperations ao = new ArrayOperations();
		int arr[] = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		ao.binarySearch(arr, 15);
		int arr1[] = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		ao.binarySearch(arr1, 10);

	}

	@Test
	public void findPivot() {

		int arr[] = { 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		System.out.println(ArrayOperations.findPivot(arr, 0, arr.length - 1));
		int arr1[] = { 14, 17, 18, 20, 21, 22, 23, 24, 12 };
		System.out.println(ArrayOperations.findPivot(arr1, 0, arr1.length - 1));

	}

}
