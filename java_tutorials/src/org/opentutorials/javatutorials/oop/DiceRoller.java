package org.opentutorials.javatutorials.oop;

import java.util.Random;

public class DiceRoller {
	
	Random random;	// global 
	int number;		// global
	
	DiceRoller() {
		random = new Random();
		roll(random, number);
	}
	void roll(Random random, int number) {
		number = random.nextInt(6)+1;
		System.out.println(number);
	}
}
