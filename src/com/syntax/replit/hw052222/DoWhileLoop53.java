package com.syntax.replit.hw052222;

public class DoWhileLoop53 {

	public static void main(String[] args) {
		
		/*
		 * Using do while loop print even numbers from 20 to 1
		 * Expected Output:
		 * 20
		 * 18
		 * 16
		 * 14 all the way down to 2
		 */

		//do while first, executes the code and then checks the condition
		
		int num = 20;
		
		do {
			System.out.println(num);
			num -= 2; 		
		} while (num >= 1);		
	}
}