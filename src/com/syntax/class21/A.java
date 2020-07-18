package com.syntax.class21;

public class A {
/*Write program for multilevel inheritance where class A inherited
 *by B and class B inherit class by C. 
 *
 *Write program to inherit class A that has method printF 
 *which is static and call or reuse that method into class B
 */
	String mom;
	int momAge;
	String race;
	int childAge;
	
	
	void makesFood() {
		System.out.println("Makes the most deliciouse food!");
	}
	
	void displayInfo() {
		System.out.println(mom+" is "+momAge+" years old and race is "+race+" "
				+ "and has "+childAge+" years old child");
	}
	
	public static void printF() {
		System.out.println("I am a method which is told to be static and "
				+ "call or reuse that method into class B");
	}
	
	
	
}
