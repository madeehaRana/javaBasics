package com.syntax.class08;

import java.util.Scanner;

public class Homework01 {
	public static void main(String [] args) {
		
		/*Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the sum of 
		 * the even and odd integers.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the starting point of the range");
		int startPoint =scan.nextInt();
		
		System.out.println("Enter the ending point of the range");
		int endingPoint =scan.nextInt();
		int sumEven=0;
		int sumOdd=0;
		
		
		
		for(int i = startPoint; i<= endingPoint; i++) {
			System.out.println(i);
			if(i % 2 == 0) {
				sumEven += i;
			}
			if (i % 2 ==1 ) {
				sumOdd += i;
				
			}
			
		}
		
		System.out.println("The sum of the even numbers between "+startPoint+ "and "+endingPoint+ " is "+sumEven);
		System.out.println("The sum of the odd numbers between "+startPoint+ "and "+endingPoint+ " is "+sumOdd);
			
		
		
		
		
		
		
		
		
	}

}
