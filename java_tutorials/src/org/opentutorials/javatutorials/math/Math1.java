package org.opentutorials.javatutorials.math;
import java.util.Scanner;

public class Math1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double PI = 3.14;
		double y = -10;
		
		double z = Math.max(PI, y);
		
		System.out.println(z);
		
		double absy = Math.abs(y);
		
		System.out.println(absy);
		
		double sqrtPI = Math.sqrt(PI);
		
		System.out.println(sqrtPI);
		
		double triangle_x;
		double triangle_y;
		double triangle_z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		triangle_x = scanner.nextDouble();
		
		System.out.println("Enter side y: ");
		triangle_y = scanner.nextDouble();
		
		triangle_z = Math.sqrt((triangle_x*triangle_x) + (triangle_y*triangle_y));
		
		System.out.println("The hypotenuse is: " + triangle_z);
		
		scanner.close();
	}

}
