package com.example.data_structure.array;

public class ArrayOperations {
	int count;

	// Reverse an Array Iteratively
	public void reverseArrayIterative(int[] arr) {
		int temp;
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	// Reverse an Array Recursively
	public void reverseArrayRecursive(int[] arr, int start, int end) {
		int temp;
		if (start >= end)
			return;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseArrayRecursive(arr, start + 1, end - 1);
		}
	}

	// print Array
	public void printArray(int arr[]) {
		System.out.print("[");
		for (int arrr : arr) {
			System.out.print(arrr + " ");
		}
		System.out.println("]");
		System.out.println();
	}

	// Find Minimum element
	public int findMiniMum(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	// Find Maximum Element
	public int findMaxiMum(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public void leftRotate(int arr[], int d) {

		for (int i = 0; i < d; i++) {
			leftRotatebyOne(arr);

		}
	}
	/*
	 * METHOD 2 (Rotate one by one)
	 */

	public void leftRotatebyOne(int arr[]) {
		int i, temp;
		temp = arr[0];
		for (i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[i] = temp;
	}

	/*
	 * Find the minimum element in a sorted and rotated array A sorted array is
	 * rotated at some unknown point, find the minimum element in it.
	 */
	public int findMinRotatedApproach1(int[] a) {
		int start = 0;
		int end = a.length - 1;
		if (start == end)
			return a[start];
		int mid = start + end / 2;
		if (end < start)
			return a[0];
		if (mid < end && a[mid + 1] < a[mid])
			return a[mid + 1];

		if (mid > start && a[mid] < a[mid - 1])
			return a[mid];

		int min = Integer.MAX_VALUE;
		if (a[mid] > a[end]) {
			for (int i = mid; i <= end; i++) {
				if (a[i] < min) {
					min = a[i];
				}
			}
		} else {
			for (int i = mid; i >= start; i--) {
				if (a[i] < min) {
					min = a[i];
				}
			}

		}
		return min;
	}

	public int findMinRotatedApproach2(int[] a) {
		return findMinRotated(a, 0, (a.length - 1));
	}

	static int findMinRotated(int[] a, int start, int end) {
		if (start == end)
			return a[start];
		int mid = (start + end) / 2;
		if (end < start)
			return a[0];
		if (mid < end && a[mid + 1] < a[mid])
			return a[mid + 1];

		if (mid > start && a[mid] < a[mid - 1])
			return a[mid];
		if (a[end] > a[mid]) {
			return findMinRotated(a, start, mid - 1);
		} else {
			return findMinRotated(a, mid + 1, end);
		}

	}

	/*
	 * Quickly find multiple left rotations of an array Given an array of size n and
	 * multiple values around which we need to left rotate the array. How to quickly
	 * find multiple left rotations?
	 */
	public void leftRotationsMultiple(int[] arr, int k) {
		int n = arr.length;
		int[] temp = new int[2 * n];
		for (int i = 0; i < n; i++) {
			temp[i] = temp[i + n] = arr[i];
		}
		int start = k % n;
		for (int i = start; i < start + n; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.print("\n");
	}
	/*
	 * Find the Rotation Count in Rotated Sorted array Consider an array of distinct
	 * numbers sorted in increasing order. The array has been rotated
	 * (anti-clockwise) k number of times. Given such an array, find the value of k.
	 */

	public int countRotationApproach1(int[] arr) {
		return findPivot(arr, 0, arr.length - 1);
	}

	public int countRotationApproach2(int[] arr) {
		int index = -1;
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				index = i;
				break;
			}
		}
		return index;
	}

	/*
	 * Maximum sum of i*a[i] among all rotations of a given array Given an array a[]
	 * of n integers, find the maximum that maximizes sum of value of i*a[i] where i
	 * varies from 0 to n-1.
	 */

	public int findMaxSumRotatedArrayApproach1(int[] arr) {
		int max = Integer.MIN_VALUE;
		int tempMax = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {

			leftRotate(arr, i);
			int sum = 0;

			for (int j = 0; j < arr.length; j++) {
				sum += j * arr[j];
				tempMax = Math.max(sum, tempMax);
			}
			max = Math.max(max, tempMax);
		}
		return max;
	}

	public int findMaxSumRotatedArrayApproach2(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				int index = (i + j) % arr.length;
				sum += j * arr[index];

			}
			max = Math.max(sum, max);
		}
		return max;
	}
	/*
	 * Method 2 (Efficient Solution : O(n) )
	 * 
	 * The idea is to compute value of a rotation using value of previous rotation.
	 * When we rotate an array by one, following changes happen in sum of i*arr[i].
	 * 1) Multiplier of arr[i-1] changes from 0 to n-1, i.e., arr[i-1] * (n-1) is
	 * added to current value. 2) Multipliers of other terms is decremented by 1.
	 * i.e., (cum_sum – arr[i-1]) is subtracted from current value where cum_sum is
	 * sum of all numbers. next_val = curr_val - (cum_sum - arr[i-1]) + arr[i-1] *
	 * (n-1);
	 * 
	 * next_val = Value of ∑i*arr[i] after one rotation. curr_val = Current value of
	 * ∑i*arr[i] cum_sum = Sum of all array elements, i.e., ∑arr[i].
	 * 
	 * Lets take example {1, 2, 3}. Current value is 1*0+2*1+3*2 = 8. Shifting it by
	 * one will make it {2, 3, 1} and next value will be 8 - (6 - 1) + 1*2 = 5 which
	 * is same as 2*0 + 3*1 + 1*2
	 */

