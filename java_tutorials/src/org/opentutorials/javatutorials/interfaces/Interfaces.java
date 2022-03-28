package org.opentutorials.javatutorials.interfaces;

public class Interfaces {

	public static void main(String[] args) {
		// interface = 	a template that can be applied to a class.
		// 				similar to inheritance, but specifies what a class has/must do.
		//				classes can apply more than one interface, inheritance is limited to 1 super
		Rabbit rb = new Rabbit();
		rb.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish fish = new Fish();
		fish.hunt();
		fish.flee();
	}

}
