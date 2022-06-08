package com.syntax.replit.hw060522;

public class String90Empty {

	public static void main(String[] args) {
		
		/*
		 * Create a String named s1 = "hello" and check
		 * whether the string is empty or not.
		 * Create a String named s2 = "" and check
		 * whether the string is empty or not.
		 * Expected Output:
		 * false
		 * true
		 */
		
		String s1 =  new String("hello");
		System.out.println(s1.isEmpty()); // this counts spaces and so returns false
		
		String s2 =  new String("");
		System.out.println(s2.isEmpty()); // this counts spaces and so returns false
	}
}