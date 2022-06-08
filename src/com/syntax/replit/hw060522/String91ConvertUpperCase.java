package com.syntax.replit.hw060522;

public class String91ConvertUpperCase {

	public static void main(String[] args) {
		
		/*
		 * Create String str1 = syntax technologies and
		 * convert into SYNTAX TECHNOLOGIES.
		 * Create String str2 = SYNTAX TECHNOLOGIES
		 * and convert into syntax technologies.
		 * Expected Output:
		 * SYNTAX TECHNOLOGIES
		 * syntax technologies
		 */
		
		String str1 =  new String("syntax technologies");
		System.out.println(str1.toUpperCase());
		
		String str2 =  new String("SYNTAX TECHNOLOGIES");
		System.out.println(str2.toLowerCase());
		
	}
}