package com.syntax.class04;

import java.util.Scanner;

public class HomeWorkTask5byInst {
	public class HomeWorkTask5 {
		public static void main(String []args) {
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("How many years have you worked with the company?");
			int years= scan.nextInt();
			
			
			
			if (years>=5) {
				System.out.println("You are eligible for the bonus!");
				
				System.out.println("Please enter your annual salary?");
				double salary = scan.nextDouble();
				if(salary > 50000) {
					System.out.println("your bonus is 5000");
				}else {
					System.out.println("Your bonus is 3000");
				}
				
			}else {
				System.out.println("You are not eligible");
				
			}
		}		
			
		}
}
