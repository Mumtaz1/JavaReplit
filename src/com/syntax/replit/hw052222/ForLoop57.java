package com.syntax.replit.hw052222;

public class ForLoop57 {

	public static void main(String[] args) {

		/*
		 * Step1: does initialization 
		 * Step 2: checks condition 
		 * Step 3: does the print
		 * Step 4: then does the increment
		 */
		
		/*
		 * Create a for loop that prints out odd numbers from 5 to 22 Must not include
		 * the number 22 in the output Expected Output: 5 7 9 11 all the way to 21
		 */

		for (int i = 5; i < 22; i += 2) {
			System.out.println(i);
		}

		System.out.println(" ------------------------ ");
		//Another way to write the same thing is:

		for (int i = 5; i < 22; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
		}
	}
}