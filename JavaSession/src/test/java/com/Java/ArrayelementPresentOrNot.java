package com.Java;

public class ArrayelementPresentOrNot {

	public static void main(String[] args) {

		int[] givenarray = { 1, 2, 3, 4, 5, 6 };
		int numbertofind = 7;
		boolean array = false;

		for (int i : givenarray) {

			if (i == numbertofind) {
				array = true;
			}

		}

		if (array) {
			System.out.println("Number is present in the array");
		} else {
			System.out.println("Number is not present in the array");

		}

	}

}
