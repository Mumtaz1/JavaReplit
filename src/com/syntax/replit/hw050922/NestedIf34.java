package com.syntax.replit.hw050922;

import java.util.Scanner;

public class NestedIf34 {

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
		
		/* Write a program to find the largest number
	     * among three distinct numbers using 
	     * nested if condition.
	     * Expected Output:
	     * Pleae enter 3 distinct numbers 4, 5, and 14
	     * The largest number is 14
	    */
		Scanner input = new Scanner(System.in); //Create a Scanner object
		
		//Send instructions to the console asking user to enter 3 distinct numbers
		System.out.println("Please enter 3 distinct numbers");
		//To read int values from the user use nextInt()
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if( num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is " + num1);

		} else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is " + num2);

		} else {
            System.out.println("The largest number is " + num3);
		}
	}
}
