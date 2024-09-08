package practiseCodes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter the regex pattern:");
			String regex = sc.nextLine();
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher("Welcome to YouTube Channel");
			boolean found = false;
			while (matcher.find()) {
				System.out.println("found the text " + matcher.group() + " starting at index " + matcher.start()
						+ " and ending at index " + matcher.end());
				found = true;
			}
			if (!found) {
				System.out.println("Match not found.");

			}
		}
	}
}
