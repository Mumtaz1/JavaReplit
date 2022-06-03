package com.syntax.replit.hw052222;

public class ForLoop61 {

	public static void main(String[] args) {
		
		/*
		 * Step1: does initialization 
		 * Step 2: checks condition 
		 * Step 3: does the print
		 * Step 4: then does the increment
		 */
		
		/*
		 * Write a program that uses for loop to print multiplication 
		 * of number 3 from 1 to 10
		 * Expected Output:
		 * 3*1=3
		 * 3*2=6
		 * 3*3 = 9 all the way to 3*10 = 30
		 */

		int sum = 3;
		for (int i = 1; i <= 10; i++) {
			System.out.println(sum + "*" + i + "=" + sum * i);
		}	
	}
}