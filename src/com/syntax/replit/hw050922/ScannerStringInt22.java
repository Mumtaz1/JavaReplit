package com.syntax.replit.hw050922;

import java.util.Scanner;

public class ScannerStringInt22 {

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
		
		/* Write a program to take user name, age, and
	     * mobile number.
	     * First Output: "Enter your name"
	     * Second Output: "Enter your mobile number" (please use
	     *                 xxx-xxx-xxxx format)
	     * Third output: :Enter your age
	     * Example Output:
	     * Enter your name
	     * Enter your age
	     * Your name is Weqas, your age is 45 and your mobile
	     * number is 123-456-7891 
	    */
		
	    Scanner input = new Scanner(System.in); // Create a Scanner object

	    //Send instructions to the console requesting user to enter their name
	    System.out.println("Enter your name");
	    // To read String values from the user use next()
	    String name = input.next();

	    //Send instructions to the console requesting user enter mobile number
	    System.out.println("Enter your mobile number");
	    // To read String values from the user use next()
	    String mobileNumbr = input.next();

	    //Send instructions to the console requesting user enter their age
	    System.out.println("Enter your age");
	    // To read int value from the user use nextInt()
	    int age = input.nextInt();

	    System.out.println("Your name is " + name + "," + " your age is " + age + " and your mobile number is " + mobileNumbr);
	  }
	}