package com.syntax.replit.hw050922;

import java.util.Scanner;

public class Conditional28 {

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
		
		/* Write a program to take values of length and width
		 * from the user. Based on the value, define whether the
		 * shape is a square or a rectangle.
		 * Examples:
		 * Please enter the length 18
		 * Please enter the width 16
		 * The shape of your object is rectangle
		 *
		 * Please enter the length 16
		 * Please enter the width 16
		 * The shape of your object is square
		*/  
		Scanner input = new Scanner(System.in); //Create a Scanner object
		
		//Send instructions to the console requesting user to enter the length
		System.out.println("Please enter the length ");
		//To read int value from the user use nextInt()
		int length = input.nextInt();
		
		//Send instructions to the console requesting user to enter the width
		System.out.println("Please enter the width ");
		//To read int value from the user use nextInt()
		int width = input.nextInt();
		
		if (length == width ) {
			System.out.println("The shape of your object is square");
		} else {
			System.out.println("The shape of your object is rectangle");
		}
			input.close(); // The close() method closes the Scanner
	}
}
