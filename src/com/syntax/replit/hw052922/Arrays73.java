package com.syntax.replit.hw052922;

public class Arrays73 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that creates an array of strings
		 * with the following values {"This", "is", "array", "of",
		 * strings"} and prints all values in one line.
		 * Output:
		 * This is array of strings
		 * 
		 */
		
		String[] arr = {"This", "is", "array", "of", "strings"};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}