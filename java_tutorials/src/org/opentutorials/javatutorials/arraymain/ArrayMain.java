package org.opentutorials.javatutorials.arraymain;

public class ArrayMain {

	public static void main(String[] args) {

		// array = used to store multiple values in a single variable

		String[] cars = {"Tesla", "Hyundai", "Ssangyong"};
		
		cars[0] = "GM Daewoo";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		
		String[] cities = new String[3];
		
		System.out.println("==============================");
		
		cities[0] = "Seoul";
		cities[1] = "Tokyo";
		cities[2] = "Washington D.C.";
		
		for(int j=0; j<cities.length; j++) {
			System.out.println(cities[j]);
		}
	}

}
