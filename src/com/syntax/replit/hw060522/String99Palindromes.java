package com.syntax.replit.hw060522;

import java.util.Scanner;

public class String99Palindromes {

	public static void main(String[] args) {
	
		/*
		 * Write code that will take in a String input and check 
		 * to see if it is a palindrome or not.
		 * A palindrome means that the characters are the
		 * same forwards and backwards, ignoring spaces.
		 * Examples of palindromes:
		 * racecar
		 * was it a car or a cat I saw
		 * never odd or even
		 * rats live on no evil star
		 * Your check should be case insensitive too.
		 * For example, "Bob" is a palindrome, despite
		 * the first B being capitalized.
		 * Your program will print out "true" if it's a
		 * palindrome and "false" if not.
		 */
		
		Scanner inp = new Scanner(System.in);
	    System.out.print("In:");
	    String givenString = inp.nextLine();
		
	    int length = givenString.length();
	    
	    boolean isPalindrome = true;    
	    
	    for (int i = 0; i < length;  i ++) {
	    	if (givenString.charAt(i) != givenString.charAt(length - 1 -i)) {
	    		isPalindrome = false;
	    		System.out.println("false");
//	    		System.out.println(givenString.equalsIgnoreCase(givenString) + "false");
	    		break;
	    	}
	    }
	    if (isPalindrome) {
//	    	System.out.println("true");
	    	System.out.println(givenString.equalsIgnoreCase(givenString) || (givenString.isBlank()));
	    	System.out.println("true");
//	    	System.out.println(givenString.equalsIgnoreCase(givenString));
	    }
	    
	    inp.close();
	}
}