package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask2 {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to DMV, what is your age?");
		
		int age = scan.nextInt();
		
		if(age >=18) {
			System.out.println("We will issue you a driver licence.");
		}else {
			System.out.println("We can offer you to get a lerners permit.");
			
		}
	}

}
