package com.syntax.class11;

public class Homework4 {

	public static void main(String[] args) {
		/*Create a 2D array or integer type 
		 * and store numbers in 3 rows and 3 columns. 
		 * Print the sum of all numbers. Print sum if odd
		 */
		int [][] number = {
				{5, 6, 9},
				{8, 7, 1},
				{4, 2, 3},
		};
		int sum=0;
		for(int i = 0; i<number.length; i++) {
			for(int j=0; j<number[i].length; j++) {
				int element=number[i][j];
				if(element%2!=0) {
					sum +=element;
				}
				
					}
			
			
		}
		
		System.out.println(sum);
		
	}

}
