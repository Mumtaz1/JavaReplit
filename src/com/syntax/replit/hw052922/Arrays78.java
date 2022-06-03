package com.syntax.replit.hw052922;

import java.util.Scanner;

public class Arrays78 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of integers with a size of 5 and
		 * input values with Scanner. 
		 * Don't print prompt questions for a user. 
		 * Using loop print out each element of the
		 * array that should look like the output below
		 * Example:
		 * Input:
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * Output:
		 * 10
		 * 20
		 * 30
		 * 40
		 * 50
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 1 2 3 4 5");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();
		int num5 = input.nextInt();
		int[] numbers = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < numbers.length; i ++ ) {
			System.out.println(numbers[i] + "0");
		}
		
		input.close();
	}
}