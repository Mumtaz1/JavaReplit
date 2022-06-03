package com.syntax.replit.hw052222;

public class ForLoop62 {

	public static void main(String[] args) {
		
		/*
		 * Step1: does initialization 
		 * Step 2: checks condition 
		 * Step 3: does the print
		 * Step 4: then does the increment
		 */
		
		/*
		 * Using for loop Print 1 to 10 Numbers except 5 and 6
		 * Expected Output:
		 * 1
		 * 2
		 * 3
		 * 4
		 * 7 until 10. Note we skipped 5 and 6.
		 * 
		 */
		
		for (int i = 1; i <= 10; i++) {
			if (i == 5 || i == 6) {
				continue;
			}
			System.out.println(i);
		}
	}
}