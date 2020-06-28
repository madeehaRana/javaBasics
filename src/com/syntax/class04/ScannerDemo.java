package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String [] args) {
		int a = 65;
		String s = "bla";
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please write some text and press enter");
		String text = scan.nextLine();
		System.out.println("__________________________");
		System.out.println(text);
		
		//int a =(int) "thirty three"; complie time error
		
		
		System.out.println("Enter age!!!");
		int age = scan.nextInt();  //if not an int run time error.
		System.out.println("The age that you entered is " + age);
		
	}

}
