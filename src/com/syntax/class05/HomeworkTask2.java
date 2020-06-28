package com.syntax.class05;

import java.util.Scanner;

public class HomeworkTask2 {
	/* 1.Write a program for user to enter his/hers birth month. Based on the month 
	 * define the season.Example: if user is born in June, July or 
	 * August →season =”Summer”.At the end of the program we should see output as 
	 * “You were born ______”.
	 */
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter the month you were born.");
	String month = scan.next();
	String season;
	
	if(month.equalsIgnoreCase("june") || month.equalsIgnoreCase("July")|| month.equalsIgnoreCase("August")) {
		season = "summer";
		//System.out.println("Your birth month season is summer!");
		}else if(month.equalsIgnoreCase("December")|| month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Febuary")) {
			season = "winter";
			//System.out.println("Your birth month season is winter!");
		}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April")|| month.equalsIgnoreCase("May")){
			season ="spring";
			//System.out.println("Your birth month season is spring! ");
		}else if(month.equalsIgnoreCase("September")|| month.equalsIgnoreCase("October")||month.equalsIgnoreCase("November")){
			season = "fall";
			//System.out.println("Your birth month is fall!");
		}else {
			season = "unknown";
			//System.out.println("Invalid entry. Please try again.");
			
		}
		
		
			System.out.println("The season is "+ season);
		
		
		
		
		
		
		
	}
		
		
		
		
	}

