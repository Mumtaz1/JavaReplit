package com.syntax.replit.hw050922;

import java.util.Scanner;

public class ScannerAge21 {

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
		
		/* Write a program that asks the user's age:
	     * "Enter your age". Then display it by 
	     * adding 10 (i.e., age + 10) in your final
	     * output.
	     * Example Output:
	     * Enter you age 30
	     * Your age after 10 years is 40
	    */  
		
	    Scanner input = new Scanner(System.in); // Create a Scanner object

	    //Send instructions to the console requesting user to enter their age
	    System.out.println("Enter your age");
	    //To read int value from the user use nextInt()
	    int age = input.nextInt();
	    //System.out.println(age);

	    //Add 10 to age entered
	    age = age + 10;
	    System.out.println("Your age after 10 years is " + age);
	  }
	}