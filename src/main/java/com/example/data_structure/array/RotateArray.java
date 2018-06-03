package com.example.data_structure.array;

public class RotateArray {

	/*
	 * Program for array left rotation Method 1
	 */
	public void leftRotate(int arr[], int d) {

		for (int i = 0; i < d; i++) {
			leftRotatebyOne(arr);
		}
	}

	private static void leftRotatebyOne(int arr[]) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	public void leftRotateReverse(int arr[], int d) {
		int n = arr.length;
		rvereseArray(arr, 0, d - 1);
		rvereseArray(arr, d, n - 1);
		rvereseArray(arr, 0, n - 1);
	}

	/* Function to reverse arr[] from index start to end */
	static void rvereseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	/*
	 * Program to cyclically rotate an array by one Given an array, cyclically
	 * rotate the array clockwise by one.
	 */
	public void leftRotateCyclic(int arr[], int d) {

		for (int i = 0; i <= d; i++) {
			cyclicRotateArray(arr);
		}
	}

	public void cyclicRotateArray(int arr[]) {
		int x = arr[arr.length - 1], i;
		for (i = arr.length - 1; i > 0; i--)
			arr[i] = arr[i - 1];
		arr[0] = x;
	}

	public void printArray(int arr[]) {
		for (int arrr : arr) {
			System.out.print(arrr + " ");
		}
		System.out.println();
	}

}
