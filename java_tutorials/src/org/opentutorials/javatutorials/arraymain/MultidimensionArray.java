package org.opentutorials.javatutorials.arraymain;

public class MultidimensionArray {

	public static void main(String[] args) {
		
		// 2D array = an array of arrays
		
		String[][] cars = new String[3][3];

		cars[0][0] = "Hyundai";
		cars[0][1] = "Kia";
		cars[0][2] = "GM Daewoo";
		
		cars[1][0] = "Toyota";
		cars[1][1] = "Honda";
		cars[1][2] = "Nissan";
		
		cars[2][0] = "BMW";
		cars[2][1] = "Mercedes";
		cars[2][2] = "Audi";
		
		for(int i=0; i<cars.length; i++) {
			
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("================================");
		
		String[][] cities = {
			{"Seoul", "Busan", "Gwangju"}, 
			{"Tokyo", "Osaka", "Nagoya"}, 
			{"Washington DC","New York", "Los Angeles"}
		};
		
		for(int i=0; i<cities.length; i++) {
			
			for(int j=0; j<cities[i].length; j++) {
				System.out.print(cities[i][j] + ", ");
			}
			System.out.println();
		}
		
		
	}

}
