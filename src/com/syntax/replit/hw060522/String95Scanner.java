package com.syntax.replit.hw060522;

import java.util.Scanner;

public class String95Scanner {

	public static void main(String[] args) {
		
		/*
		 * Using Scanner class input string value.
		 * Print the following: "The first 3 letters of _ is _"
		 * For example, if the input is "banana", your 
		 * output should be "The first 3 letters of
		 * banana is ban".
		 */
		
		Scanner scan = new Scanner(System.in);
		String word;
		
		System.out.println("Please enter a word that is more than 3 characters long");
		word = scan.nextLine();
			
		System.out.println("The first 3 letters of " + word + " is " + word.substring(0,3)); 	
		scan.close();
	}
}