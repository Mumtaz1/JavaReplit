package com.syntax.replit.hw051522;

import java.util.Scanner;

public class LogicalOp37 {

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
		 * Take 2 boolean inputs from a user:
		 * "Are you thirsty?"
		 * "Are you sleepy?"
		 * - If user is thirsty and not sleepy -> drink = water 
		 * - If user is thirsty and sleepy -> drink = coffee
		 * - If user is not thirsty and sleepy -> drink = tea
		 * - Otherwise drink = "nothing"
		 * Output:
		 * Looks like you need to drink _
		 */
		
		Scanner input = new Scanner(System.in); // Create a Scanner object

		String drink;
		
		System.out.println("Are you thirsty? Please enter true or false");
		 boolean thirsty = input.nextBoolean();
		
		System.out.println("Are you sleepy? Please enter true or false");
		boolean sleepy = input.nextBoolean();
		
		if (thirsty &&  !sleepy) {
			drink = ("water");
		} else if  (thirsty && sleepy) {
			drink = ("coffee");
		} else if (!thirsty && sleepy) { 
			drink = ("tea");
		} else {
			drink = ("nothing");
		}
		System.out.println("Looks like you need to drink " + drink);
		}
	}