	public int findMaxSumRotatedArrayApproach3(int arr[]) {

		int n = arr.length;
		// Compute sum of all array elements
		int cum_sum = 0;
		for (int i = 0; i < n; i++)
			cum_sum += arr[i];

		// Compute sum of i*arr[i] for
		// initial configuration.
		int curr_val = 0;
		for (int i = 0; i < n; i++)
			curr_val += i * arr[i];

		// Initialize result
		int res = curr_val;

		// Compute values for other iterations
		for (int i = 1; i < n; i++) {
			// Compute next value using previous
			// value in O(1) time
			int next_val = curr_val - (cum_sum - arr[i - 1]) + arr[i - 1] * (n - 1);// Update current value
			curr_val = next_val;

			// Update result if required
			res = Math.max(res, next_val);
		}

		return res;
	}

	/*
	 * Given a sorted and rotated array, find if there is a pair with a given sum
	 * Given an array that is sorted and then rotated around an unknown point. Find
	 * if array has a pair with given sum. It may be assumed that all elements in
	 * array are distinct.
	 */
	public boolean pairSumInSortedRotated(int[] arr, int sum) {
		int i, n = arr.length;
		for (i = 0; i < n; i++) {
			if (arr[i] > arr[i + 1])
				break;
		}
		int l = (i + 1) % n;
		int r = i;
		while (l != r) {
			// If we find a pair with sum x, we
			// return true
			if (arr[l] + arr[r] == sum)
				return true;

			// If current pair sum is less, move
			// to the higher sum
			if (arr[l] + arr[r] < sum)
				l = (l + 1) % n;

			else // Move to the lower sum side
				r = (n + r - 1) % n;
		}
		return false;
	}

	// Search an element from sorted and rotated array Approach 2
	public void searchElementApproach1(int[] arr, int key) {
		int i = searchElementRec(arr, 0, arr.length - 1, key);
		if (i != -1)
			System.out.println(i);
		else
			System.out.println("Not Found");
	}

	static int searchElementRec(int[] arr, int start, int end, int key) {
		if (start > end)
			return -1;

		int mid = (start + end) / 2;
		if (arr[mid] == key)
			return mid;

		if (arr[start] <= arr[mid]) {
			if (key >= arr[start] && key <= arr[mid])
				return searchElementRec(arr, start, mid - 1, key);

			return searchElementRec(arr, mid + 1, end, key);

		}
		if (key >= arr[mid] && key <= arr[end])
			return searchElementRec(arr, mid + 1, end, key);

		return searchElementRec(arr, start, mid - 1, key);
	}

	public static int findPivot(int[] arr, int start, int end) {

		int mid = (start + end) / 2;
		if (end < start)
			return 0;
		if (arr[start] < arr[end])
			return start;

		if (arr[mid] > arr[mid + 1])
			return mid + 1;
		else if (arr[start] > arr[mid])
			return findPivot(arr, start, mid - 1);
		else
			return findPivot(arr, mid + 1, end);
	}

	// Search an element from sorted and rotated array Approach 2
	public void SearchElementApproach2(int[] arr, int key) {
		int i = searchElementApproachRec(arr, 0, arr.length - 1, key);
		if (i != -1)
			System.out.println(i);
		else
			System.out.println("Not Found");
	}

	public static int searchElementApproachRec(int[] arr, int start, int end, int key) {
		int pivot = findPivot(arr, start, end);
		if (key == arr[pivot])
			return pivot;
		if (key > arr[pivot] && key < arr[end]) {
			return binarySearchRec(arr, key, pivot + 1, end);
		} else {
			return binarySearchRec(arr, key, start, pivot - 1);
		}
	}

	public void binarySearch(int[] arr, int key) {
		int i = binarySearchRec(arr, key, 0, arr.length - 1);
		if (i != -1)
			System.out.println(i);
		else
			System.out.println("Not Found");
	}

	public static int binarySearchRec(int[] arr, int key, int start, int end) {
		if (start > end)
			return -1;
		int mid = (start + end) / 2;
		if (arr[mid] == key)
			return mid;
		if (key > arr[mid]) {
			return binarySearchRec(arr, key, mid + 1, end);
		} else {
			return binarySearchRec(arr, key, start, mid - 1);
		}
	}
}
