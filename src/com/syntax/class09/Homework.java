package com.syntax.class09;

public class Homework {

	public static void main(String[] args) {
		/*Print the following pattern:
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */

		for(int i = 5; i >=1; i--) {
			for (int k =5; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	/*Print the following pattern:
	 * 55555
	 * 44444
	 * 33333
	 * 22222
	 * 11111 	
	 */

		for(int i = 5; i >=1; i--) {
			for (int k =5; k >= 1; k--) {
				System.out.print(i);
			}

			System.out.println();
		}
	/*Print the following pattern:
	 * *
	 * **
	 * ***
	 * ****
	 * *****
	 * 	
	 */
		for (int i = 0; i<=5; i++){
			for(int j =0; j<i; j++){
				System.out.print("*");
			
		}
			System.out.println();
		}
			
	/*Print the following pattern:
	 * 55555
	 * 4444
	 * 333
	 * 22
	 * 1	
	 */

		for (int i = 5; i >=1; i--) {
			for (int k = 0; k<i; k++) {
				System.out.print(i);
			}
		System.out.println();
		}
			
			
		
		}
			
			
			
			
		}



