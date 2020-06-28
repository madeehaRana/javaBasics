package com.syntax.class06;

import java.util.Scanner;

public class ClassTask {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your country");
		
		String country = scan.next();
		String language = "Unknown";
		
		switch(country) {
		case "U.S.A":
			language = "English";
			break;
		
		case "Pakistan":
			language = "Urdu";
			break;
		case "Afghanistan":
			language = "Farsi";
			break;
		case "Canada":
			language = "English";
			break;
		case "Mexico":
			language = "Spanish";
			break;
		case "Bolivia":
			language = "Spanish";
			break;
			
		case "U.K":
			language = "English";
			break;
		case "China":
			language = "Chinease";
			break;
		case "Saudia Arabia":
			language = "Arabic";
			break;
		case "Syria":
			language = "Arabic";
			break;
		default:
			language = "Unknown";
		}
	System.out.println("The language spoken in this country is "+ language);
		
		
	}

}
