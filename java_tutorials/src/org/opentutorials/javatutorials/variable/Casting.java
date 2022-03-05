package org.opentutorials.javatutorials.variable;

public class Casting {

	public static void main(String[] args) {
		
		double a = 1;			// implicit type conversion
		double b = (double) 1;	// explicit type conversion
		
		System.out.println("b is: " + a);
		System.out.println("b2 is: " + b);
		
		int d = (int) 1.1;
		double e = 1.1;
		System.out.println("d is: " + d);
		System.out.println("e is: " + e);
		
		String k = Integer.toString(d);	// convert an integer to a string
		System.out.println("k is: " + k);
		System.out.println("k is of " + k.getClass() + " type");

	}

}
