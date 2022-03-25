package org.opentutorials.javatutorials.oop;

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Human jane = new Human("Jane", 65, 70.3);
		Human john = new Human("John", 58, 58.7);
		System.out.println(jane.name + ", " + jane.age + ", " + jane.weight + "kg");
		System.out.println(john.name + ", " + john.age + ", " + john.weight + "kg");
		
		jane.eat();
		john.drink();
	}

}
