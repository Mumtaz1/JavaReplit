package com.syntax.replit.hw050922;

import java.util.Scanner;

public class Conditional30 {

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
		
		/* Write a program to take the month number from a user.
	     * Provide month name to the corresponding month number.
	     * If a user provides any number that is out of month
	     * range, the program should display "Invalid".
	     * Example Output:
	     * Please enter month number 1
	     * January
	     *
	     * Example Output:
	     * Please enter month number 33
	     * Invalid
	    */ 
Scanner input = new Scanner(System.in); //Creates a Scanner object
		
		//Send instructions to the console requesting user to enter month number
		System.out.println("Please enter month number");
		//To read int values from the user use nextInt()
		int monthNum = input.nextInt();
		
		if (monthNum == 1) {
			System.out.println("January");
		} else if (monthNum == 2) {
			System.out.println("February");
		} else if (monthNum == 3) {
			System.out.println("March");
		} else if (monthNum == 4) {
			System.out.println("April");
		} else if (monthNum == 5) {
			System.out.println("May");
		} else if (monthNum == 6) {
			System.out.println("June");
		} else if (monthNum == 7) {
			System.out.println("July");
		} else if (monthNum == 8) {
			System.out.println("August");
		} else if (monthNum == 9) {
			System.out.println("September");
		} else if (monthNum == 10) {
			System.out.println("October");
		} else if (monthNum == 11) {
			System.out.println("November");
		} else if (monthNum == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid");
		}
		input.close(); //The close() method closes the Scanner
	}
}
