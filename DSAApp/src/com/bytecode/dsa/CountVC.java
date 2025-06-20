package com.bytecode.dsa;

import java.util.HashSet;

public class CountVC {

	public static void main(String[] args) {
		String s1 = "bytEcodebytEcode";
		String s2 = s1.toLowerCase();
		HashSet<Character> vowel = new HashSet<>();
		HashSet<Character> consonants = new HashSet<>();

		for (int i = 0; i < s2.length(); i++) {
			char x = s2.charAt(i);
			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				vowel.add(x);

			} else {
				consonants.add(x);
			}
		}
		System.out.println("Total Number of vovels=" + vowel);
		System.out.println("Total Number of consonants=" + consonants);
		
		System.out.println("Total Number of vovels=" + vowel.size());
		System.out.println("Total Number of consonants=" + consonants.size());

	}

}
