package com.syntax.replit.hw052922;

import java.util.Scanner;

public class Arrays77 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of integers that will store 5
		 * elements taken from a user. Don't print any
		 * prompt message for the user. Then print
		 * out all the elements you have created in
		 * the first loop in reverse order.
		 * Example:
		 * Input:
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * Output:
		 * 5
		 * 4
		 * 3
		 * 2
		 * 1
		 */
		int[] arr = new int[] {1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i ++) {
			System.out.println(arr[i]);
		}
		for (int i = arr.length -1; i >=0; i --) {
			System.out.println(arr[i]);
		}
	}
}