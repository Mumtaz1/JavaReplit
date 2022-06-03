package com.syntax.replit.hw051522;

import java.util.Scanner;

public class LogicalOp39 {

	public static void main(String[] args) {
		
		 /* A school has following rules for grading
	     * systems:
	     * a. 1 to 25 - F
	     * b. 25 to 45 - E
	     * c. 45 to 50 - D
	     * d. 50 to 60 - C
	     * e. 60 to 80 - B
	     * f. Above 80 - A
	     * Ask the use to enter marks and print the 
	     * corresponding grade.
	     * Example Output:
	     * Please enter your mark
	     * Your grade is A
	     *
	     * Example Output:
	     * Please enter your mark
	     * Please enter valid mark
	    */ 
		
		Scanner input = new Scanner(System.in); // Create a Scanner object

		char grade = 'A';
		
		System.out.println("Please enter your mark");
		int mark = input.nextInt();
		
		if (mark >= 1 && mark <= 25) {
			grade = 'F';
			System.out.println("Your grade is " + grade);
		} else if (mark >= 26 && mark <= 45) {
			grade = 'E';
			System.out.println("Your grade is " + grade);
		} else if (mark >= 46 && mark <= 50) {
			grade = 'D';
			System.out.println("Your grade is " + grade);
		} else if (mark >= 51 && mark <= 60) {
			grade = 'C';
			System.out.println("Your grade is " + grade);
		} else if (mark >= 61 && mark <= 80) {
			grade = 'B';
			System.out.println("Your grade is " + grade);
		} else if (mark >= 81) {
			grade = 'A';
			System.out.println("Your grade is " + grade);
		} else {
			System.out.println("Please enter valid mark");
		}
	}
}