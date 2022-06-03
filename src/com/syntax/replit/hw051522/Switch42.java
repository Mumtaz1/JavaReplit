package com.syntax.replit.hw051522;

import java.util.Scanner;

public class Switch42 {

	public static void main(String[] args) {

		/*
		 * The Scanner class is used to get user input, and it is found in the java.util
		 * package. The Scanner class is used for reading in primitive data types like
		 * int, double, float, etc., and objects of type String. - To read strings, we
		 * use next() - To read sentences, we use nextLine() - To read number values, we
		 * use nextInt() - To read decimal number, we use nextDouble() - To read a
		 * single character, we use next().charAt(0)
		 */

		/*
		 * Write a program using the switch statement. Let us consider there are three
		 * students in the class with roll number starting from (101 to 103) if any
		 * number other than 101-103 are present display
		 * "Not found Student name: in Class" First Output: Enter the roll number of the
		 * Child" case 101: if roll number is 101 print as "Student name: Ramesh" case
		 * 102: if roll number is 102 print as "Student name: Mahesh" case 103: if roll
		 * number is 103 print as"Student name: Mukesh" Other than this roll number it
		 * should print "Not found Student name: in Class"
		 */

		Scanner input = new Scanner(System.in); // Create a Scanner object

		String name;

		System.out.println("Enter the roll number of the Child");
		int rollNo = input.nextInt();

		switch (rollNo) {

		case 101:
			name = ("Ramesh");
			break;

		case 102:
			name = ("Mahesh");
			break;

		case 103:
			name = ("Mukesh");
			break;
		}
		if (rollNo == 101) {
			System.out.println("Student name: Ramesh");
		} else if (rollNo == 102) {
			System.out.println("Student name: Mahesh");
		} else if (rollNo == 103) {
			System.out.println("Student name: Mukesh");
		} else {
			System.out.println("Not found Student name: in Class");
		}
	}
}