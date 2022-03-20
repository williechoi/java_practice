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
		

	}
	
	static void hello() { // without parameters
		System.out.println("Hello, I am method!");
	}
	
	static void hello_name(String name) {	// with parameters
		System.out.println("Hello, " + name);
	}

}
