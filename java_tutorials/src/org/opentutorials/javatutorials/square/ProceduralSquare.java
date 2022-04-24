package org.opentutorials.javatutorials.square;

public class ProceduralSquare {
	public class Square {
		public Point topLeft;
		public double side;
	}
	
	public class Rectangle {
		public Point topLeft;
		public double height;
		public double width;
	}
	
	public class Circle {
		public Point center;
		public double radius;
	}
	
	public class Geometry {
		public final double PI = 3.1415926;
		
		public double area(Object shape) {
			if (shape instanceof Square) {
				Square s = (Square) shape;
				return s.side * s.side;
			}
			else if (shape instanceof Rectangle) {
				Rectangle r = (Rectangle) shape;
				return r.height * r.width;
			}
			else if (shape instanceof Circle) {
				Circle c = (Circle) shape;
				return PI * c.radius * c.radius;
			}
			else {
				return 0.0;
			}
		}
	}
}
