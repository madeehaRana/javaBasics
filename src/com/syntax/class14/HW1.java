package com.syntax.class14;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*Write a program that reads two people's first
		 *names and if they expecting boy or girl? 
		 *Based on the input suggests a name for a baby:
		 * Example Output:
		 *Mom’s first name? Mary
		 *Dad’s first name? Daniel
		 *Boy or Girl? boy
	   	 *Suggested baby name: DANRY    
		 */
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Mom's first name?");
		 String momName=scan.nextLine();
		 
		 System.out.println("Dad's first name?");
		 String dadName=scan.nextLine();
		 
		 System.out.println("Boy or Girl?");
		 String gender=scan.nextLine();
		 String babyName;
		
		 if(gender.toLowerCase().equals("boy")) {
			 System.out.println("Congrats,it's a boy");
			 babyName=momName.substring(0, momName.length()/2)+dadName.substring(dadName.length()/2);
			 
		 }else if(gender.equalsIgnoreCase("girl")) {
			 System.out.println("Congrats it's a girl");
			 babyName=dadName.substring(0, dadName.length()/2)+momName.substring(momName.length()/2);
			 
			 
		 }else {
			 babyName="unknown";
		 }
		System.out.println(babyName.toUpperCase());
		 scan.close();
		
	
	
		 
		 

	}

}
