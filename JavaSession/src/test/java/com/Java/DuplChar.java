package com.Java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplChar {

	public static void main(String[] args) {

		String s = "HelloJavaWorlda";
		char[] charArray = s.toCharArray();
		System.out.println(charArray.length);

		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (char c : charArray) {

			if (m.containsKey(c)) {

				m.put(c, m.get(c) + 1);

			} else {

				m.put(c, 1);

			}

		}

		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() >= 1) {
				System.out.println("key" + entry.getKey() + ":" + "value" + entry.getValue());

			}
		}

	}

}
