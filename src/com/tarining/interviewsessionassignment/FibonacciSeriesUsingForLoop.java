package com.tarining.interviewsessionassignment;

import java.util.Scanner;

public class FibonacciSeriesUsingForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms in the fibonacci series:");
		int n = sc.nextInt();
		
		int firstNum = 0;
		int secondNum = 1;
		
		System.out.println("Fibonacci series upto" + n +" terms:");
		
		for(int i = 0; i <= n ;i++) {
			System.out.println(firstNum);
			int Thirdnum = firstNum + secondNum ;
			firstNum = secondNum;
			secondNum = Thirdnum;
			
		}
		
	}
}
