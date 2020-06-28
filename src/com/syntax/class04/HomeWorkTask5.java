package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask5 {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many years have you worked with the company?");
		int years= scan.nextInt();
		
		System.out.println("What is your annual salary?");
		int salary = scan.nextInt();
		
		if(years >= 5 && salary >50000) {
			System.out.println("You are eligible for the bonus of 50000.");
		}else {
			System.out.println("You are not eligible get bonus of 30000.");
		
			
		}
			
		}
		}
	


