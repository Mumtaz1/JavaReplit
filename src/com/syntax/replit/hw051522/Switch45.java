package com.syntax.replit.hw051522;

import java.util.Scanner;

public class Switch45 {

	public static void main(String[] args) {
		
		/*
		 * The Scanner class is used to get user input, and it is found in the java.util
		 * packcar. The Scanner class is used for reading in primitive data types like
		 * int, double, float, etc., and objects of type String. - To read strings, we
		 * use next() - To read sentences, we use nextLine() - To read number values, we
		 * use nextInt() - To read decimal number, we use nextDouble() - To read a
		 * single character, we use next().charAt(0)
		 */
		
		/* Ask the user to enter any number from 1-7.
		 * Based on the number define the day of the week.
		 * Example Output:
		 * Input a number between 1-7
		 * Friday
		 * 
		 * Example Output
		 * Input a number between1-7
		 * Invalid
		 */
		
		Scanner input = new Scanner(System.in); // Create a Scanner object

		String day;
		
		System.out.println("Input a number between 1-7");
		int num= input.nextInt(); 

		switch(num) {
		case 1:
			day = ("Monday");
			System.out.println(day);
			break;
		
		case 2:
			day = ("Tuesday");
			System.out.println(day);
			break;
		
		case 3:
			day = ("Wednesday");
			System.out.println(day);
			break;
		
		case 4:
			day = ("Thursday");
			System.out.println(day);
			break;
			
		case 5:
			day = ("Friday");
			System.out.println(day);
			break;
		
		case 6:
			day = ("Saturday");
			System.out.println(day);
			break;
		
		case 7:
			day = ("Sunday");
			System.out.println(day);
			break;
			
		default:
			day = ("Invalid");
			System.out.println(day);
		}		
	}
}