package com.Java;

public class FibonacciSeries {
	public static void main(String[] args) {

		int f = 0, s = 1, count = 10;

		for (int i = 0; i < count; i++) {
			int t = f + s;
			f = s;
			s = t;
			System.out.println(t);

		}

	}
}
