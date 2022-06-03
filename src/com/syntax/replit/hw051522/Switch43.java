package com.syntax.replit.hw051522;

import java.util.Scanner;

public class Switch43 {

	public static void main(String[] args) {
		
		/*
		 * The Scanner class is used to get user input, and it is found in the java.util
		 * packnum. The Scanner class is used for reading in primitive data types like
		 * int, double, float, etc., and objects of type String. - To read strings, we
		 * use next() - To read sentences, we use nextLine() - To read number values, we
		 * use nextInt() - To read decimal number, we use nextDouble() - To read a
		 * single character, we use next().charAt(0)
		 */
		
		/* Write a program to input number "Input a number between 1-12"
		 * and when you input a number it should display the month using
		 * Scanner and Switch statement.
		 * case: 1 will display January
		 * case: 12 will display December
		 * Anything outside of 12 will display "Invalid"
		 * Example Output:
		 * Input a number between 1 - 12
		 * Invalid
		 * Example Output:
		 * Input a number between 1-12
		 * January
		 * 
		 */
		
		Scanner input = new Scanner(System.in); // Create a Scanner object

		String month;

		System.out.println("Input a number between 1-12");
		int num = input.nextInt();

		switch (num) {

		case  1:
				month = ("January");
				break;
				
		case 2:
			month = ("February");
			break;
			
		case 3:
			month = ("March");
			break;
			
		case 4:
			month = ("April");
			break;
			
		case  5:
				month = ("May");
				break;
	
		case 6:
			month = ("June");
			break;

		case 7:
			month = ("July");
			break;

		case 8:
			month = ("August");
			break;
			
		case  9:
				month = ("September");
				break;
	
		case 10:
			month = ("October");
			break;

		case 11:
			month = ("November");
			break;

		case 12:
			month = ("December");
			break;
		}
		if (num == 1) {
			System.out.println("January");
		} else if (num == 2) {
			System.out.println("February");
		} else if (num == 3) {
			System.out.println("March");
		} else if (num == 4) {
			System.out.println("April");
		} else if (num == 5) {
			System.out.println("May");
		} else if (num == 6) {
			System.out.println("June");
		} else if (num == 7) {
			System.out.println("July");
		} else if (num == 8) {
			System.out.println("August");
		} else if (num == 9) {
			System.out.println("September");
		} else if (num == 10) {
			System.out.println("October");
		} else if (num == 11) {
			System.out.println("November");
		} else if (num == 12) {
			System.out.println("December");
		} else {
			System.out.println("Invalid");
		}	
	}
}