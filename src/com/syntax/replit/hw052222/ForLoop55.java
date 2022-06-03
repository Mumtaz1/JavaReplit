package com.syntax.replit.hw052222;

public class ForLoop55 {

	public static void main(String[] args) {

		/*
		 * Step1: does initialization 
		 * Step 2: checks condition 
		 * Step 3: does the print
		 * Step 4: then does the increment
		 */

		/*
		 * Create a for loop that prints out even numbers from 10 to 0 Must not include
		 * the number 0 in the output. 
		 * Output: 
		 * 10 
		 * 8 
		 * 6 
		 * 4 
		 * 2
		 */

		int sum = 0;

		for (int a = 10; a >= 1; a -=2) {
			System.out.println(a);
		}
		
		System.out.println("----------------");
		
		//2nd way to print even number from 10 to 0. Must not include the
		// number 0 in the output:
		
				for (int b = 10; b >= 1; b --) {
					if (b % 2 == 0) {
					System.out.println(b);
				}	
			}
	}
}