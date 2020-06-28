package com.syntax.class04;

import java.util.Scanner;

public class HomeWorktask4ByInstructor {
public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean cc;
		
		System.out.println("Do you have a credit card?(True or false)");
		cc = scan.nextBoolean();
		
		if (cc) {
			System.out.println("What is your Credit Card balance?");
			double balance = scan.nextDouble();
			if(balance > 1000) {
				System.out.println("Please pay off immediately!");
			}else {
				System.out.println("You can spend more");
			}
		}else {
			System.out.println("Do you want to appy for our best Credit card?");
		}
	

}
}