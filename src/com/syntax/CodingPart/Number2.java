package com.syntax.CodingPart;

import java.util.Scanner;

public class Number2 {

	public static void main(String[] args) {
		/*
		 * 2. Using Scanner creates an array of countries. When an array is created,
		 * retrieve all values from it and while retrieving those values print capital
		 * for each country. (use 2 different loops). == EA
		 */

		Scanner input = new Scanner(System.in);
		String[] countries = new String[5];
		System.out.println("Can you please pick 5 countries from the following list?");
		System.out
				.println("Turkey, Pakistan, Nigeria, Ukraine, Syria, China, Brazil, Barbados, Armenia and Azerbaijan");

		int a = 1;
		for (int i = 0; i < countries.length; i++) {

			System.out.print(a + ": ");
			countries[i] = input.next();
			a++;
		}

		for (int b = 0; b < countries.length; b++) {

			if (countries[b].equalsIgnoreCase("turkey")) {
				System.out.println("The capital of " + countries[b] + " is Ankara");

			}
			if (countries[b].equalsIgnoreCase("pakistan")) {
				System.out.println("The capital of " + countries[b] + " is Islamabad");

			}
			if (countries[b].equalsIgnoreCase("Nigeria")) {
				System.out.println("The capital of " + countries[b] + " is Abuja");
			}
			if (countries[b].equalsIgnoreCase("Ukraine")) {
				System.out.println("The capital of " + countries[b] + " is Kyiv");
			}
			if (countries[b].equalsIgnoreCase("Azerbaijan")) {
				System.out.println("The capital of " + countries[b] + " is Baku");
			}
			if (countries[b].equalsIgnoreCase("Syria")) {
				System.out.println("The capital of " + countries[b] + " is Damascus");
			}
			if (countries[b].equalsIgnoreCase("China")) {
				System.out.println("The capital of " + countries[b] + " is Beijing");
			}
			if (countries[b].equalsIgnoreCase("Brazil")) {
				System.out.println("The capital of " + countries[b] + " is Brasilia");
			}
			if (countries[b].equalsIgnoreCase("Barbados")) {
				System.out.println("The capital of " + countries[b] + " is Bridgetown");
			}
			if (countries[b].equalsIgnoreCase("Armenia")) {
				System.out.println("The capital of " + countries[b] + " is Yerevan");
			}

		}
		System.out.println(" ");

		System.out.println("The rest of the countries were not on the list");
input.close();
	}

}
