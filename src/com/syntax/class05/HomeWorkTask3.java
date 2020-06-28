package com.syntax.class05;

import java.util.Scanner;

public class HomeWorkTask3 {
	public static void main(String [] args) {
	
		/* 1.Write a program to find largest of three double 
		 * values using if-else..if and logical operators provided
		 *  by a user (numbers must be distinct)
		 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter first decimal number.");
	double num1 = scan.nextDouble();
	
	System.out.println("Enter second decimal number.");
	double num2 = scan.nextDouble();
	
	System.out.println("Enter third decimal number.");
	double num3 = scan.nextDouble();
	
	if(num1>num2 && num1>num3) {
		System.out.println(num1 + "First numberis the largest number");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2 + "Second number is the largest number");
		}else if(num3>num1 && num3>num2) {
			System.out.println(num3 + "Third number is the largest");
		
		}else if(num1==num2 || num2 == num3 || num1 ==num3 ) {
			
			System.out.println("numbers must be distinct");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
