package com.syntax.replit.hw050922;

import java.util.Scanner;

public class NestedIf33 {

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
		
		/* Ask the user to enter any number. If a user enters a number and it
		 * is even, print "Value is even", otherwise print "Value is odd" and 
		 * prints Odd value is just right.
		 * If the number is greater than 1000, then print "Even value is large",
		 * else print "Even value is just right".
		 * 
		 * Example Output:
		 * Please enter a number
		 * Value is odd
		 * 
		 * Example Output:
		 * Please enter a number
		 * Value is odd
		 * Odd value is just right
		 * 
		 * Example Output:
		 * Please enter a number
		 * Value is even
		 * Even value is just right
		 * 
		 * Example Output:
		 * Please enter a number
		 * Value is even
		 * Even value is large
		 */
		Scanner input = new Scanner(System.in); //Create a Scanner object
		
		//Send instructions to the console asking user to enter any number
		System.out.println("Please enter a number");
		//To read int values from the user use nextInt()
		int num = input.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Value is even");
			if (num > 1000) {
				System.out.println("Even value is large");
			} else {
				System.out.println("Even value is just right");
			}
		} else {
			System.out.println("Value is odd");
			System.out.println("Odd value is just right");
		}
	}
}