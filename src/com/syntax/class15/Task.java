package com.syntax.class15;

public class Task {

	public static void main(String[] args) {
		/*Create a String that will hold a sentence.
		 *  Write a program to get a new String without any spaces. 
		 */
		
		
		String my="My name is Madeeha and I live in Va.";
		String my1=my.replace(" ", "");
		System.out.println(my1);
		
		/*Create a String that should be combination of letters, numbers 
		 * and special characters. Find out how many alpha characters are 
		 * there in the String.
		 * 
		 */
		
		String str="My &&5#8";
		int str1=str.replaceAll("[^0-9]","").length();
		System.out.println(str1);
		
		/*You have a String a=“Is it saturday? Is it raining? Do we have a 
		 * Java Class today?” How would you find out how many sentences are 
		 * in that String? 
		 */
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] array= a.split("[?]");
		int howManyElements=array.length;
		System.out.println(howManyElements);
		
	}

}
