package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		//we want to ask user's name
		//5 times and print Good Afternoon _____ 5 times
		Scanner scan = new Scanner(System.in);
		
		int num = 1;
		do {
			System.out.println("Please enter your name:");
			String name = scan.nextLine();
			
			System.out.println("Good Afternoon " + name);
			num++;
		
		}while (num <=5);
		
		int num2 = 1;
		while (num2 <= 5);
		System.out.println("Please enter your name:");
		String name = scan.nextLine();
		
		System.out.println("Good Afternoon " + name);
		num++;
			
		}
		}


