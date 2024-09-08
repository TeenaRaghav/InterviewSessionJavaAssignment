package practiseCodes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternMatcher {
	public static void main(String[] args) {
//	Pattern pattern = Pattern.compile(".m");
//	Matcher matcher = pattern.matcher(".am");
//	boolean b = matcher.matches();
//	boolean b = Pattern.matches(".m", ".am");

//	System.out.println(b);

//	System.out.println(Pattern.matches("[amn]", "acd"));
//	System.out.println(Pattern.matches("[^amn]", "c"));
//	System.out.println(Pattern.matches("[a-zA-s]", "T"));
//	System.out.println(Pattern.matches("[MS][a-z]{5}","Monica"));
//		System.out.println(Pattern.matches("[xyz]?", "x"));
//		System.out.println(Pattern.matches("[xyz]+", "m"));
//		System.out.println(Pattern.matches("[xyz]*","xyyza"));
//		System.out.println(Pattern.matches("//d", "1"));
//		System.out.println(Pattern.matches("\\D", "1"));

//		String regex = "a+b+";
		
//		character quantifiers
		
/// 	* = 0 or more number
//		? = b, once or not at all
//		+ = b, one or more times
//		x{n} = x, exactly n times
//		x{n,} = x,atleast n times it can be more than n times
//		x{n,m}=x, atleast n  times but not more than m times
		
//	Pattern pattern = Pattern.compile(regex);
//		Matcher matcher = pattern.matcher("aabbbbbbb");
//		boolean b = matcher.matches();
//		System.out.println(b);
		
		System.out.println(Pattern.matches("[ayz]?", "ayz"));
//		Pattern pattern = Pattern.compile(".XX.");
//		Matcher matcher = pattern.matcher("AXXB");
//		System.out.println(matcher.matches());
//		
//		character class
		 
//		System.out.println(Pattern.matches("[xyz]", "wbcd"));
//		System.out.println(Pattern.matches("[xyz]", "x"));
//		System.out.println(Pattern.matches("[xyz]","xxyyyyyyz"));
	
//	MetaCharacter d
		System.out.println(Pattern.matches("d", "1"));
		System.out.println(Pattern.matches("D", "1"));

		System.out.println(Pattern.matches("d", "323bc"));
	}
}
