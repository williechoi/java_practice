package org.opentutorials.javatutorials.oop;

public class Inheritance {

	public static void main(String[] args) {
		// inheritance = 	the process where one class acquires,
		//					the attributes and methods of another.
		
		Car3 car = new Car3();
		Bicycle bike = new Bicycle();
		
		car.go();
		bike.stop();
		
		System.out.println(car.speed);
		System.out.println(bike.speed);
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);
		
	}

}
