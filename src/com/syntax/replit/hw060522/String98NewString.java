package com.syntax.replit.hw060522;

public class String98NewString {

	public static void main(String[] args) {

		/*
		 * Create a String given = "Hello Syntax friends".
		 * Using String methods from given String
		 * create new String "Welcome Syntax  family".
		 * Expected Output:
		 * Welcome Syntax family
		 */
		
		String given =  new String("Hello Syntax friends");
		String replace = given.replace("Hello", "Welcome"). replace("friends", "family");
		System.out.println(replace);
	}
}