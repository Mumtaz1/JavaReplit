package com.syntax.replit.hw050922;

import java.util.Scanner;

public class Conditional25 {

	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
	  	System.out.print("In:");
	  	int num = inp.nextInt();
	  	//DO NOT CHANGE ABOVE CODE!  Write your code below
	    /* The variable "num" holds an integer input from a
	     * user. Write a conditional statement starting on
	     * line 9 that does the following:
	     * - If num is positive, print "_ is positive"
	     * - If num is negative, print "_ is negative"
	     * - If num is equals to 0, then print "Entered number
	     *      is equals to 0 "
	     * Exmaples:
	     * In: 5
	     * 5 is positive
	     *
	     * In: -2
	     * -2 is negative
	     *
	     * In: 0
	     * Entered number is equals to 0
	    */
	  	if (num > 0) {
	  		System.out.println(num + " is positive"); 
	  		} else if (num < 0) {
	  			System.out.println((num + " is negative")); 
	  			} else {
	  				System.out.println("Entered number is equals to 0");
	  		} 
	  	}
	}
