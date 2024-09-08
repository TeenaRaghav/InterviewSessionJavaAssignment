package practiseCodes;

public class ReversedString {
	public static String reverseString(String str) {
		String[] words = str.split(" ");

		StringBuilder reversedString = new StringBuilder();
		for (String w : words) {
			reversedString.append(new StringBuilder(w).reverse().toString());
		}

		return reversedString.append(" ").toString().trim();
	}

	public static void main(String[] args) {
		String str = "This is sample output";
		String reversedString = reverseString(str);
		System.out.println(reversedString);
	}
}
