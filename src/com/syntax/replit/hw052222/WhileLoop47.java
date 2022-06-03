package com.syntax.replit.hw052222;

public class WhileLoop47 {

	public static void main(String[] args) {
		
		/*
		 * Using while loop print numbers from 15 to 0
		 * Example Output:
		 * 15
		 * 14
		 * 13
		 * 12
		 * 11 all the way down to 0
		 */

		// while loop first checks condition then executes the block of code
		
		int num = 15;
		
		while (num >= 0) {
			System.out.println(num); 
			num --;
		}
	}
}