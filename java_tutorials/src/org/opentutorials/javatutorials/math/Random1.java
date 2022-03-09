package org.opentutorials.javatutorials.math;
import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int x = random.nextInt(6) + 1;		// random variable between 1 and 6
		double y = random.nextDouble(); 	// random variable between 0 and 1
		boolean z = random.nextBoolean();	// true or false
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		

	}

}
