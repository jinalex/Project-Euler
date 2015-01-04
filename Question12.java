package com.jin.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Question12 {
	
	private static ArrayList<Integer> sieveEras (int limit) {
		Boolean [] isPrime = new Boolean [limit + 1];
		ArrayList<Integer> primes = new ArrayList<Integer>();
		Arrays.fill(isPrime, Boolean.TRUE);
		
		isPrime[0] = false;
		isPrime[1] = false;
		
		//sieve
		for (int i = 0; i < isPrime.length; i++){
			if (isPrime[i]) {
				primes.add(i);
				for (int j = i; i*j <= limit; j++) {
					isPrime[i*j] = false;
				}
			}
		}
		
		return primes;
	}
	
	private static int numOfDivisors(int num) {
		
		ArrayList<Integer> primes = sieveEras(10000);
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		ArrayList<Integer> exponents = new ArrayList<Integer>();
		int x = -1;
		
		for (int i = 0; primes.get(i) < Math.sqrt(num); i++){
			if (num%primes.get(i) == 0) {
				x ++;
				int temPrime = primes.get(i);
				int divisible = num/temPrime;
				primeFactors.add(temPrime);
				exponents.add(1);
				
				while (divisible%temPrime == 0) {
					exponents.set(x, exponents.get(x)+1);
					divisible /= temPrime;
				}
			}
		}
		
		int numOfDivisors = 1;
		
		for (int i = 0; i < exponents.size(); i++) {
			numOfDivisors *= exponents.get(i)+1;
		}
		
		return numOfDivisors;
	}
	
	private static int triNumber(int term) {
		return (term*(term+1))/2;
	}
	
	public static void main(String[] args) {
		
		//Start
		final long startTime = System.currentTimeMillis();
		
		int term = 10000;
		
		do { 
			
			term++;
			System.out.println("Number of Divisors: "+numOfDivisors(triNumber(term)));
			
		} while ( numOfDivisors(triNumber(term)) < 500 );
		
		//End
		final long endTime = System.currentTimeMillis();
		
		System.out.println("The Answer: "+triNumber(term+1));
		System.out.println("The term is: "+term);
		System.out.println("Total execution time in milliseconds: " + (endTime - startTime) );
		
	}

	

}
