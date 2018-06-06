package com.ng.learning.ds.array;

import org.junit.Test;

import com.ng.learning.ds.array.RotateArray;

public class TestRotateArray {

	@Test
	public void rotateArray() {
		RotateArray ra = new RotateArray();
		int arr[] = { 64, 37, 25, 22, 95, 85, 68 };
		ra.leftRotate(arr, 3);
		ra.printArray(arr);
	}

	@Test
	public void cyclicRotateArray() {
		RotateArray ra = new RotateArray();
		int arr[] = { 64, 37, 25, 22, 95, 85, 68 };
		ra.leftRotateCyclic(arr, 3);
		ra.printArray(arr);
	}

	@Test
	public void rotateArrayByReverse() {
		RotateArray ra = new RotateArray();
		int arr[] = { 64, 37, 25, 22, 95, 85, 68 };
		ra.leftRotateReverse(arr, 5);
		ra.printArray(arr);
	}
}
