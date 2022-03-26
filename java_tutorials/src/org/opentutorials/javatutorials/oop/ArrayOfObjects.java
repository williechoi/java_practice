package org.opentutorials.javatutorials.oop;

public class ArrayOfObjects {

	public static void main(String[] args) {
		
		Food[] refrigerator = new Food[3];
		
		Food food1 = new Food("pizza");
		Food food2 = new Food("hamburger");
		Food food3 = new Food("hotdog");
		
		refrigerator[0] = food1;
		refrigerator[1] = food2;
		refrigerator[2] = food3;
		
		System.out.println(refrigerator[0].name);
		System.out.println(refrigerator[1].name);
		System.out.println(refrigerator[2].name);
		
		Food[] refrigerator2 = {food1, food2, food3};

		System.out.println(refrigerator2[0].name);
		System.out.println(refrigerator2[1].name);
		System.out.println(refrigerator2[2].name);
		
	}

}
