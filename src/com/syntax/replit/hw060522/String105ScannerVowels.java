package com.syntax.replit.hw060522;

import java.util.Scanner;

public class String105ScannerVowels {

	public static void main(String[] args) {
		
		/*
		 * There is a code that takes input as a String.
		 * Write a program that will print out only
		 * vowels of that string.
		 * Sample input/outputs:
		 * In: howdyho
		 * oo
		 * In: huehuehuehhue
		 * ueueueue
		 * In: poopoo what idk what im doing
		 * ooooaiaoi
		 */

		Scanner inp = new Scanner(System.in);
		System.out.println("In:");
		String word = inp.nextLine();
			
		for (int i = 0; i < word.length();  i ++) {
			if (word.charAt(i) == 'a' || word.charAt(i) == 'e' ||  (word.charAt(i) == 'i' || 
					word.charAt(i) == 'o' ||  word.charAt(i) == 'u')) {
	    	System.out.print(word.charAt(i));
		}
		inp.close();
		}
	}
}