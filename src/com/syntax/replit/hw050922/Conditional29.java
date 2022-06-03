package com.syntax.replit.hw050922;

import java.util.Scanner;

public class Conditional29 {

	public static void main(String[] args) {
		
		/* The Scanner class is used to get user input, and it is found in the 
		 * java.util package.
		 * The Scanner class is used for reading in primitive data types
		 * like int, double, float, etc., and objects of type String.
		 * - To read strings, we use next()
		 * - To read sentences, we use nextLine()
		 * - To read number values, we use nextInt()
		 * - To read decimal number, we use nextDouble()
		 * - To read a single character, we use next().charAt(0)
		 */	
		
		/* Write a Java program that print out true if (x * y)
	     * returns a positive value. Else prints out false if
	     * if (x * y) returns a negative value.
	     * Step 1. Your program should ask "Please enter first
	     * number" - for the 1st number and "Please enter second
	     * number" - for the 2nd number.
	     * Step 2. Create if condition to check if the 
	     * multiplication of x and y values is positive or
	     * negative. If the result of a multiplication is 
	     * positive print true, othersiwe print false.
	     * Example Output:
	     * Please enter first number
	     * Please enter second number
	     * true
	     * Example Output:
	     * Please enter first number
	     * Please enter second number
	     * false
	    */
		Scanner input = new Scanner(System.in); //Creates a Scanner object
		
		//Send instructions to the console requesting user to enter 1st number
		System.out.println("Please enter first number");
		//To read int values from the user use nextInt()
		int num1 = input.nextInt();
		
		//Send instructions to the console requesting user to enter 2nd number
		System.out.println("Please enter second number");
		//To read int values from the user use nextInt()
		int num2 = input.nextInt();
		
		if (num1 * num2 <0) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}
	}
}
