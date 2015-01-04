package com.jin.problems;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*euler problem 11*/

public class Question11 {

	private static List<Integer[]> loadArray(File fin) throws IOException {
		
		FileInputStream fis = new FileInputStream(fin);
		List<Integer[]> intArray = new ArrayList<Integer[]>();
	 
		//Construct BufferedReader from InputStreamReader
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
	 
		String line = null;
		while ((line = br.readLine()) != null) {
			String [] stringArray = line.split(" ");
			Integer [] intRow = new Integer [stringArray.length];
			
			for (int i = 0; i < stringArray.length; i ++) {
				intRow[i] = Integer.parseInt(stringArray[i]);
			}
			
			intArray.add(intRow);
			
		}
		br.close();
		return intArray;
	}
	 
	private static int getMaxAdj (List<Integer[]> intArray) {
		int max = 1;
		int temp = 1;
		
		//Horizontal
		for (int i = 0; i < intArray.size(); i++){
			for (int j = 0; j < (intArray.get(i).length - 4); j++){
				for (int k = 0; k < 4; k++){
					temp *= intArray.get(i)[j+k];
				}
				max = Math.max(temp,max);
				temp = 1;
			}
		}
		
		//Vertical
		for (int j = 0; j < intArray.get(0).length; j++) {
			for (int i = 0; i < (intArray.size() - 4); i++){
				for (int k = 0; k < 4; k++){
					temp *= intArray.get(i+k)[j];
				}
				max = Math.max(temp, max);
				temp = 1;
			}
		}
		
		//Diagonal top left to bottom right
		for (int i = 0; i < (intArray.size() - 4); i++){
			for (int j = 0; j < (intArray.get(i).length - 4); j++){
				for (int k = 0; k < 4; k++){
					temp *= intArray.get(i+k)[j+k];
				}
				max = Math.max(temp,max);
				temp = 1;
			}
		}
		
		//Diagonal top right to bottom left
		for (int i = 0; i < (intArray.size() - 4); i++){
			for (int j = (intArray.size() - 1); j > 2; j--){
				for (int k = 0; k < 4; k++){
					temp *=  intArray.get(i+k)[j-k];
				}
				max = Math.max(temp, max);
				temp = 1;
			}
			
		}
		
		return max;
	}

	
	public static void main(String[] args) {
		File file = new File("C:\\Workspace\\Euler\\src\\com\\jin\\problems\\Question11");
		try {
			List<Integer[]> intArray = loadArray(file);
			System.out.println("The max product of any four adjacent numbers is "+getMaxAdj (intArray)+".");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	   

}
