package com.Java;

public class TriangleNumberPattern {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {

			for (int j = 1; j <= 6; j++) {
				if (j <= i) {
					System.out.print(i);

				}

			}
			System.out.println();
		}
	}

}
