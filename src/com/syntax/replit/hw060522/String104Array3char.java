package com.syntax.replit.hw060522;

import java.util.Scanner;

public class String104Array3char {

	public static void main(String[] args) {

		/*
		 * Create an array of names that will hold 5 string elements. Names must be
		 * taken from a user. Print out the first three characters of each element of
		 * the array, one per line. Note: every array element must be at least 3
		 * characters long. Input Example: John Jane Emily Expected Output: Joh Jan Emi
		 */
		String[] arr = { "John", "Jane", "Jimmy", "Mike", "Emily" };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].substring(0, 3));
		}
	}
}