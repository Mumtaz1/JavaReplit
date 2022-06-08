package com.syntax.replit.hw060522;

import java.util.Scanner;

class String97Browser {

	public static void main(String[] args) {

		/*
		 * Based on the user input the program should give a correct answer. If browser
		 * is Chrome or CHROME or ChRoME it should print: "Proceed with Chrome Browser".
		 * If browser is firefox, FIREFOX or FireFOX it should print:
		 * "Proceed with Firefox browser" If browser is IE, ie, or iE it should print:
		 * "Proceed with IE browser" If any other browser it should print:
		 * "Invalid browser"
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name to proceed further with execution");
		String browser = sc.nextLine();
		
		String browser1 = "Chrome";
		String browser2 = "Firefox";
		String browser3 = "IE";
		
		if (browser.equalsIgnoreCase(browser1)) {
			System.out.println("Proceed with Chrome browser");
		} else if (browser.equalsIgnoreCase(browser2)) {
			System.out.println("Proceed with Firefox browser");
		} else if (browser.equalsIgnoreCase(browser3)) {
			System.out.println("Proceed with IE browser");
		} else {
			System.out.println("Invalid browser");
		}
		sc.close();
	}
}