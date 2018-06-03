package com.example.data_structure.array;

import java.util.ArrayList;
import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			a.add(scan.next());
		}
		int q = scan.nextInt();
		for (int i = 0; i < q; i++) {
			int count = 0;
			String s = scan.next();
			for (String str : a) {
				System.out.println(a);
				if (str.equals(s))
					count++;
			}
			System.out.println(count);
		}
	}
}