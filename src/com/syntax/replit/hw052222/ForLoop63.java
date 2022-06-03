package com.syntax.replit.hw052222;

import java.util.Scanner;

public class ForLoop63 {

	public static void main(String[] args) {

		/*
		 * Step1: does initialization Step 2: checks condition Step 3: does the print
		 * Step 4: then does the increment
		 */

		/*
		 * Given the following inputs: int x; 
		 * Write a for loop that will print out a series of numbers 
		 * starting at 0 and ending at the x (value must be taken from
		 * a user), exclusive. 
		 * 
		 * Example Output: 
		 * In: 3 
		 * 0 1 2
		 * 
		 * In: 8 
		 * 0 1 2 3 4 5 6 7 8
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number");
		int number = scan.nextInt();

		System.out.println("In: " + number);

		for (int x = 0; x <= number; x++) {
			if (x >= number) {
				break;
			}
			System.out.print(x + " ");
		}
		scan.close();
	}
}