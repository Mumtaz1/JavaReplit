package com.syntax.replit.hw051522;

import java.util.Scanner;

public class Switch40 {

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
		 * By using the switch statement concept please validate what is the
		 * responsibility each instructor in the syntax solution: 
		 * First Output: "Enter name of the instructor" 
		 * case 1: if user provided the name as Asghar as input it should show 
		 *            " Will take care of Java Assignment" 
		 *  case 2: if user provided the name as Moazzam as input it should show
		 *             "Will take care of SDLC Assignment" 
		 * case 3: if user provided the name as Weqas as input it should show 
		 *            "Will take care of Selenium Assignment" 
		 *  case 4: if user provided the name as Asel as input it should show
		 *             "Will take care of every Assignment" 
		 * Other than these four names if the user  provides any other 
		 *  names -> "Invalid instructor selected"
		 */

		Scanner input = new Scanner(System.in); // Create a Scanner object

		String responsibility;

		System.out.println("Enter name of the instructor");
		String name = input.next();

		switch (name.toLowerCase()) {

		case  "Asghar":
				responsibility = ("Will take care of Java Assignment");
				break;
	
		case "Moazzam":
			responsibility = ("Will take care of SDLC Assignment");
			break;

		case "Weqas":
			responsibility = ("Will take care of Selenium Assignment");
			break;

		case "Asel":
			responsibility = ("Will take care of every Assignment");
			break;
			
		}
		if (name.equalsIgnoreCase("Asghar")) {
			System.out.println("Will take care of Java Assignment");
		} else if (name.equalsIgnoreCase("Moazzam")) {
			System.out.println("Will take care of SDLC Assignment");
		} else if (name.equalsIgnoreCase("Weqas")) {
			System.out.println("Will take care of Selenium Assignment");
		} else if (name.equalsIgnoreCase("Asel")) {
			System.out.println("Will take care of every Assignment");
		} else {
			System.out.println("Invalid instructor selected");
		}
	}
}