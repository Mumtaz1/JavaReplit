package com.syntax.replit.hw050922;

import java.util.Scanner;

public class NestedIf31 {

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
		 * Declare boolean variable isSunny, ask the user "Is it sunny outside?" Declare
		 * int temperature and ask user "What is the temperature outside?" Your program
		 * should check: If it is not sunny output should be "I stay home and practice
		 * Java". If the weather is sunny you want to check the temperature
		 * "What is the temperature outside?" If the temperature is higher than 85 then
		 * "I am going to the beach" otherwise, "I am going to the park".
		 *
		 * Example Output: Is it sunny outside? It is a sunny day, I should go
		 * somewhere! What is the temperature outside? I am going to the beach!
		 *
		 * Example Output: Is it sunny outside? I stay home and practice Java!
		 *
		 * Example output: Is it sunny outside? It is a sunny day, I should go
		 * somewhere! I am going to the park!
		 */
		Scanner input = new Scanner(System.in); // Create a Scanner object

		// Send instructions to the console asking user if it is sunny or not
		System.out.println("Is it sunny outside?");
		// To read boolean values from the user use nextBoolean()
		boolean isSunny = input.nextBoolean();

		if (isSunny) {
			System.out.println("It is a sunny day, I should go somewhere!");
			System.out.println("What is the temperature outside?");
			// To read int values from the user use nextInt()
			int temp = input.nextInt();

			if (temp > 85) {
				System.out.println("I am going to the beach");
			} else {
				System.out.println("I am going to the park");
			}
		} else {
			System.out.println("I stay home and practice Java");
		}
		input.close(); // The close() method closes the Scanner
	}
}