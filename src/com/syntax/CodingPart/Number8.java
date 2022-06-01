package com.syntax.CodingPart;

public class Number8 {

	public static void main(String[] args) {
		/*
		 * 8. Write a Java Program to print the first 10 numbers of Fibonacci series.
		 * ==SA
		 */

		int a = 0;
		int b = 1;
		int c;

		for (int i = 0; i < 10; i++) {

			System.out.print(a + " ");
			c = a + b;
			a = b;
			b = c;
		}

	}

}
