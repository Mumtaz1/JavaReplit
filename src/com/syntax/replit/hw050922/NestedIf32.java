package com.syntax.replit.hw050922;

import java.util.Scanner;

public class NestedIf32 {

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
		 * Ask the user to enter his/her gender "Please enter your gender: M
		 * or F" and their age "Please enter your age".
		 * You have 2 conditions:
		 * If age is above 25, then check if a user entered F then the output
		 * should be "Woman" otherwise it should say "Man"
		 * 
		 * If age is below 25, then check if a user entered F then the output
		 * should be "Girl" otherwise it should say "Boy"
		 * 
		 * Example Output:
		 * Please enter your gender: M or F
		 * Please enter your age
		 * Man
		 * 
		 * Example Output:
		 * Please enter your gender: M or F
		 * Please enter your age
		 * Boy
		 * 
		 * Example Output:
		 * Please enter your gender: M or F
		 * Please enter your age
		 * Woman
		 * 
		 * Example Output:
		 * Please enter your gender: M or F
		 * Please enter your age
		 * Girl
		 */
		
		Scanner input = new Scanner(System.in); //Create a Scanner object
		
		//Send instructions to the console asking user to enter his/her gender
		System.out.println("Please enter your gender: M or F");
		//To read String values from the user use next()
		String gender = input.next();
		
		//Send instructions to the console asking user to enter their age
		System.out.println("Please enter your age");
		//To read int values from the user use nextInt()
		int age = input.nextInt();

		if (gender.equals("M") && (age > 25)) {
			System.out.println("Man");
		} else if (gender.equals("F") && (age > 25)) {
			System.out.println("Woman");
		} else if (gender.equals("M") && (age < 25)) {
			System.out.println("Boy");
		} else if (gender.equals("F") && (age  < 25)) {
			System.out.println("Girl");
		} input.close(); // The close() method closes the Scanner
	}
}