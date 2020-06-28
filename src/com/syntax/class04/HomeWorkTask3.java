package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask3 {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your city?");
		String city = scan.next();
		
		System.out.println("What is the temperature in fahrenheit?");
		
		int temp = scan.nextInt();
		int tempCel =(temp-32)* 5/9;
		System.out.println("The temperature in the city "+city+" is "+tempCel+".");
		
	}

}
