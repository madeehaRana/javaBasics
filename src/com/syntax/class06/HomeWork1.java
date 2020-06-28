package com.syntax.class06;

import java.util.Scanner;

public class HomeWork1 {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What is your grade");
		String grade = scan.next();
		
		String explanation = "Unknown";
		
		switch (grade) {
		case "A":
			explanation = "A-Excellent";
			break;
		
		case "B":
			explanation = "B- Good";
			break;
		
		case "C":
			explanation = "C- Average";
			break;
		
		case "D":
			explanation = "D- Bad";
			break;
		
		default:
			explanation = "Unknown";
		
		
		
		}
		System.out.println("You entered " + grade +","+ explanation);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
