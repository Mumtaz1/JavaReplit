package com.syntax.replit.hw060522;

import java.util.Scanner;

public class String102CharPerLine {

	public static void main(String[] args) {
		
		/*
		 * Inputs:
		 * String word;
		 * Write a for loop that will loop through every 
		 * character of a word and print out each
		 * character, each on a separate line.
		 * Sample inputs/outputs:
		 * In: hello
		 * h
		 * e
		 * l
		 * l
		 * 0
		 */
		Scanner inp = new Scanner(System.in);
		System.out.println("In:");
		String word = inp.nextLine();
		
		for (int i = 0; i < word.length();  i ++) {
	    	System.out.println(word.charAt(i));
		}
		inp.close();
	}
}