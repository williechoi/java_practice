package org.opentutorials.javatutorials.sets;
import java.util.HashSet;
import java.util.Set;


public class Sets {
	public static void main(String[] args) {
		// Set: a collection with unique elements
		
		Set<Integer> t = new HashSet<Integer>();
		
		t.add(5);
		t.add(7);
		t.add(8);
		t.add(5);
		t.add(-1);
		t.add(9);
		
		boolean x = t.contains(5);
		int size = t.size();
		
		System.out.println(t);
		System.out.println(x);
		System.out.println(size);
		
		t.clear();
		System.out.println(t);
	}

}
