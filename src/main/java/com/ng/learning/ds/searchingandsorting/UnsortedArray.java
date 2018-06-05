package com.ng.learning.ds.searchingandsorting;

public class UnsortedArray {

	public int findElement(int[] a, int key) {
		int n = a.length;
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				return i;
			}
			
		}
		return -1;
	}
	public void printArray(int[] a, int n) {
		for(int i = 0; i < n; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public int insertElement(int[] a,int n, int key, int capacity) {
		
		if(n>=capacity)
			return n;
		
		a[n] = key;
		
		return (n+1);
	}
	
	public int deleteElement(int[] a, int key) {
		int n = a.length;
			int pos = findElement(a, key);
			if(pos == -1) {
				System.out.println("Elemet not Found");
			}
			int i;
			for(i = pos;i < n-1;i++){
				a[i] = a[i+1];
			}
			return n-1;
	}
}
