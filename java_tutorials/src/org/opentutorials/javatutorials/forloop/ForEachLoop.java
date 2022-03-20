package org.opentutorials.javatutorials.forloop;
import java.util.*;

public class ForEachLoop {

	public static void main(String[] args) {
		// for-each Loop = traversing technique. less steps more readable but less flexible
		
		String[] animals = {"cat", "dog", "rat", "bird"};
		
		for(String animal : animals) {
			System.out.print(animal + ", ");
		}
		
		System.out.println();
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Toyota");
		cars.add("Hyundai");
		cars.add("BMW");
		
		for(String car : cars) {
			System.out.print(car + ", ");
		}
		
		System.out.println();

	}

}
