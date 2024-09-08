package practiseCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class RemoveSecondLargestValueFromHashMap {
	public static void removeSecondLargestNum(Map<Integer,Integer> map) {
		if(map.size() < 2) {
			System.out.println("not enough elements to find largest number.");
		}
		
		Set<Integer> uniqueValues = new HashSet<>(map.values());
		
		List<Integer> sortedValues = new ArrayList<>(uniqueValues);
		Collections.sort(sortedValues,Collections.reverseOrder());
		
		int secondLargestValue = sortedValues.get(1);
		int keyToRemove = 0;
		
		if(sortedValues.size() < 2) {
			System.out.println("cannot remove the second largest number.");
		}
		
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			if(entry.getValue() == secondLargestValue) {
				keyToRemove = entry.getKey();
				break;
			}
		}
		if(keyToRemove != 0) {
			map.remove(keyToRemove);
		}
		
	}
public static void main(String[] args) {
	Map<Integer,Integer> map = new HashMap<>();
	map.put(1, 10);
	map.put(2, 12);
	map.put(3, 9);
	map.put(4, 125);
	map.put(5, 13);
	
	System.out.println("original map is:" + map);
	removeSecondLargestNum(map);
	System.out.println("after removing second largest Number: " + map);
	
	
}
}
