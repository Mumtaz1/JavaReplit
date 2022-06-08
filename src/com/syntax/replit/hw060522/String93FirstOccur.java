package com.syntax.replit.hw060522;

public class String93FirstOccur {

	public static void main(String[] args) {
		
		/*
		 * String "abracadabra alakazam";
		 * Print out the position of the first occurrence of "c".
		 * Print out the position of the first occurrence of " ".
		 * String target1 = "dab";
		 * Print out the position of the first occurrence of the
		 * variable target1.
		 * String target2 = "ABRA";
		 * Print out the position of the first occurrence of the
		 * variable target2.
		 * Expected Output:
		 * 4
		 * 11
		 * 6
		 * -1
		 */
		
		String str =  new String("abracadabra alakazam");
		String target1 = "dab";
		String target2 = "ABRA";
		
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf(" "));
//		System.out.println(str.indexOf("dab"));
//		System.out.println(str.indexOf("ABRA"));
		System.out.println(str.indexOf(target1));
		System.out.println(str.indexOf(target2));
		
		
	}
}

