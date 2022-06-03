package com.syntax.replit.hw050122;

public class ArithmeticOp3 {

	public static void main(String[] args) {
		/* Write a program to print the perimeter and area
	     * of a rectangle with width = 5 and height = 8.
	     * Output:
	     * The perimeter of a rectangle with width _ and 
	     * height _ is equal to _ and the area equals to _
	     * Output:
	     * The perimeter of a rectangle with width __ and height __ is equals to __ and the area equals to __
	    */
	    int width = 5, height = 8;
	    int peri = 2 * (width + height);
	    int area = width * height;
	    System.out.println("The perimeter of a rectangle with width " + width + " and height " 
	    		+ height + " is equals to " + peri + " and the area equals to " + area);    
	  }
	}