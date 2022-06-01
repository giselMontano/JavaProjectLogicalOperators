package com.syntax.CodingPart;

public class Number4 {

	public static void main(String[] args) {
		/*
		 * 4. Create a 2D array or integer type where you will store odd and even
		 * numbers. Develop a program which will identify/print the even numbers only.
		 * == JK
		 */

		int[][] numbers = { 
				          { 10, 25, 31 }, 
				          { 22, 11, 7 }, 
				          { 7, 18, 29, 12 }
				          };

		for (int i = 0; i < numbers.length; i++) {
			for (int y = 0; y < numbers[i].length; y++) {
				if (numbers[i][y] % 2 == 0) {
					System.out.println(numbers[i][y] + " is an even number in the 2d array");
				}
			}
		}
	}

}
