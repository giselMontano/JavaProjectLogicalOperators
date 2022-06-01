package com.syntax.CodingPart;

public class Number6 {

	public static void main(String[] args) {
		/*
		 * 6. Write a program to swap 2 numbers without a temporary variable?
		 */

		int a = 10, b = 20;

		System.out.println("Before the swap " + a + " " + b);

		// explanation
		a = a + b; // 10+20 a=30 leaving b to be 20
		b = a - b; // 30-20 b=10 leaving a to be 30
		a = a - b; // 30-10 a=20 leaving b to be 10

		System.out.println("After the swap " + a + " " + b);
	}

}
