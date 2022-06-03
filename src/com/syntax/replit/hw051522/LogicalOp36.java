package com.syntax.replit.hw051522;

import java.util.Scanner;

public class LogicalOp36 {

	public static void main(String[] args) {
		
		/*
		 * The Scanner class is used to get user input, and it is found in the java.util
		 * package. The Scanner class is used for reading in primitive data types like
		 * int, double, float, etc., and objects of type String. - To read strings, we
		 * use next() - To read sentences, we use nextLine() - To read number values, we
		 * use nextInt() - To read decimal number, we use nextDouble() - To read a
		 * single character, we use next().charAt(0)
		 */
		
		/* Prompt user to input two strings: "Please enter
	     * two strings" and two integers: "Please enter two
	     * integers" and make the comparisons.
	     * - if int1 and int2 are equal AND word1 and word2
	     *   are equal, output "AND"
	     * - if int1 and int2 are equal OR word1 and word2
	     *   are equal, output "OR"
	     * - if int1 and int2 are NOT equal AND word1 and word2
	     *   are NOT equal, output "NONE"
	     *
	     * Example input/output:
	     * word1: banana
	     * word2: banana
	     * int1: 2
	     * int2: 2
	     * Output: AND
	     * word1: banana
	     * word2: apple
	     * int1: 2
	     * int2: 2
	     *
	     * Output: OR
	     * word1: phone 
	     * word2: pie
	     * int1: 2
	     * int2: 3
	     * Output: NONE
	   */ 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two strings");
		String val1 = input.next();
		String val2 = input.next();
		
		System.out.println("Please enter two numbers");
		int x = input.nextInt();
		int y = input.nextInt();
	
		if (x == y && (val1.equals(val2))) {
			System.out.println("AND");
		} else if (x == y || (val1.equals(val2))) {
			System.out.println("OR");
		} else {
			System.out.println("NONE");
		}
	}
}