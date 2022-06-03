package com.syntax.replit.hw052222;

public class ForLoop56 {

	public static void main(String[] args) {

		/*
		 * Step1: does initialization 
		 * Step 2: checks condition 
		 * Step 3: does the print
		 * Step 4: then does the increment
		 */
		
		/*
		 * Create a for loop that prints out even numbers from 2 to 14 using if
		 * condition. Must include the number 14 in the output. Output: 2 4 6 8 all the
		 * way to 14
		 */

		for (int num = 2; num <= 14; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
}