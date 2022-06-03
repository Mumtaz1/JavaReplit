package com.syntax.replit.hw052922;

public class Arrays72 {

	public static void main(String[] args) {

		/*
		 * Write a program that creates an array with the following values {s, a, y, b,
		 * n, c, t, d, a, e, x}. Print the values so the output should look like the
		 * below. Output: syntax
		 */

		// String[] word = {"s"," a", "y"," b"," n"," c"," t", "d", "a", "e"," x"};
		String[] word = new String[11];
		word[0] = "s";
		word[1] = "a";
		word[2] = "y";
		word[3] = "b";
		word[4] = "n";
		word[5] = "c";
		word[6] = "t";
		word[7] = "d";
		word[8] = "a";
		word[9] = "e";
		word[10] = "x";

		System.out.print(word[0]);
		System.out.print(word[2]);
		System.out.print(word[4]);
		System.out.print(word[6]);
		System.out.print(word[8]);
		System.out.print(word[10]);
	}
}