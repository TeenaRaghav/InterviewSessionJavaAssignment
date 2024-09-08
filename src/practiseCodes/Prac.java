package practiseCodes;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Prac {
public static String getUniqueCharacters(String st) {
	Map<Character,Integer> characterCount = new LinkedHashMap<>();
	
	for(Character ch : st.toCharArray()) {
		characterCount.put(ch,characterCount.getOrDefault(ch, 0)+1);
	}
	
	StringBuilder output = new StringBuilder();
	
	for(Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
		if(entry.getValue()==1) {
			output.append(entry.getKey());
		}
	}
	return output.toString();
	
}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String st = sc.nextLine();
	String result = getUniqueCharacters(st);
	System.out.println("The result is :" +result);
	

}
}
