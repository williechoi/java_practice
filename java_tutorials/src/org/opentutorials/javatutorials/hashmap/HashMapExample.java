package org.opentutorials.javatutorials.hashmap;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> empIds = new HashMap<>();
		
		empIds.put("John", 12345);
		empIds.put("Jang", 54321);
		empIds.put("Derek", 88654);
		
		System.out.println(empIds);
		
		// empIds['John'] in Python
		System.out.println(empIds.get("John"));
		
		// `in` operation in Python  
		System.out.println(empIds.containsKey("John"));
		
		System.out.println(empIds.containsValue(88654));
		
		// update value 
		empIds.put("John", 98765);
		System.out.println(empIds);
		
		// update value 
		empIds.replace("John", 88888);
		System.out.println(empIds);
		
		// putIfAbsent only puts value if there is no key associated
		empIds.putIfAbsent("John", 222);
		System.out.println(empIds);
		
		empIds.putIfAbsent("Kane", 222);
		System.out.println(empIds);
		
		empIds.remove("Kane");
		System.out.println(empIds);
	}

}
