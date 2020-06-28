package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		/*1.Create an array of chars and store grades into it: A,B,C,D,E,F.
		 *  Then print a grade B (use 2 different ways of creating an array).
		 * 
		 */
		char [] grades = {'A','B', 'C', 'D', 'E', 'F'};
		System.out.println(grades[1]);
		
		char [] grade = new char [6];
		grade [0] = 'A';
		grade [1] = 'B';
		grade [2] = 'C';
		grade [3] = 'D';
		grade [4] = 'E';
		grade [5] = 'F';
		System.out.println(grade[0]);
		
		
		/*.Create an array of names and store all names of your group. 
		 * Then print your name from that array.
		 * (use 2 different ways of creating an array). 
		 */
		
		String [] names = {"Bob", "John", "Kim", "Brian", "Chelsi"};
		System.out.println(names[2]);
		
		String [] name = new String [5];
		name [0] = "Bob";
		name [1] = "John";
		name [2] = "Kim";
		name [3] = "Brian";
		name [4] = "Chelsi";
		
		System.out.println(name[1]);
		
		/*Create an array of words: Java, Saturday, day, coding, is. 
		 * Print the following sentence using elements of array: 
		 * “Saturday is Java coding Day”.
		 */
		
		String [] words = {"Java", "Saturday", "day", "coding", "is"};
		String total = (String) (words[1]+ " " + words[4]+" "+ words[0]+" " +words[3]+" "+ words[2]);
		System.out.println(total);
		System.out.println(words[1]+ " " + words[4]+" "+ words[0]+" " +words[3]+" "+ words[2]);
		
		
		
		
		
	}

}
