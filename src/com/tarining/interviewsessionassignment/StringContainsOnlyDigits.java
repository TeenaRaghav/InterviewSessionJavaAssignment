package com.tarining.interviewsessionassignment;

import java.util.Scanner;

public class StringContainsOnlyDigits {
	public static boolean containsOnlyDigit(String str) {
		str = str.toLowerCase();
		for (Character c : str.toCharArray()) {
			if (!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();

		if(containsOnlyDigit(str) == true) {
			System.out.println("String contains only digit.");
		}else {
			System.out.println("String does not contains only digit.");
		}
	}
}
