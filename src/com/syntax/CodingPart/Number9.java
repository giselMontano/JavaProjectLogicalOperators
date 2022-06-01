package com.syntax.CodingPart;

public class Number9 {

	public static void main(String[] args) {
		/* 9. Maximum and minimum number in the array? YR */

		int[] array = { 11, 44, 63, 7, 17, 31, 101, 3, 144, 10 };
		int max = array[0];
		int min = array[0];
		for (int check : array) {
			if (check > max) {
				max = check;
			} else if (check < min) {
				min = check;
			}
		}
		System.out.println(max);

		System.out.println(min);
	}

}
