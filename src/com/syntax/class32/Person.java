package com.syntax.class32;

public class Person {
	private String name, lastName;
	private int age;
	double salary;
	
	Person(String name, String lastName, int age, double salary){
		this.name=name;
		this.lastName=lastName;
		this.age=age;
		this.salary=salary;
	}
	
	void displayInfo() {
		System.out.println(name+" "+lastName+" "+age+ " "+salary);
	}
		
		
		
	
}
