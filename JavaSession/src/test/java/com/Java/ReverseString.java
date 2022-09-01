package com.Java;

public class ReverseString {

	public static void main(String[] args) {

		String s = "Hello Java";

		StringBuffer s1 = new StringBuffer();
		StringBuffer append = s1.append(s);
		StringBuffer reverse = append.reverse();
		System.out.println(reverse);
	}

}
