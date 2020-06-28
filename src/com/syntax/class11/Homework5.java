package com.syntax.class11;

public class Homework5 {

	public static void main(String[] args) {
		/*Create a 2D array of integer type with 3 rows and 4 columns
		 *  and print all values of the whole array. 
		 */

		int [][] integer = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},
		};
	for (int row = 0; row< integer.length; row++) {
		for(int col = 0; col<integer[row].length; col++) {
			System.out.print(integer[row][col]+" ");
		
	}
		System.out.println();
	}
		
		
		
	}

}
