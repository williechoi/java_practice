package org.opentutorials.javatutorials.oop;

public class Overloading {

	public static void main(String[] args) {
		
		Pizza pizza = new Pizza("thick crust", "tomato", "mozzerella", "pepperoni");
		Pizza cheesePizza = new Pizza("thick crust", "tomato", "mozzerella"); 
		
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(pizza.bread);
		System.out.println(pizza.sauce);
		System.out.println(pizza.cheese);
		System.out.println(pizza.topping);
		
		System.out.println("Here are the ingredients of your pizza: ");
		System.out.println(cheesePizza.bread);
		System.out.println(cheesePizza.sauce);
		System.out.println(cheesePizza.cheese);
		System.out.println(cheesePizza.topping);
		
	}

}
