package com.Java;

public class SwapNumbers {

	public static void main(String[] args) {

		int empsalary = 20000;
		int managersalary = 50000;

		System.out.println("Before Swappping");
		System.out.println(empsalary);
		System.out.println(managersalary);

		int temp = empsalary;
		empsalary = managersalary;

		managersalary = temp;

		System.out.println("After Swapping");
		System.out.println(empsalary);
		System.out.println(managersalary);

	}

}
