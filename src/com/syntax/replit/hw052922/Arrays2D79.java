package com.syntax.replit.hw052922;

public class Arrays2D79 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to print from a 2D array
		 * Example Output:
		 * 1.4 2.0 3.3 2.0
		 * 4.0 1.5 6.1 1.0
		 * 1.2 3.1 4.0 1.6
		 */
		double[] [] values = {   {1.4, 2.0, 3.3, 2.0}, {4.0, 1.5, 6.1, 1.0}, {1.2, 3.1, 4.0, 1.6}  };
		for (int i = 0; i < values.length; i ++) {
			for (int j = 0; j < values[0].length;  j++) {
				System.out.print(values[i] [j] + " ");
			}
			System.out.println();
		}
	}
}