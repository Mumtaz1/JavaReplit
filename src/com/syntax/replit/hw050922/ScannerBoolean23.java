package com.syntax.replit.hw050922;

import java.util.Scanner;

public class ScannerBoolean23 {

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
		
		/* Create a program that will ask a user to input
	     *  a boolean value: "Input the boolean value".
	     * If the input is true or false, then the output
	     * should look like the below:
	     * Example Output1:
	     * Input the boolean value
	     * The value is true
	     * Example Output2:
	     * Input the boolean value
	     * The value is false
	    */
		
	    Scanner input = new Scanner(System.in); // Create a Scanner object

	    /*Send instructions to the console requesting user to enter 
	     * a boolean value
	    */
	    System.out.println("Input the boolean value");
	    // To read boolean values from the user use nextBoolean()
	    boolean happy = input.nextBoolean();
	    System.out.println("The value is " + happy);

	    /*Send instructions to the console requesting user to enter 
	     * a boolean value
	    */
	    System.out.println("Input the boolean value");
	    // To read boolean values from the user use nextBoolean()
	    boolean sad = input.nextBoolean();
	    System.out.println("The value is " + sad);
	  }
	}