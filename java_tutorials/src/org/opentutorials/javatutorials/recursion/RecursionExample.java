package org.opentutorials.javatutorials.recursion;

public class RecursionExample {
	public static int add (int a, int b) {
		return a + b;
	}
	
	/// N! = N x (N-1) x (N-2) x ... x 2 x 1
	public static int factorial(int n) {
		if(n <= 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = add(23, 10);
		System.out.println(sum);
		System.out.println(factorial(5));
	}

}
