package com.syntax.class11;

public class Homework3 {

	/*Create a 2D array or integer type where you will store odd and even
	 *  numbers in 3 rows and 4 columns. Develop a program which 
	 *  will identify/print the even numbers only. 
	 */
	
	public static void main(String []args) {
		int [][] numbers = {
				{3, 6, 10 ,5},
				{16, 15, 19, 25},
				{1, 4, 3, 20}
		};
		for (int i =0; i <numbers.length; i++) {
			for (int j =0; j < numbers[i].length; j++) {
				if (numbers[i][j] %2==0) {
					System.out.print(numbers[i][j]);
				}
				System.out.println();
			}
		}
		
	}

	}


