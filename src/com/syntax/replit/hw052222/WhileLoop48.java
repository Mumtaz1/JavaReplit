package com.syntax.replit.hw052222;

public class WhileLoop48 {

	public static void main(String[] args) {
		
		/*
		 * Using while loop print out even numbers from 1 to 13
		 * Example Output:
		 * 2
		 * 4
		 * 6
		 * 8 all the way down to 12.
		 */
		
		// while loop first checks condition then executes the block of code
		
		int num = 2;

		while (num <= 12) {
			System.out.println(num);
			num += 2;                        // num = num + 2
		}
	}
}