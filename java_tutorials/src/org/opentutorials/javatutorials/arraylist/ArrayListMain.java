package org.opentutorials.javatutorials.arraylist;
import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		// ArrayList = a """resizable""" array.
		// Elements can be added and removed after compilation phase
		// store reference data types
		
		// if you want to store primitive data types, you need to use the corresponding wrapper class.
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		System.out.println("===== 1st print =====");
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		System.out.println();
		
		food.set(0, "sushi");
		System.out.println("===== 2nd print =====");
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		System.out.println();
		
		food.remove(2);
		System.out.println("===== 3rd print =====");
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		
		System.out.println();
		
		// clear all members
		food.clear();
		System.out.println("===== 4th print =====");
		for(int i = 0; i < food.size(); i++) {
			System.out.println(food.get(i));
		}
		

	}

}
