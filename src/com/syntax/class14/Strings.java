package com.syntax.class14;

public class Strings {

	public static void main(String[] args) {
		System.out.println("--------.charAt() method-----------");
		String season ="Summer";
		
		char character = season.charAt(4);
		System.out.println(character);
		
		System.out.println("-------.indexOf() method-----------");
		int index=season.indexOf('m');
		System.out.println(index);
		
		System.out.println("---------.substring() method------------");
		
		String message = "You guys are awesome";
		String newMessage=message;
		System.out.println(newMessage);
		
		String substring=message.substring(4); //take string starting form index 4
		System.out.println(substring);
		
		String middleWord=message.substring(4, 8);
		System.out.println(middleWord);
		
		
		
		
	}

}
