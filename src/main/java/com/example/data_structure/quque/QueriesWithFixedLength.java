package com.example.data_structure.quque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueriesWithFixedLength {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		int[] v = new int[n];
		for (int i = 0; i < n; ++i) {
			v[i] = in.nextInt();
		}
		for (int j = 0; j < q; ++j) {
			int d = in.nextInt();
			Queue<Integer> qu = new LinkedList<Integer>();
			int myMin = Integer.MAX_VALUE;

			for (int i = 0; i < v.length; ++i) {
				if (qu.size() == d) {
					qu.remove();
					if (qu.size() > 0) {
						int cMax = qu.peek();
						for (int e : qu) {
							if (e >= cMax) {
								cMax = e;
							}
						}
						while (qu.peek() < cMax) {
							qu.remove();
						}
					}
				}
				while (qu.size() > 0 && v[i] >= qu.peek()) {
					qu.remove();
				}
				qu.add(v[i]);
				int m = qu.peek();
				if (m < myMin && i >= d - 1) {
					myMin = m;
				}
			}
			System.out.println(myMin);
		}

	}

}
