package com.syntax.class04;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner scan = new  Scanner(System.in);
		
		System.out.println("Please tell me what is the amount of the loan which is needed?");
		
		int loanAmount = scan.nextInt();
		
		if(loanAmount <= 200000) {
			System.out.println("I would lend the money.");
				}else{
					System.out.println("The loan will be rejected.");
					
				}
	System.out.println("______________________________________________________");
	
	
		
		
	}
}
