package com.syntax.replit.hw052222;

public class DoWhileLoop52 {

	public static void main(String[] args) {
		
		/*
		 * Create a do while loop that prints out "Hello World!" 5 times;
		 * Output:
		 * Hello World!
		 * Hello World!
		 * Hello World!
		 * Hello World!
		 * Hello World!
		 */

		//do while first, executes the code and then checks the condition
		
		int num = 1;
		
		do {
			System.out.println("Hello World!");
			num ++;
		} while (num <= 5);
	}
}