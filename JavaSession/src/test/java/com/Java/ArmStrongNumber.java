package com.Java;

public class ArmStrongNumber {

	public static void main(String[] args) {

		int no = 153;
		int cube = 0;
		int rem = 0;
		int t = no;
		while (no > 0) {
			rem = no % 10;
			no = no / 10;
			cube = cube + (rem * rem * rem);
		}
		if (t == cube) {
			System.out.println("Given number is armstrong");

		} else {
			System.out.println("Given number is not armstrong");

		}

	}

}
