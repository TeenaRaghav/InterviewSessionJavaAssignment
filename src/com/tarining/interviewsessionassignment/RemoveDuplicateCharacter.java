package com.tarining.interviewsessionassignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharacter {
	public static String removeDuplicate(String str) {
//		Set<Character> charSet = new HashSet<>();
//		for(char ch : str.toCharArray()) {
//			charSet.add(ch);
//		}
//		
//		StringBuilder output = new StringBuilder();
//		for(char ch : charSet) {
//			output.append(ch);
//		}
//		
//		return output.toString();
//		
		
		Map<Character,Boolean> charcount = new HashMap<>();
		
		StringBuilder output = new StringBuilder();

		
		for(char ch : str.toCharArray()) {
			if(!charcount.containsKey(ch)) {
				charcount.put(ch, true);
				output.append(ch);
			}
		}
		return output.toString();
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String st = sc.nextLine();
	System.out.println("The result is : "+removeDuplicate(st));
	
}
}
