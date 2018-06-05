package com.ng.learning.ds.searchingandsorting;

public class SortedArray {

	public int binarySearchIte(int[] a, int key) {
		int n = a.length, start = 0, end = n-1;
		int mid = (start+end)/ 2;
		if(key == a[mid]) {
			return mid;
		}
		else if(key > a[mid]) {
			for(int i = mid+1; i < n; i++) {
				if(a[i ] == key)
					return i;
			}
		}else if(key < a[mid]) {
			for(int i = start; i < mid; i++) {
				if(a[i] == key)
					return i;
			}
		}
		return -1;
	}
	
	public int binarySearchRec(int[] a, int key, int start, int end) {
		if(end < start)
			return -1;
		int mid = (start+end) /2;
		if(key == a[mid])
			return mid;
		 if(key > a[mid])
			return binarySearchRec(a, key, mid+1, end);
		 else 
		return binarySearchRec(a, key, start, mid-1);
		 
	}
	public void printArray(int[] a, int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
	}

	public int insertElement(int[] a, int n, int key, int capacity) {
		
		if(n >= capacity)
			return n;
		int i;
		for(i = n-1; (i >= 0 && a[i] > key); i--) {
			a[i+1] = a[i];
		}
		a[i+1] = key;
		
		return (n+1);
	}
	
	public int deleteElement(int[] a, int key) {
		int n = a.length;
		int pos = binarySearchRec(a, key, 0, n-1);
		if(pos == -1) {
			System.out.print("Element not found.");
			return n;
		}
		for(int i = pos; i < n-1; i++) {
			a[i] = a[i+1];
		}
			
		return n-1;
	}
}
