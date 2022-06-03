package com.syntax.replit.hw052222;

import java.util.Scanner;

public class ForLoop65 {

	public static void main(String[] args) {
		
		/*
		 * Step1: does initialization 
		 * Step 2: checks condition 
		 * Step 3: does the print
		 * Step 4: then does the increment
		 */
		
		/*
		 * Given the following inputs: int x;
		 * Write a for loop that will print out a series of numbers 
		 * starting at one less than x and ending at 0.
		 * Sample input/outputs:
		 * In: 7
		 * 6 5 4 3 2 1 0
		 * 
		 * In: 12
		 * 11 10 9 8 7 6 5 4 3 2 1 0 
		 */
		
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter a number");
		int x = input.nextInt();

		System.out.println("Int: " + x);

		for (int num = x-1; num >= 0 ; num --) {
			System.out.print(num + " ");
		}
		input.close();
	}
}