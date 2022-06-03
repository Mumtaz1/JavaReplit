package com.syntax.replit.hw052222;

import java.util.Scanner;

public class ForLoop64 {

	public static void main(String[] args) {
		
		/*
		 * Step1: does initialization 
		 * Step 2: checks condition 
		 * Step 3: does the print
		 * Step 4: then does the increment
		 */

		/*
		 * You should input: int end;
		 * Write a for loop that will print out a series of numbers
		 * starting at 0 and ending at the doubled value of end
		 * (value must be taken from a user), exclusive.
		 * 
		 * Example Output:
		 * Int: 5
		 * 0 1 2 3 4 5 6 7 8 9
		 *  
		 *  Int: 8
		 *  0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		 *   
		 *   In: -5
		 *   (no output)
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number");
		int end = scan.nextInt();

		System.out.println("Int: " + end);

		for (int x = 0; x < end * 2; x++) {
				if (x >= 0) {
					System.out.print(x + " ");
				}
		}
		scan.close();
	}
}