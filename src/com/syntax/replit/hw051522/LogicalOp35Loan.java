package com.syntax.replit.hw051522;

import java.util.Scanner;

public class LogicalOp35Loan {

	public static void main(String[] args) {

		/*
		 * The Scanner class is used to get user input, and it is found in the java.util
		 * package. The Scanner class is used for reading in primitive data types like
		 * int, double, float, etc., and objects of type String. - To read strings, we
		 * use next() - To read sentences, we use nextLine() - To read number values, we
		 * use nextInt() - To read decimal number, we use nextDouble() - To read a
		 * single character, we use next().charAt(0)
		 */

		/*
		 * Create a program that prompts user with a question: "Do you need a loan?"
		 * (Use a boolean) If the result is true then prompt the user with the question:
		 * "What is your credit score?" Otherwise eligibility is "Unknown". Based on the
		 * score defines users eligibility: - if score is below 600 -> eligibility =
		 * "Not eligible" - if score is between 600 and 700 inclusive -> eligibility =
		 * "Maybe eligible" - if score is between 701 and 800 inclusive -> eligibility =
		 * "Eligible" - if score is higher than any other previous values -> eligibility
		 * = "Definitely eligible". Output: The eligibility is _
		 */
		Scanner input = new Scanner(System.in); // Create a Scanner object

		String eligibility = "None";
		
		System.out.println("Do you need a loan? Enter true or false");
		boolean loan = input.nextBoolean(); // capture boolean

		if (loan) {
			System.out.println("What is your credit score?");
			int score = input.nextInt();

			if (score < 600) {
				eligibility = ("Not eligible");
			} else if (score >= 600 && score <= 700) {
				eligibility = ("Maybe eligible");
			} else if (score >= 701 && score <= 800) {
				eligibility = ("Eligible");
			} else {
				eligibility = ("Definitely eligible");
			}
			System.out.println("The eligibility is " + eligibility);
		}  else  {
			System.out.println("Unknown");
		}
	}
} 