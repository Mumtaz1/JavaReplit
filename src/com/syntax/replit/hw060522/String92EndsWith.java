package com.syntax.replit.hw060522;

public class String92EndsWith {

	public static void main(String[] args) {
		
		/*
		 * Validate if the string ends with "u" prints the 
		 * boolean value accordingly.
		 * Validate if the string ends with "world" prints
		 * the boolean value accordingly.
		 * Validate if the string ends with "are" prints the
		 * boolean value accordingly.
		 * Validate if the string ends with "you" prints the
		 * boolean value accordingly.
		 */

		String s1 =  new String("hello how are you");
		System.out.println(s1.endsWith("u"));
		
		String s2 =  new String("Hello world");
		System.out.println(s2.endsWith("u"));
		
		String s3 =  new String("Who are you");
		System.out.println(s3.endsWith("are"));
		
		String s4 =  new String("I like you");
		System.out.println(s4.endsWith("you"));
	} 
}