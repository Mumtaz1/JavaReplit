package com.syntax.replit.hw050922;

import java.util.Scanner;

public class Conditional27 {

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
		
		 /* Write a Java program to ask age "Please enter your age".
	     * Based on the age define whether the user is eligible
	     * to vote or not.
	     * A person who is eligible to vote must be older or 
	     * equal to 18 years ol and the program will show "You
	     * are eligible to vote". Otheriwse, the program will
	     * show "You are not eligible to vote".
	     * Examples:
	     * Please enter your age 18
	     * You are eligible to vote
	     *
	     * Please enter your age 16
	     * You are not elgible to vote
	    */
		
		Scanner input = new Scanner(System.in); // Create a Scanner object
		
		//Send instructions to the console requesting user to enter their age
		System.out.println("Please enter your age ");
		
		//To read int value from the user use nextInt()
		int age = input.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible to vote ");
		} else {
			System.out.println("You are not eligible to vote");
		}
	}
}	