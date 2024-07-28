package com.tarining.interviewsessionassignment;

import java.util.Arrays;
import java.util.Scanner;

public class StringAreAnagram {
	public static boolean areAnagram(String str1 , String str2) {
		
		str1 = str1.replaceAll("\\s","").toLowerCase();
		str2 = str2.replaceAll("\\s","").toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
		char[] charArr1 = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		return Arrays.equals(charArr1, charArr2);
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first String : ");
	String str1 = sc.next();
	System.out.println("Enter the second String : ");
	String str2 = sc.next();
		
	if(areAnagram(str1,str2)) {
		System.out.println(str1 + " and " + str2 + " are anagrams.");
	}else {
		System.out.println(str1 + " and " + str2 + " are not anagrams.");

	}

	
}
}
