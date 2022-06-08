package com.syntax.replit.hw060522;

import java.util.Scanner;

public class String101EveryOtherLetter {

	public static void main(String[] args) {
		
		/*
		 * Inputs:
		 * String word;
		 * Write a for loop that will print out every other
		 * letter in a String, starting with the first letter.
		 * These letters should be printed all on one line
		 * with no space in between.
		 * Sample input/outputs:
		 * In: hello
		 * hlo
		 * In: SSyynnttaaxxTTeecchhnnoollooggiieess
		 * SyntaxTechnologies
		 */
		
		Scanner inp = new Scanner(System.in);
		System.out.println("In:");
		String word = inp.nextLine();
	
		for (int i = 0; i < word.length();  i += 2) {
	    	System.out.print(word.charAt(i));
		}
		inp.close();
	}
}