package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3 {
public static void main (String [] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter 2 numbers and a operator like +,-,*,/.");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	String operator = scan.next();
	//char operator = scan.next().charAt(0);
	int result=0;
	
	switch (operator) {
	case "+":
		result = num1 + num2;
		break;
	case "-":
		result = num1 - num2;
		break;
	case "*":
		result = num1 * num2;
		break;
	case "/":
		result = num1 / num2;
		break;
	default:
		System.out.println("invalid");
		
	}
	
	
	System.out.println("Given the two number with the operation, your result is " +result+".");
	
	
	
	
	
}
}
