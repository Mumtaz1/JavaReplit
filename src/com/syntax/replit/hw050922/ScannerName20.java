package com.syntax.replit.hw050922;

import java.util.Scanner;
public class ScannerName20 {

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
		
		/* 
	     * Write a program that takes user's first name and
	     * last name and prints in console.
	     * Instruct the user to enter first name: "Please
	     * Enter First Name". Capture the first name.
	     * Instruct the user to enter last name: "Please
	     * Enter Last Name". Capture last name.
	     * Print first name and last name
	     * 
	     * Output:
	     * Please Enter First Name
	     * Please Enter Last Name
	     * Cindy Crawford
	    */
		
	    Scanner input = new Scanner(System.in); // Create a scanner object

	    //Send instructions to the console requesting user to enter first name
	    System.out.println("Please Enter First Name");
	    //To read Strings we use next()
	    String firstName = input.next();
	    
	    //Send instructions to the console requesting user to enter last name
	    System.out.println("Please Enter Last Name");
	    //To read Strings we use next()
	    String lastName = input.next();
	  }
	}