package practiseCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student{
	private int id;
	private String names;
	
	public Student (int id , String names) {
		this.id = id;
		this.names = names;
	}
	
	public String getName() {
		return names;
	}
	
	public int getId() {
		return id;
	}
}

public class StudentNamesInList{
	public static void main(String[] args) {
		Map<Integer,Student> stName = new HashMap<>();
		stName.put(1,new Student(1, "Teena"));
		stName.put(2,new Student(2, "Pritish"));
		stName.put(3,new Student(3, "Jai"));
		stName.put(4,new Student(4, "Charu"));

		
		List<String> name = new ArrayList<>();
		
		for (Student s : stName.values()) {
			name.add(s.getName());
		}
	
	for (String n : name) {
		System.out.println(n);
	}
	
	}
}