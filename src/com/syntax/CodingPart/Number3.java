package com.syntax.CodingPart;

public class Number3 {

	public static void main(String[] args) {
		/*3. Create a 2D array of integer values. 
		 * Print the sum of all numbers. ==GM
		 */

		int[][] num = { 
				       { 10, 20, 30, 40 }, 
				       { 50, 60, 70 }, 
				       { 200, 400, 600, 1000 }
				       };

		int sum = 0;
		for (int row = 0; row < num.length; row++) {

			for (int col = 0; col < num[row].length; col++) {
				sum += num[row][col];
			}

		}
		System.out.println("Sum of all the elements " + sum);
	}

}
