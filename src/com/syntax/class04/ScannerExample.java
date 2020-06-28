package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String [] args) {
		//Caputre the name from the user and print
		//Your name is ____
		//Ask the user to enter the age as double and print
		//YOUr name is ____ and age is ___
		
		//1. We bring the Scanner Class to our program
		//System.in____> read from keyboard/console
		
		Scanner input = new Scanner(System.in);
		
		//We are instructing the user what to enter
		System.out.println("What is your full name?");
		//We are capturing the whole line into a text variable
		String name = input.nextLine();
		System.out.println("Your name is " +name);
		
		//We are instructing the user what to enter
		System.out.println("Please enter you age!");
		//We are capturing the text as double
		//IF it is not a double, then an error/exception will be printed
		double albanianAge =  input.nextDouble();
		System.out.println("Your name is "+name +" age is " + albanianAge);
		
	}

}
