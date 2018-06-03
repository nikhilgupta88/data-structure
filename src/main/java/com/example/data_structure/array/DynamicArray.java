package com.example.data_structure.array;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int lastans = 0;
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int x, y, q, index;

		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] list = new ArrayList[N];
		for (int i = 0; i < N; i++) {
			list[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < Q; i++) {
			q = sc.nextInt();
			x = sc.nextInt();
			y = sc.nextInt();

			if (q == 1) {
				index = ((x ^ lastans) % N);
				list[index].add(y);
			}
			if (q == 2) {
				index = ((x ^ lastans) % N);
				int l = y % (list.length);
				lastans = list[index].get(l);
				System.out.println(lastans);

			}
		}

	}
}
