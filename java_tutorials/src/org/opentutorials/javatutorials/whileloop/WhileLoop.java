package org.opentutorials.javatutorials.whileloop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String name= "";
		String age = "";
		
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Hello "+name);
		
		do {
			System.out.print("Enter your age: ");
			age = scanner.nextLine();
		} while(age.isBlank());
		
		System.out.println("You are " + age + " years old.");

	}

}
