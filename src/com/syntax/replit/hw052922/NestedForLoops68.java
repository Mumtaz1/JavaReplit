package com.syntax.replit.hw052922;

public class NestedForLoops68 {

	public static void main(String[] args) {

		/*
		 * Write a program to print out the pattern 
		 * $$$$ 
		 * $ $
		 * $ $ 
		 * $$$$
		 */
		/*
		 * for (int i = 0; i < 1; i ++) { for (int j = 0; j < i; j++) {
		 * System.out.println( "$$$$"); System.out.println("$ $"); }
		 * System.out.println("$ $"); System.out.println("$$$$"); }
		 */

		for(int i=0; i<1; i++){
		    for(int y=0; y<1; y++){
		      System.out.println("$$$$");
		      System.out.println("$  $");
		    }
		    System.out.println("$  $");
		    System.out.println("$$$$");
		  }
	}
}