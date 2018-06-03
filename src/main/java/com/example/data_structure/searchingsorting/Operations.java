package com.example.data_structure.searchingsorting;

import java.util.Arrays;
import java.util.HashMap;

public class Operations {
	/*Q.3 Given an array A[] and a number x, check for pair in A[] with sum as x */
	
	public void printPairs(int[] a, int sum) {
		final int max = 100000;
		boolean[] binmap = new boolean[max];
		for(int i = 0; i < a.length; i++) {
			int temp = sum-a[i];
			if(temp>=0 && binmap[temp]) {
				System.out.println("Pair with Given Sum "+sum+ " is ("+a[i]+", "+temp+")");
			}
			binmap[a[i]] = true;
		}
	}
	/*Q.3 Given an array A[] and a number x, check for pair in A[] with sum as x */
	public boolean hasTwoCandidate(int[]a, int sum) {
		Arrays.sort(a);
		int n = a.length, start = 0, end = n-1;
		while(start < end) {
		if(a[start] + a[end] == sum) {
			System.out.println("Pair with Given Sum "+sum+ 
					" is ("+a[start]+", "+a[end]+")");
			return true;
		}
		if(a[start]+a[end] < sum)
			start++;
		else
			end--;
		}
		return false;
	}
/*Given two unsorted arrays, find all pairs whose sum is x
Given two unsorted arrays of distinct elements, 
the task is to find all pairs from both arrays whose sum is equal to x.
*/
	public void findAllPairsApproach1(int[] a, int[] b, int sum) {
		int n1 = a.length, n2 = b.length;
		for(int i = 0;i < n1; i++) {
			for(int j = 0; j < n2; j++) {
				if(a[i]+a[j] == sum) {
					System.out.println("Pair with given sum "+sum+" is ("+a[i]+", "+a[j]+")");
				}
			}
		}
	}
	
	public void findAllPairsApproach2(int[] a, int[] b, int sum) {
	
		int n1 = a.length, n2 = b.length;
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for(int i = 0; i < n1; i++) {
			hs.put(a[i], 0);
		}
		for(int j = 0; j < n2; j++) {
			if(hs.containsKey(sum - b[j])) {
				System.out.println("Pair with given sum "+sum+" is ("+(sum-b[j])+", "+b[j]+")");
			}
		}
		
	}
	
/*Count pairs with given sum
Given an array of integers, and a number �sum�, 
find the number of pairs of integers in the array whose sum is equal to �sum�.
*/
	public int countPairsApproach1(int[] a, int sum) {
		int n = a.length, count = 0;
		
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if(a[i]+a[j] == sum)
					count++;
			}
		}
		return count;
	}
	public int countPairsApproach2(int[] a, int sum) {
		int n = a.length, twice_count = 0;
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++) {
			if(!hs.containsKey(a[i]))
				hs.put(a[i], 0);
			
			hs.put(a[i], hs.get(a[i])+1);
		}
		for(int j = 0; j <n; j++) {
			if(hs.get((sum - a[j]))!= null)
					twice_count += hs.get(sum-a[j]);
			if(sum-a[j] == a[j])
				twice_count--;
		}
		
		return (twice_count/2);
	}
	
/*Count all distinct pairs with difference equal to k
Given an integer array and a positive integer k, 
count all distinct pairs with difference equal to k.
*/
	public int countPairsDifferenceApproach1(int[] a, int diff) {
		int n = a.length, count = 0;
		for(int i =0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if((Math.abs(a[i] - a[j])) == diff)
					count++;
			}
		}
		return count;
	}
	public int countPairsDifferenceApproach2(int[] a, int diff) {
		int n = a.length, count = 0;
		Arrays.sort(a);
		
		for(int i =0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				if((Math.abs(a[i] - a[j])) == diff)
					count++;
			}
		}
		return count;
	}
	
}

