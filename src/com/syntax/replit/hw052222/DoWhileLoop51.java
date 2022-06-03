package com.syntax.replit.hw052222;

public class DoWhileLoop51 {

	public static void main(String[] args) {
		
		/*
		 * Using do while loop. print number from 10 to 20
		 * Must not include the number 20 in the output
		 * Output:
		 * 10
		 * 11
		 * 12
		 * 13 all the way down to 19
		 */

		// do while first, executes the code and then checks the condition
		
		int num = 10;
		
		do {
			System.out.println(num);
			num ++;
		} while (num < 20);
	}
}