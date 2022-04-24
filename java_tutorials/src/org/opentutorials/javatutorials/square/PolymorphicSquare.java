package org.opentutorials.javatutorials.square;

public class PolymorphicSquare {
	public class Square implements Shape {
		private Point topLeft;
		private double side;
		
		public double area() {
			return side * side;
		}
	}
	
	public class Rectangle implements Shape {
		private Point topLeft;
		private double height;
		private double width;
		
		public double area() {
			return height * width;
		}
	}
	
	public class Circle implements Shape {
		private Point center;
		private double radius;
		public final double PI = 3.1415926;
		
		public double area() {
			return PI * radius * radius;
		}
	}
}
