package com.syntax.class10;

public class TrianglePattern {

	public static void main(String[] args) {
		//55555
		//4444
		//333
		//22
		//1
		for (int i = 5; i >=1; i--) {
			for (int k = 0; k<i; k++) {
				System.out.print(i);
			}
		System.out.println();
		//54321
		//4321
		//321
		//21
		//1
		
		}
		for(int i =5; i > 0; i--) {
			for (int k =i; k>=1; k--) {
				System.out.print(k);
			}
		System.out.println();
		
	}
	
		//1
		//21
		//321
		//4321
		
		for(int row = 1; row <=4; row++) {
			for (int col = row; col >=1; col--) {
				System.out.print(col);
			}
		System.out.println();
		}
		
		// Let us print the following triangle
				// *
				// **
				// ***
				// ****
				// *****

				for (int r = 1; r <= 5; r++) {

					for (int c = 1; c <= r; c++) {
						System.out.print("*");
					}

					System.out.println();
				}

				// Let us add the second triangle
				// ****
				// ***
				// **
				// *

				for (int r = 4; r >= 1; r--) {

					for (int c = 1; c <= r; c++) {
						System.out.print("*");
					}

					System.out.println();
				}

			}

		
		
		
		
		
	
	}		
		
		
		


