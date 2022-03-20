package org.opentutorials.javatutorials.oop;

public class OopObjects {
	public static void main(String[] args) {

		// object = an instance of a class that may contain attributes and methods
		// example: (phone, desk, computer, coffee cup)
		
		Car car1 = new Car();
		Car car2 = new Car();
		
		System.out.println(car1.model);
		System.out.println(car2.make);
		System.out.println();
		car1.drive();
		car2.brake();
	}

}
