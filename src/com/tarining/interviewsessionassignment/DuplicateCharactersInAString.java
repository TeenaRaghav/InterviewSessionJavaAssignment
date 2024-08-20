package com.tarining.interviewsessionassignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharactersInAString {
	public static void findDuplicate(String str) {
		str = str.toLowerCase();

		Map<Character, Integer> charCountMap = new HashMap<>();
		for (Character c : str.toCharArray()) {
			if (Character.isLetter(c)) {
				charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
			}
		}
//		for(char c : str.toCharArray()) {
//			if(charCountMap.containsKey(c)) {
//				charCountMap.put(c,charCountMap.get(c)+1);
//			}else {
//				charCountMap.put(c, 1);
//			}
//		}
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate character is : "+ entry.getKey());
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		findDuplicate(str);
	}
}