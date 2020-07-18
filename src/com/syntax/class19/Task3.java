package com.syntax.class19;

public class Task3 {
/*Create a method that will accept a String as a parameter and
 *return a new String that consist only of vowels. Method should 
 *be available inside the class where it was declared and executed by 
 *calling it is name. 
 */
	
	private String vowels(String a) {
		String vowels =a.replaceAll("[^AaEeIiOoUu]", "");
		return vowels;
	}
	public static void main (String []args) {
		Task3 obj = new Task3();
		String str=obj.vowels("Madeeha");
		System.out.println(str);
	}
}
