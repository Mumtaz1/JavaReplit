package com.syntax.replit.hw052222;

public class WhileLoop50 {

	public static void main(String[] args) {
		
		/* 
		 * Step 1; Initialize the i value as int i = 7;
		 * Step 2: Write a program to print a sequence of numbers starting from 7 to 98.
		 * Output:
		 * 7
		 * 14
		 * 21
		 * 28 all the way down to 98
		 */

		int i = 7;
		
		while (i <= 98) {
			System.out.println(i);
			i += 7;
		}
	}

}
