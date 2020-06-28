package com.syntax.class02;

public class Variables {

	public static void main (String[] args) {
		String name = "Madeeha";
		String lastName = "Rizwan";
		char grade = 'A';
		String city= "Lorton";
		String state = "Virginia";
		String phoneNumber= "703-989-3492";
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		
		city= "Springfield";
		state= "Florida";
		phoneNumber = "703-989-6547";
		grade = 'B';
		
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);
		System.out.println(grade);
		
		//Task
		
		System.out.println("My name is "+ name + " and my last name is "+lastName);
		System.out.println("I live in city of "+city + " state "+state+" and my phonenumber is "+phoneNumber+ " !");
		
	}
}
