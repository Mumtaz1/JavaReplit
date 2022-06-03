package com.syntax.replit.hw051522;

import java.util.Scanner;

public class LogicalOp38 {

	public static void main(String[] args) {
		
		/* Prompt user with a question: "Is it weekend?"
	     * If it not a weekend > subject = "manual testing"
	     * Otherwise -> subject = "Java"
	     * Output:
	     * Today you will learning _
	    */

		Scanner input = new Scanner(System.in); // Create a Scanner object
		
		String subject;
		
		System.out.println("Is it weekend? Please enter true or false");
		boolean wkend = input.nextBoolean();
		
		if (wkend != true) {
			subject = ("manual testing");
		} else {
			subject = ("Java");
		}
		System.out.println("Today you will be learning " + subject);
	} 
}