package com.syntax.class01;

public class PracticeVariables {
	
	public static void main (String []args) {
		/*Create a Java Program (class) and name it PracticeVariables.
		 * create variables for all 8 primitive Data Types (byte, short, int, long, 
		 *float, double, char, boolean). i want you to print out 
		 *each variable on a separate line and test its number range (capacity). 
		 */
		byte num1 = -128;
		byte num11 = 127;
		System.out.println(num11);
		
		short num2 = -32768;
		short num22= 32767;
		System.out.println(num2);
		
		int num3 = -2147483648;
		int num33 = 2147483647;
		System.out.println(num3);
		
		long num4 = -9223372036854775808l;
		long num44 = 9223372036854775807l;
		System.out.println(num4);
		
		float num5 = 92837492874927f;
		System.out.println(num5);
		
		double num6 = 34.4;
		System.out.println(num6);
		
		char num7 = 'A';
		System.out.println(num7);
		
		boolean num8 = false; 
		System.out.println(num8);
		
	}

}
