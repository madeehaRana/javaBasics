package com.syntax.class08;

public class Patterns {

	public static void main(String[] args) {
		/*54321
		 *54321
		 *54321 
		 *54321 
		 */
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		System.out.println("-----------------------------------------");
	/*55555
	 *44444 
	 *33333 
	 *22222
	 *11111 
	 */
		
		for(int i=5; i>=1; i--) {
			for(int j=5; j>=1; j--) {
				System.out.print(i);
			}
			System.out.println();
		}
	//*
	//**
	//***
	//****
	//*****
		System.out.println("----------------------------------");
		for(int i=0; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			
			}
			System.out.println();
		}
	
	
	
	
	
	
	
	}
	

}
