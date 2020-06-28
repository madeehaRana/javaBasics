package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Do you have a credit card? Please type yes or no.");
		String cc = scan.next();
		String yes="yes";
		String no ="no";
		
		if(cc.equalsIgnoreCase("no")) {
			System.out.println("I can offer you a credit card.");
		}
		 if(cc.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance on the card?");
			int balance = scan.nextInt();
			if(balance >1000) {
				System.out.println("Please pay off immediatley.");
			}else {
			System.out.println("You can spend more money!");
		}
		
		}
		
	}
}	
	

