package com.syntax.replit.hw052922;

import java.util.Scanner;

public class Arrays76 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that creates a String array
		 * with a size of 7. Ask the user to input Days
		 * of the week beginning with Sunday using
		 * Scanner class. Add these inputs to your
		 * array and then print all values from that array.
		 * Example:
		 * Please enter day 1 of the week
		 * Sunday
		 * Please enter day 2 of the week
		 * Monday
		 * etc.
		 */
		Scanner input = new Scanner(System.in);

		String[] day = new String[7];
		for (int i = 0; i < 7; i++) {
			System.out.println("Please enter day " + (i + 1) + " of the week");
			day[i] = input.next();
		}
		for (int i = 0; i < day.length; i++) {
			System.out.println(day[i]);
		}
	}
}