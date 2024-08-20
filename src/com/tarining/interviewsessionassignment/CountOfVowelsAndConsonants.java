package com.tarining.interviewsessionassignment;

import java.util.Scanner;

public class CountOfVowelsAndConsonants {
	public static boolean isVowel(char ch) {
		return "aeiou".indexOf(ch) != -1;
	}

	public static boolean isConsonant(char ch) {
		return ch >= 'a' && ch <= 'z' != isVowel(ch);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		int vowelcounter = 0;
		int consonantcounter = 0;

		for (char ch : str.toCharArray()) {
			if (isVowel(ch)) {
				vowelcounter++;
			} else if (isConsonant(ch)) {
				consonantcounter++;
			}
		}
		
		System.out.println("Number of Vowels : " + vowelcounter);
		System.out.println("Number of Consonant : " + consonantcounter);

	}
}