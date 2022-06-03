package com.syntax.replit.hw052922;

public class Arrays2D81 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that prints the highest value
		 * in the array.
		 * Input:
		 * [5,4,8]
		 * Expected Output:
		 * 8
		 */
		int[] arr = new int[] {5, 4, 8};
		int largest = arr[0];
		
		for (int i = 0; i < arr.length; i ++) {
			largest = arr[i];
			}
		System.out.println(largest);
		}
}