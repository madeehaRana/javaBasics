package com.syntax.class08;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		/*Write a program to ask a user to enter item they want to buy and the
		 * price of that item. Every time user enters money accumulate the 
		 * amount and tell the user how much is left to pay off. If user
		 * give more money program should return a change. Whenever a user
		 * done with payments program should say "Thank you for shopping!"
		 * 
		 */

		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter item that you would like to buy.");
		String item = scan.next();
		
		System.out.println("Please enter the price of the item.");
		int price = scan.nextInt();
		
		System.out.println("Insert cash:");
		int cash = scan.nextInt();
		
		while(price > cash) {
			System.out.println("Add more money: " + (price - cash));
			System.out.println("Insert cash: ");
			int add = scan.nextInt();
			cash +=add;
		}
		if (cash == price) {
			System.out.println("Thank you for shopping!");
		}else {
			System.out.println("Here is you change "+ (cash - price));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
