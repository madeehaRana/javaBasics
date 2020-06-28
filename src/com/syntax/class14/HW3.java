package com.syntax.class14;

public class HW3 {

	public static void main(String[] args) {
		
		String day="Sunday";
		String newString="";
		
		for (int i = day.length()-1;i>=0;i--) {
			
			newString=newString+day.charAt(i);
			//newString+=letters;
		}
		System.out.println(newString);
		
		String day2="Sunday";
		//String===>char--->sorry cannot call String method because you are not a string
		//day.CharAt(1).toUpperCase();
		
				//String--->String--->char
		char letter=day.toUpperCase().charAt(1);
		int lengthOfNewDay=day.substring(3).toUpperCase().length();
		System.out.println(lengthOfNewDay);
	}

}
