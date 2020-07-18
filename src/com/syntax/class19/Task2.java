package com.syntax.class19;

public class Task2 {
/*Create a method that will take a String as a parameter and returns
 *reversed String. Method should be available to all classes within 
 *your project and accessible by class name. 
 */
	
	public static String reverse(String a) {
		String reverseString="";
		
		for(int i=a.length()-1;i>=0;i--) {
			reverseString=reverseString+a.charAt(i);
		}
		return reverseString;
		
		
	}
	
	public static void main(String []args) {
		Task2 str = new Task2();
		String word= str.reverse("Hello");
		System.out.println(word);
		
		
	
	}
}
