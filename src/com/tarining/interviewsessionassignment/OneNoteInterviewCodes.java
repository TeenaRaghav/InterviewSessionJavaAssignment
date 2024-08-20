package com.tarining.interviewsessionassignment;

public class OneNoteInterviewCodes {
public static void main(String[] args) {
	String str1 = new String("hellothere");
	String str2 = new String("hellothere");

//	"==" is used to compare the reference of the object not the contents
	System.out.println(str1==str2);
//	System.out.println(str1.equals(str2));
	str1.length();
}
}
//The code will output false.
//
//Here's why:
//
//The == operator in Java is used to compare the references of two objects, not their contents.
//In this case, str1 and str2 are two different objects in memory, even though they contain the same string "hellothere".
//Since str1 and str2 are different objects, the == operator will return false.
//If you wanted to compare the contents of the strings, you would use the .equals() method, like this: