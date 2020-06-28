package com.syntax.class08;

import java.util.Scanner;

public class InClassTask {

	public static void main(String[] args) {
		//Print numbers from 1 to 50 except those that are
		//divisible by 3
		for(int i = 1; i<=50; i++) {
			if(i %3==0) {
			continue;	
			}
			System.out.println(i);
		}
		
	//Create a program that will be asking user to appy for 
	//credit card 10 times. As soon you get "yes"from user
		//program should stop asking.
		
	Scanner scan = new Scanner(System.in);
		for (int i = 1; i<=10; i++) {
			System.out.println("Do you want to apply for a credit card?");
			String answer = scan.next();
			
			if(answer.equals("yes")) {
				System.out.println("Congrats. Now you are in deblt!");
				break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
