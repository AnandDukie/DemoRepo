package com.Java;

public class PrimeNumber {

	public static void main(String[] args) {

		int no = 19;
		boolean prime = true;

		for (int i = 2; i <= no; i++) {

			if (no % 2 == 0) {
				System.out.println("given number is not prime");
				prime = false;
				break;
			}

			if (prime == true) {
				System.out.println("given number is prime");
				break;
			}

			else {
				System.out.println("Not a prime");

			}
		}

	}
}
