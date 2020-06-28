package com.syntax.class07;

import java.util.Scanner;

public class MorePractice {
	public static void main(String [] args) {
		
		/*We are playing a lottery game and the lucky number is 17; We want
		 *  to keep asking the user to enter any numbers from 1-20; until 
		 *  he guesses the lucky number --> In that case we print "Congrats, you won!"
		 *	You can try to solve it with do-while or while, whichever is the best choice...
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number from 1-20 to guess the lucy number!");
		int luckyNumber = scan.nextInt();
		
		while(luckyNumber != 17) {
			System.out.println("Try again!");
			luckyNumber = scan.nextInt();
			
		}
		System.out.println("Congrats!, you won!");
	}

}
