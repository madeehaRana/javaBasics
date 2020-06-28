package com.syntax.class07;

public class WhilevsDOwhile {
	public static void main(String [] args) {
		
		//print hello 3 times
		//while checks if soup is hot, before eating
		//do while checks if soup is hot, after eating
		//with do while loop you will get burn!!!!
		int x = 1;
		while (x <= 3) { //checks before going into the loop
			System.out.println("Print Hello");
			x++;
		}
		System.out.println("--------Using a Do while Loop--------------");
		
		int y = 1;
		do {
			System.out.println("Hello");
			y++;
		}while(y <= 3);//checks after going into the loop
		
		
		
		
		
		
		
		
		
		
	}
}
