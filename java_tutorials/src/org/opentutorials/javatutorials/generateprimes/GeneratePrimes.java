package org.opentutorials.javatutorials.generateprimes;

import java.util.Scanner;

public class GeneratePrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num; 
		System.out.print("Prime generator: enter your number: ");
		num = scanner.nextInt();
		
		for(int n: generatePrimes(num)) {
			System.out.println(n);	
		}
		
		
		scanner.close();
	}
	public static int[] generatePrimes(int maxValue)
	{
		if (maxValue >= 2) {
			
			// declaration
			int s = maxValue + 1;	// size of array
			boolean[] f = new boolean[s];
			int i;
			
			// initializing array value to true
			for (i=0; i<s; i++) {
				f[i] = true;
			}
			
			// set `known` values to false 
			f[0] = f[1] = false;
			
			// sieve
			int j;
			for (i=2; i<Math.sqrt(s) + 1; i++) {
				if(f[i]) {
					for (j=2*i; j<s; j+=i) {
						f[j] = false;
					}
				}
			}
			
			// number of prime numbers?
			int count = 0;
			
			for (i=0; i<s; i++){
				if (f[i]) {
					count++; // increment count
				}
			}
			
			int[] primes = new int[count];
			
			for (i=0, j=0; i<s; i++) {
				if(f[i]) {
					primes[j++] = i;
				}
			}
			
			return primes;	// return primes
		} else {
			return new int[0];	// return empty array for invalid input
		}	
	}
}
