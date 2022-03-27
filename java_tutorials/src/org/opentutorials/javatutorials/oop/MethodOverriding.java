package org.opentutorials.javatutorials.oop;

public class MethodOverriding {

	public static void main(String[] args) {
		// method overriding = 	Declaring a method in sub class,
		//						which is already present in parent class.
		//						done so that a child class can give its own implementation
		
		Dog dog = new Dog();
		Animal animal = new Animal();
		
		dog.speak();
		animal.speak();
	}

}
