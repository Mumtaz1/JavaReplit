package com.syntax.replit.hw051522;

import java.util.Scanner;

public class Switch44 {

	public static void main(String[] args) {

		/*
		 * The Scanner class is used to get user input, and it is found in the java.util
		 * packcar. The Scanner class is used for reading in primitive data types like
		 * int, double, float, etc., and objects of type String. - To read strings, we
		 * use next() - To read sentences, we use nextLine() - To read number values, we
		 * use nextInt() - To read decimal number, we use nextDouble() - To read a
		 * single character, we use next().charAt(0)
		 */

		/*
		 * Prompt use with questions: Please enter your favorite car make" 
		 * - if user enters BMW -> carOrigin = "german car" 
		 * - if user enters Toyota -> carOrigin = "japanese car" 
		 * - if use enters Maserati -> carOrigin = "italian car" 
		 * Anything else besides those values -> carOrigin = "unknown" 
		 * Output: "Your favorite car is _"
		 */
		Scanner input = new Scanner(System.in); // Create a Scanner object

		String carOrigin;

		System.out.println("Please enter your favorite car make");
		String car = input.next();

	// ************* it works in replit but not here - for not one of the cars listed *****
		
		switch (car) {

		case "BMW":
			carOrigin = ("german car");
			break;

		case "Toyota":
			carOrigin = ("japanese car");
			break;

		case "Maserati":
			carOrigin = ("Italian car");
			break;

		default:
			carOrigin = ("unknown");			
		}

		if (car.equalsIgnoreCase("BMW")) {
			System.out.println("Your favorite car is " + carOrigin + " car");
		} else if (car.equalsIgnoreCase("Toyota")) {
			System.out.println("Your favorite car is " + carOrigin + " car");
		} else if (car.equalsIgnoreCase("Maserati")) {
			System.out.println("Your favorite car is " + carOrigin+ " car");
		} else {
			System.out.println("Your favorite car is unknown");
		}
	}
}