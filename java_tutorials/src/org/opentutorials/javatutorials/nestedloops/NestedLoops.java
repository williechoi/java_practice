package org.opentutorials.javatutorials.nestedloops;
import java.util.Scanner;

public class NestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns; 
		String symbol = "";
		
		System.out.println("Enter # of rows: ");
		rows = scanner.nextInt();
		
		System.out.println("Enter # of columns: ");
		columns = scanner.nextInt();
		
		System.out.println("Enter Symbol to use: ");
		symbol = scanner.next();
		
		for(int i=1; i<=rows; i++) { 		// outer for loop is in charge of rows!
			System.out.println();
			for(int j=1; j<=columns; j++) { // inner for loop is in charge of columns!
				System.out.print(symbol);
			}
		}
	}

}
