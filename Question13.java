package com.jin.problems;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*euler problem 13*/

public class Question13 {
	
	public static void main(String[] args) {
		
		//Start
		final long startTime = System.currentTimeMillis();
		
		File file = new File("C:\\Workspace\\Euler\\src\\com\\jin\\problems\\Question13");
		
		try {
			FileInputStream fis = new FileInputStream(file);
		 
			//Construct BufferedReader from InputStreamReader
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		 
			BigInteger sum =  BigInteger.ZERO;
			String line = null;
			
			while ((line = br.readLine()) != null) {
				BigInteger temp = new BigInteger(line);
				sum = sum.add(temp);
			}
			
			//End
			final long endTime = System.currentTimeMillis();
			
			System.out.println("The sum is: "+sum);
			System.out.println("Total execution time in milliseconds: " + (endTime - startTime) );
			
			br.close();
		} catch (IOException e) {
			System.out.println(e);
		} 
		
	}

}
