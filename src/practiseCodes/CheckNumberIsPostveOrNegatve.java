package practiseCodes;

import java.util.Scanner;

public class CheckNumberIsPostveOrNegatve {
	public static void checkNum(int num) {
		if(num >= 0) {
			System.out.println("The number "+ num + " is Positive");
		}else {
			System.out.println("The number "+ num + " is negative");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		checkNum(num);
		
		
		
	}

}
