package com.syntax.class20;

public class HW {
/*Write a program  that will have 4 different access levels of constructors
 *and create 3 objects of this class: 1 - inside same class; 
 *2 - from outside the class; 3 - from different class inside different 
 *package  and observe result. 
 */
	private int secureID;
	public String employer;
	protected int salary;
	String jobTitle;
	
	HW(String company, int pay, String ocupation){
	employer=company;
	salary=pay;
	jobTitle=ocupation;
	}
	private HW(int number) {
		secureID=number;
	}
	public HW() {
		
	}
	
	public void displayInfo() {
		System.out.println("The secure ID is "+secureID+ "which is provided by the empolyer "+employer+"."+ "The average salary of "+salary+" is common for "+jobTitle);
	}
	
	
}
