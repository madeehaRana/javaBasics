package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
	/* 12345
	 * 12345
	 * 12345
	 * 
	 * how many rows? 3
	 */
		for(int i = 1; i <= 3; i++) {
			//how many columns? 5
			for (int j =1; j<=5; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		/* 11111
		 * 22222
		 * 33333
		 * 44444
		 * 
		 */
		for (int row = 1; row <= 4; row++) {
			for (int col = 1; col <= 2; col++) {
				System.out.println(row);
				
			}
			System.out.println();
		}
		
		
		
		
	}

}
