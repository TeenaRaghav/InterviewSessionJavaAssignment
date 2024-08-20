package com.tarining.interviewsessionassignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfStudentsFromHashMap {
	public static void main(String[] args) {
		Map<Integer,String> st = new HashMap<>();
//		st.put(01, "Teena");
//		st.put(02, "jai");
//		st.put(03, "Pritish");
//		st.put(04, "Charu");
//		
		for(String s : st.values()) {
			System.out.println(s);
		}
	
//		create List to hold student names
//		List<String> stNames = new ArrayList<>();
//		
////		add names in list
//		for(String s : st.values()) {
//			stNames.add(s);
//		}
//
////		Print the names
//		
//		for(String names : stNames) {
//			System.out.println(names);
//		}
//		Print key and value From Map
//		for (Map.Entry<Integer, String> entry : st.entrySet()) {
//			System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
//		}
		
	}
}
