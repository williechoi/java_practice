package org.opentutorials.javatutorials.method;
import java.util.*;


public class MethodMain {

	public static void main(String[] args) {

		// method = a block of code that is executed whenever it is called upon
		hello();
		hello();
		hello();
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Bro");
		names.add("Code");
		names.add("Hyungsuk");
		names.add("Choi");
		names.add("Zzang");
		
		for(String name: names) {
			hello_name(name);	
		}
		
		hello_name_and_age("Bro", 21);
		
		int x = 3;
		int y = 4;
		
		int answer = add(x, y);
		System.out.println("The answer of (3 + 4) is " + answer);

	}
	
	static void hello() { // without parameters
		System.out.println("Hello, I am method!");
	}
	
	static void hello_name(String name) {	// with parameters
		System.out.println("Hello, " + name);
	}
	
	static void hello_name_and_age(String name, int age) {
		System.out.println("Hello, " + name);
		System.out.println("I am " + age);
	}
	
	static int add(int x, int y) {
		return x + y;
	}
}
