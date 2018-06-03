package com.example.data_structure.array;

import java.util.Scanner;

public class ArrayTwoD {

	public static void main (String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int[][] x = new int[6][6];
		System.out.println("Enter Values: ");
		for (int i = 0; i< x.length; i++) {
			for(int j = 0; j< x[i].length; j++) {
				x[i][j] = sc.nextInt();
			}
		}
		System.out.println("You Entered:");
		for (int i = 0; i< x.length; i++) {
			for(int j = 0; j< x[i].length; j++) {
				System.out.print(x[i][j]+"   ");
			}
		
			}
		}
	
	}
