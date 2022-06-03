package com.syntax.replit.hw051522;

import java.util.Scanner;

public class Switch41 {

	public static void main(String[] args) {
		
		/*
		 * The Scanner class is used to get user input, and it is found in the java.util
		 * package. The Scanner class is used for reading in primitive data types like
		 * int, double, float, etc., and objects of type String. - To read strings, we
		 * use next() - To read sentences, we use nextLine() - To read number values, we
		 * use nextInt() - To read decimal number, we use nextDouble() - To read a
		 * single character, we use next().charAt(0)
		 */
		
		/* Write a program using the switch statement.
		 * Let us consider the scenario regarding the born baby age
		 * First Output: "Enter the age of the Child"
		 * case 1: if age is 1 print as "You can Crawl"
		 * case 2: if age is 2 print as "You can Talk"
		 * case 3: if age is 3 print as "You can Dance"
		 * case 4: if age is 4 print as "You can get Trouble"
		 * Other than this age (1-4) it should print "I don't know
		 * how old you are"
		 */

		Scanner input = new Scanner(System.in); // Create a Scanner object

		String ability;

		System.out.println("Enter the age of the Child");
		int age = input.nextInt();

		switch (age) {

		case  1:
				ability = ("You can Crawl");
				break;
	
		case 2:
			ability = ("You can Talk");
			break;

		case 3:
			ability = ("You can Dance");
			break;

		case 4:
			ability = ("You can get Trouble");
			break;
			
		}
		if (age == 1) {
			System.out.println("You can Crawl");
		} else if (age == 2) {
			System.out.println("You can Talk");
		} else if (age == 3) {
			System.out.println("You can Dance");
		} else if (age == 4) {
			System.out.println("You can get Trouble");
		} else {
			System.out.println("I don't know how old you are");
		}
	}
}