package com.ng.learning.ds.array;

import java.util.Arrays;

public class ArrayRearrangement {

	public void printArray(int[] a) {
		for (int arr : a) {
			System.out.print(arr + " ");
		}
	}

	/*
	 * Q.1 Rearrange positive and negative numbers in O(n) time and O(1) extra space
	 * An array contains both positive and negative numbers in random order.
	 * Rearrange the array elements so that positive and negative numbers are placed
	 * alternatively. Number of positive and negative numbers need not be equal. If
	 * there are more positive numbers they appear at the end of the array. If there
	 * are more negative numbers, they too appear in the end of the array.
	 * 
	 * For example, if the input array is [-1, 2, -3, 4, 5, 6, -7, 8, 9], then the
	 * output should be [9, -7, 8, -3, 5, -1, 2, 4, 6]
	 */
	public void rearrangePositiveNegetive(int[] a) {

		int temp = 0, i = -1;
		for (int j = 0; j < a.length; j++) {

			if (a[j] < 0) {
				i++;
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int pos = i + 1, neg = 0;
		while (pos < a.length && neg < pos && a[neg] < 0) {
			temp = a[neg];
			a[neg] = a[pos];
			a[pos] = temp;
			pos++;
			neg += 2;
		}

	}

	/*
	 * Q.7 Three way partitioning of an array around a given range Given an array
	 * and a range [lowVal, highVal], partition the array around the range such that
	 * array is divided in three parts. 1) All elements smaller than lowVal come
	 * first. 2) All elements in range lowVal to highVVal come next. 3) All elements
	 * greater than highVVal appear in the end. The individual elements of three
	 * sets can appear in any order.
	 */

	/*
	 * Q. 8 Rearrange an array in maximum minimum form | Set 1 Given a sorted array
	 * of positive integers, rearrange the array alternately i.e first element
	 * should be maximum value, second minimum value, third second max, fourth
	 * second minimum and so on.
	 */
	public void rearrangeMaxMinApproach1(int[] a) {
		int start = 0, end = a.length - 1;

		int[] temp = new int[a.length];
		boolean flag = true;

		for (int i = 0; i < a.length; i++) {
			if (flag)
				temp[i] = a[end--];
			else
				temp[i] = a[start++];
			flag = !flag;
		}
		a = temp.clone();

		printArray(a);
	}

	/* Q.9 Rearrange an array in maximum minimum form | Set 2 (O(1) extra space) */

	public void rearrangeMaxMinApproach2(int[] a) {
		int n = a.length;
		int max_idx = n - 1, min_idx = 0;
		int max_ele = a[n - 1] + 1;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				a[i] += (a[max_idx] % max_ele) * max_ele;
				max_idx--;
			} else {
				a[i] += (a[min_idx] % max_ele) * max_ele;
				min_idx++;
			}
		}
		for (int i = 0; i < n; i++)
			a[i] = a[i] / max_ele;
	}

	/*
	 * Q.11 Maximize sum of consecutive differences in a circular array
	 */

	public int maxSumOfConsecutiveDifference(int[] a) {
		int n = a.length, sum = 0;
		Arrays.sort(a);
		printArray(a);
		for (int i = 0; i < n / 2; i++) {
			sum -= (2 * a[i]);
			sum += (2 * a[n - i - 1]);
		}
		return sum;

	}

	/*
	 * Q.12 Alternative Sorting Given an array of integers, print the array in such
	 * a way that the first element is first maximum and second element is first
	 * minimum and so on.
	 */
	public void alternateSorting(int[] a) {
		int n = a.length;
		int start = 0, end = n - 1;
		Arrays.sort(a);

		while (start < end) {
			System.out.print(a[end--] + " ");
			System.out.print(a[start++] + " ");
		}

		if (n % 2 != 0) {
			System.out.println(a[start]);
		}
	}

	/*
	 * Q.13 Segregate 0s and 1s in an array You are given an array of 0s and 1s in
	 * random order. Segregate 0s on left side and 1s on right side of the array.
	 * Traverse array only once. Input array = [0, 1, 0, 1, 0, 0, 1, 1, 1, 0] Output
	 * array = [0, 0, 0, 0, 0, 1, 1, 1, 1, 1] Time Complexity O(n)
	 */
	public void segregate0and1Approach1(int[] a) {
		int count = 0, n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				count++;
			}
		}
		for (int i = 0; i < count; i++) {
			a[i] = 0;
		}
		for (int i = count; i < n; i++) {
			a[i] = 1;
		}
		printArray(a);
	}

	/*
	 * Q.13 Segregate 0s and 1s in an array
	 */
	public void segregate0and1Approach2(int[] a) {
		int n = a.length, left = 0, right = n - 1;
		while (left < right) {
			while (a[left] == 0) {
				left++;
			}
			while (a[right] == 1) {
				right--;
			}
			if (left < right) {
				a[left] = 0;
				a[right] = 1;
				left++;
				right--;

			}
		}
		printArray(a);

	}
	/*
	 * Q.14 Segregate Even and Odd numbers Given an array A[], write a function that
	 * segregates even and odd numbers. The functions should put all even numbers
	 * first, and then odd numbers.
	 */

	public void segregateEvenAndOddApproach1(int[] a) {
		int n = a.length, left = 0, right = n - 1;
		while (left < right) {
			while (a[left] % 2 == 0) {
				left++;
			}
			while (a[right] % 2 != 0) {
				right--;
			}

			if (left < right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}

		}
		printArray(a);
	}
	/*
	 * Find a sorted subsequence of size 3 in linear time Given an array of n
	 * integers, find the 3 elements such that a[i] < a[j] < a[k] and i < j < k in
	 * 0(n) time. If there are multiple such triplets, then print any one of them.
	 */

	public void sortSubSequenceofSize3(int[] a) {
		int n = a.length, min = 0, max = n - 1, i;
		int[] smaller = new int[n];
		smaller[0] = -1;
		for (i = 0; i < n; i++) {
			if (a[i] <= a[min]) {
				min = i;
				smaller[i] = -1;
			} else {
				smaller[i] = min;
			}
		}
		int[] greater = new int[n];
		greater[n - 1] = -1;
		for (i = n - 2; i >= 0; i--) {
			if (a[i] >= a[max]) {
				max = i;
				greater[i] = -1;
			} else {
				greater[i] = max;
			}
		}
		for (i = 0; i < n; i++) {
			if (smaller[i] != -1 && greater[i] != -1) {
				System.out.print(a[smaller[i]] + " " + a[i] + " " + a[greater[i]]);
				return;
			}
		}

		// If we reach number, then there are no such 3 numbers
		System.out.println("No such triplet found");
		return;
	}

}
