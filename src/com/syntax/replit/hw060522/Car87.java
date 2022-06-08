package com.syntax.replit.hw060522;

class Car87 {
		
		/*
		 * Create a class named 'Main' with specific attributes.
		 * Create two objects of that class in which you will
		 * be assigning the following values and then print them.
		 * carColor = 'Black'
		 * carYear = 2019
		 * carMake = 'BMW'
		 * carColor = 'White'
		 * carYear = 2018
		 * carMake = 'Toyota'
		 * Expected Output:
		 * car color is Black and car year is 2019 and
		 * car model is BMW
		 * Car color is White and car year is 2018 and
		 * car model is Toyota.
		 */
		String color;
		int year;
		String make;
/*		
		void moveForward() {
			System.out.println("Car is moving forward");
		}
		void reverse() {
			System.out.println("Moving backwards");
		}
*/		
		
		public static void main(String[] args ) { 
			
			Car87 bmw = new Car87();
			bmw.color = "Black";
			bmw.year = 2019;
			bmw.make = "BMW";
			System.out.println("Car color is " + bmw.color + " and car year is " + bmw.year + " and car model is " + bmw.make);
			
			Car87 toyota = new Car87();
			toyota.color = "White";
			toyota.year = 2018;
			toyota.make = "Toyota";
			System.out.println("Car color is " + toyota.color + " and car year is " + toyota.year + " and car model is " + toyota.make);
	}
}