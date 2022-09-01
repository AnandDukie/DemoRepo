package com.Java;

public class PalindromeNumber {

	public static void main(String[] args) {

		int no = 131;
		int rem = 0;
		int no2 = no;

		while (no > 0) {
			rem = (rem * 10) + no % 10;
			no = no / 10;

		}
		System.out.println(rem);
		if (no2 == rem) {
			System.out.println("Given number is palindrome");

		} else {
			System.out.println("Given number is not palindrome");
		}

	}

}
