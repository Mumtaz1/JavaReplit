package com.syntax.replit.hw052922;

public class Arrays75 {

	public static void main(String[] args) {

		/*
		 * Using the following array 
		 * {45, 78, 12, 67, 55, 89, 23, 77, 88} 
		 * Create a for loop to extract values from that array so
		 * your output looks as below:
		 * Expected Output: 
		 * 78 55 77 
		 * Note: Find out what is the start point and how much
		 *          you need to increment to get the result.
		 */

		int[] num = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int i = 1; i < num.length; i += 3) {
			System.out.print(num[i] + " ");
		}
	}
}