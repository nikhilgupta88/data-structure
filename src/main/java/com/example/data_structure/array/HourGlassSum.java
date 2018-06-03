package com.example.data_structure.array;

import java.util.Scanner;

public class HourGlassSum {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[6][6];
		System.out.println(" Enter Values:");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = sc.nextInt();

			}
		}

		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int temp = a[i][j] + a[i][j + 1] + a[i][j + 2] + a[i + 1][j + 1] + a[i + 2][j] + a[i + 2][j + 1]
						+ a[i + 2][j + 2];
				if (temp > sum) {
					sum = temp;
				}
			}

		}

		System.out.println("The Sum is: " + sum);

	}
}
