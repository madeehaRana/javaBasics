package com.syntax.class20;

public class Task {
/*Write a program that will have a constructor: one with parameters 
 * and second without any parameters. Create a separate Test class where
 *  you will execute both of the constructors 1 by 1.
 * 
 */
	
	String name, lastName;
	int age;
	
	Task(){
		System.out.println("Very first constructor task");
	}
	Task(String myName, String myLastName, int myAge){
		name=myName;
		lastName= myLastName;
		age=myAge;
	}
	public void display(){
		System.out.println("My first name is "+ name+" my last name is "+lastName+" and I am "+age+" years old");
	}
	
}
