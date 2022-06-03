package com.syntax.replit.hw052922;

public class Arrays2D84 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that prints the total number
		 * of elements that are negative AND odd.
		 * Input:
		 * int [] [] a = {
		 * {-5, -2, -3, 7},
		 * {1, -5, -2, 2},
		 * {1, -2, 3, -4}
		 * };
		 * Output:
		 * 3
		 */
		int []  [] a=  new int [] [] {   {-5, -2, -3, 7}, {1, -5, -2, 2}, {1, -2, 3, -4}  };
		
		int count = 0;
	    for (int i=0; i<a.length; i++) {
	      for (int j=0; j<a[i].length; j++) {
	        if (a[i][j]<0 && a[i][j]%2!=0) {
	          count++;
	        }
	      }
	    }
		System.out.println(count);
		}
	}