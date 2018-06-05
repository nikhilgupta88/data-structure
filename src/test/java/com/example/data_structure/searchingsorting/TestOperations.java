package com.example.data_structure.searchingsorting;

import org.junit.Test;

import com.ng.learning.ds.searchingandsorting.Operations;

public class TestOperations {

	@Test
	public void printPairsSum() {
		Operations o = new Operations();
		int[] a = { 1, 4, 45, 6, 8, 10, 2, 3 };
		o.printPairs(a, 5);
	}

	@Test
	public void hasPairsSum() {
		Operations o = new Operations();
		int[] a = { 1, 4, 45, 6, 8, 10, 2, 3 };
		if (o.hasTwoCandidate(a, 5)) {
		} else {
			System.out.println("Pairs Not Found");
		}

	}

	@Test
	public void findAllPairsSum() {
		Operations o = new Operations();
		int a[] = { 1, 2, 3, 7, 5, 4 };
		int b[] = { 0, 7, 4, 3, 2, 1 };
		o.findAllPairsApproach2(a, b, 8);
		o.findAllPairsApproach1(a, b, 8);
	}

	@Test
	public void countAllPairsSum() {
		Operations o = new Operations();
		int a[] = { 1, 2, 3, 7, 5, 4 };
		System.out.println(o.countPairsApproach1(a, 8));
		System.out.println(o.countPairsApproach2(a, 8));
	}

	@Test
	public void countAllPairsDiff() {
		Operations o = new Operations();
		int a[] = { 1, 5, 3, 4, 2 };
		System.out.println(o.countPairsDifferenceApproach1(a, 3));
	}
}
