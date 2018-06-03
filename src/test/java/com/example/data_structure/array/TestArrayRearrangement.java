package com.example.data_structure.array;

import org.junit.Test;

public class TestArrayRearrangement {

	@Test
	public void rearangePositiveNegetive() {
		ArrayRearrangement ar = new ArrayRearrangement();
		int[] a = {1, -2, -3, 4, 5, -6, -7, 8, 9};
		ar.rearrangePositiveNegetive(a);
		ar.printArray(a);
		System.out.println();
		int[] a1 = {-1, 2, -3, -4, -5, -6, -7, 8, 9};
		ar.rearrangePositiveNegetive(a1);
		ar.printArray(a1);
	}
	
	@Test
	public void threeWayPartition() {
		ArrayRearrangement ar = new ArrayRearrangement();
		int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
       
		ar.printArray(arr);
	}
	@Test
	public void rearrangeMaxMinApproach1() {
		ArrayRearrangement ar = new ArrayRearrangement();
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ar.rearrangeMaxMinApproach1(arr);
        
	}
	@Test
	public void rearrangeMaxMinApproach2() {
		ArrayRearrangement ar = new ArrayRearrangement();
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ar.rearrangeMaxMinApproach2(arr);
        ar.printArray(arr);
	}
	@Test
	public void maxSumOfConsecutiveDifference() {
		ArrayRearrangement ar = new ArrayRearrangement();
		int[] arr = {4, 2, 1, 8, 9};
        System.out.println(ar.maxSumOfConsecutiveDifference(arr));
        
	}
	@Test
	public void alternateSorting() {
		ArrayRearrangement ar = new ArrayRearrangement();
		int[] arr = {4, 2, 1, 8, 9};
        ar.alternateSorting(arr);
        
	}
	@Test
	public void segregate0and1Approach1() {
		ArrayRearrangement ar = new ArrayRearrangement();
		int[] arr = {0, 1, 1, 0, 1, 0, 0};
        ar.segregate0and1Approach1(arr);
        
	}
	@Test
	public void segregate0and1Approach2() {
		ArrayRearrangement ar = new ArrayRearrangement();
		int[] arr = {0, 1, 1, 0, 1, 0, 0};
        ar.segregate0and1Approach2(arr);
        
	}
	@Test
	public void segregateEvenAndOddApproach1() {
		ArrayRearrangement ar = new ArrayRearrangement();
		int[] arr = {12, 34, 45, 9, 8, 90, 3};
        ar.segregateEvenAndOddApproach1(arr);;
        
	}
	@Test
	public void sortSubSequenceofSize3() {
		ArrayRearrangement ar = new ArrayRearrangement();
		int[] arr = {12, 11, 10, 5, 6, 2, 30};
        ar.sortSubSequenceofSize3(arr);
        
	}
	
}
