package com.syntax.replit.hw060522;

class Main {

	String name;
	int roll_no;

	public static void main(String[] args) {

		//This is for repl86.
		
		/*
		 * Create a class 'Main' (please do not make it public as Repl will give you an
		 * error). 
		 * Inside class declare a String variable 'name' and integer variable
		 * 'roll_no'. 
		 * Create an object of the class and assign the value of 2 to roll_no
		 * and value of "John" to name. 
		 * Your program should print the following: 
		 * Name is John and roll number is 2.
		 */

		Main JohnRoll = new Main();
		JohnRoll.name = "John";
		JohnRoll.roll_no = 2;
		System.out.println("Name is " + JohnRoll.name + " and roll number is " + JohnRoll.roll_no);
	}
}
