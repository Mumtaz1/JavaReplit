package com.syntax.replit.hw050922;

import java.util.Scanner;

public class Conditional26 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		System.out.println("In:");
		String name = inp.nextLine();
		
		//DO NOT CHANGE ABOVE CODE!  Write your code below
	  	/* 
	  	 * The variable "name" hold a String user input
	     * Write a conditional statement starting on line 9
	     * that does the following:
	     * - If name is equal to "Chen", print "teacher"
	     * - For any other input, print "student"
	     * Examples:
	     * In: Chen
	     * teacher
	     *
	     * In: Faa
	     * student
	    */
		if (name.equals( "Chen")) {
			System.out.println("teacher");
		} else { 
			System.out.println("student");
		}
	}
}
