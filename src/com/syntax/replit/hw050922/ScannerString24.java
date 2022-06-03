package com.syntax.replit.hw050922;

import java.util.Scanner;

public class ScannerString24 {

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
		
		/* Write a program that takes a user's name and prints it.
	     * Example Output:
	     * Hello, please enter your name
	     * Your name is Sumair
	    */
		
	    Scanner input = new Scanner(System.in); // Create a Scanner object

	    /* Send instructions to the console requesting user to
	     * enter their name.
	    */  
	    System.out.println("Hello, please enter your name ");
	    //To read a string value from the user use nextLine()
	    String name = input.nextLine();
	    System.out.println("Your name is " + name);
	  }
	  
	}