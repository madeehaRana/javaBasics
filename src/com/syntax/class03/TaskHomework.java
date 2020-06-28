package com.syntax.class03;

public class TaskHomework {

	public static void main(String[] args) {
		
		int month = 4;
		
		if(month ==1) {
			System.out.println("The month is January");
		   }else if(month == 2) {
			   System.out.println("The month is Febuary");
		}else if(month == 3) {
			System.out.println("The month is March");
		}else if(month == 4) {
			System.out.println("The month is April");
		}else if(month == 5) {
			System.out.println("The month is May");
		}else if(month == 6) {
			System.out.println("The month is June");
		}else if (month == 7) {
			System.out.println("The month is July");
		}else if(month == 8) {
			System.out.println("The month is August");
		}else if (month ==9) {
			System.out.println("The month is September");
		}else if (month == 10) {
			System.out.println("The month is October");
		}else if (month == 11) {
			System.out.println("The month is November");
		}else if (month == 12) {
			System.out.println("The month is December");
		}else {
			System.out.println("Your entry is incorrect");
		}
		
	
		
		
	
		
		
		
		
		
		// 2. Write a program to check whether number is positive or negative.
	
	int num2 = -5;
	
	if(num2 > 0) {
		System.out.println("The number is positive");
	}else if(num2 < 0) {
		System.out.println("The number is negative");
	}else {
		System.out.println("Number is zero");
	}
	
	
	
	// 3. Write a Java Program to check whether number is Even or Odd.
	
	int num3= 4;
	
	
	if(num3 %2 == 0) {
		System.out.println("The number is even");
		
	}else {
		System.out.println("The number is odd");
	}
	//Another way to check if the number is odd or even
	int num13= 12;
	int remainder = num13 % 2;
	if (remainder ==0) {
		System.out.println(num13+"is even!");
		
	}else {
		System.out.println(num13+"is odd!");
		
	}
	
	
	}
	
	
	
}
