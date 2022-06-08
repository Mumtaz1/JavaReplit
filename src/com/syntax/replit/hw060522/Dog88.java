package com.syntax.replit.hw060522;

public class Dog88 {
		
		/*
		 * Create a Class Main
		 * In this class, you should specify the following 
		 * attributes: breed, name, color, and following
		 * behaviors: bark(), run(), play().
		 * Create 3 different objects of it: Husky, Bulldog,
		 * Labrador with specifc attributes and behaviors.
		 * The output of the program should be as
		 * following:
		 * Husky can bark
		 * Husky can run
		 * Husky can play
		 * Bulldog can bark
		 * Bulldog can run
		 * Bulldog can play
		 * Labrador can bark
		 * Labrador can run
		 * Labrador can play
		 */

		// Attributes how the object will look like

		String breed;
		String name;
		String color;
		
		// How the object behaves
		void bark() {
			System.out.println(" can bark");
		}

		void run() {
			System.out.println(" can run");
		}

		void play() {
			System.out.println(" can play");
		}

		public static void main(String[] args) {

			Dog88 Husky = new Dog88(); // creating an object and storing in a variable
			Husky.breed = "Husky";
			Husky.name = "Bailey";
			Husky.color = "black";
			System.out.print(Husky.breed);
			Husky.bark();
			System.out.print(Husky.breed);
			Husky.run();
			System.out.print(Husky.breed);
			Husky.play();
		
			Dog88 Bulldog = new Dog88(); // creating an object and storing in a variable
			Bulldog.breed = "Bulldog";
			Bulldog.name = "Butch";
			Bulldog.color = "brown";
			System.out.print(Bulldog.breed);
			Bulldog.bark();
			System.out.print(Bulldog.breed);
			Bulldog.run();
			System.out.print(Bulldog.breed);
			Bulldog.play();
			
			Dog88 Labrador = new Dog88(); // creating an object and storing in a variable
			Labrador.breed = "Labrador";
			Labrador.name = "Fluffy";
			Labrador.color = "white";
			System.out.print(Labrador.breed);
			Labrador.bark();
			System.out.print(Labrador.breed);
			Labrador.run();
			System.out.print(Labrador.breed);
			Labrador.play();
			
		}
	}