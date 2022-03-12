package org.opentutorials.javatutorials.forloop;
import java.util.concurrent.TimeUnit;

public class ForLoop {

	public static void main(String[] args) {

		// for loop = executes a block of code a limited amount of times.
		
		for(int i=10; i>=0; i--) {
			System.out.println(i);
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch(Exception e) {
				System.out.println("Oops! Something went wrong!");
			}
		}
		
		System.out.println("Happy New Year!");
	}

}
