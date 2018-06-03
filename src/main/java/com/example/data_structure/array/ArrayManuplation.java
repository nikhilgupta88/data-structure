package com.example.data_structure.array;

import java.util.*;

public class ArrayManuplation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int k = sc.nextInt();
			for (int j = a - 1; j < b; j++)
				arr[j] = arr[j] + k;
			for (long aa : arr) {
				System.out.print("\nArray is" + aa);
			}
		}
		sc.close();
		long max = 0;
		for (int jj = 0; jj < n; jj++) {
			if (max < arr[jj]) {
				max = arr[jj];

			}
		}

		System.out.println("The Maximum element is:" + max);
	}
}
