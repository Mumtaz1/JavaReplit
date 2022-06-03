package com.syntax.replit.hw052922;

public class Arrays2D83 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that calculates the sum of
		 * elements from each row in a 2D array and
		 * adds them into array of integers.
		 * For example, if we run rowSums for the 
		 * following 2D array:
		 * {
		 * {1, 1, 2}, 		//sum = 4
		 * {3, 1, 2},		//sum = 6
		 * {3, 5, 3},		//sum = 11
		 * {0, 1, 2}		//sum = 3 
		 * }
		 * Then we should get the following array back:
		 * 4
		 * 6
		 * 11
		 * 3
		 */
		int[] [] a = {   {1, 1, 2}, {3, 1, 2}, {3, 5,3}, {0, 1, 2}  };
		int row, col, sumRow = 0;
		
		for (row = 0; row < a.length; row ++) {
			sumRow = 0;
			for (col = 0; col < a[row].length; col ++) {
				sumRow += a[row] [col];
				}	
			System.out.println(sumRow);
			}
		}
}