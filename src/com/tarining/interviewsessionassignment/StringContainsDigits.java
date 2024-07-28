package com.tarining.interviewsessionassignment;

import java.util.Scanner;

public class StringContainsDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		for (Character c : str.toCharArray()) {
			if(Character.isDigit(c)) {
				System.out.println();
			}
		}
	}
}
