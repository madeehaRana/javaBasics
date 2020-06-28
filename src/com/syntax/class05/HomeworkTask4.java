package com.syntax.class05;

import java.util.Scanner;

public class HomeworkTask4 {
public static void main(String [] args) {
	/*
	 * Write a program to find largest number among three
	 * numbers using nested if provided by a user (numbers must be distinct)
	 */
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your first number");
	int num1 = scan.nextInt();
	
	System.out.println("Enter your second number");
	int num2 = scan.nextInt();
	
	System.out.println("Enter your third number");
	int num3 = scan.nextInt();
	
	if(num1>num2) {
		if (num1>num3) {
	}
			System.out.println("The largest number is the first number, number "+num1);
		}else {
			System.out.println("The largerst number is the third number, number " +num3);
		}
			 if(num2>num1) {
				if (num2>num3){
				 System.out.println("The largest number is the second one number, number " + num2);
			
				}else {
					 System.out.println("The largest number is the second one number, number " + num3);
				}
				
				String name = scan.next();
			 }
				
			
		}
}


