package com.syntax.class21;

public class Student {
/*Write a Student class   that have instance variables name and address. 
 * Create a constructor that will initialize those variables. Print 
 * name & address of given  student using displayInfo method.
 */
	String name;
	String address;
	
	
	public Student(String name, String address) {
		this.name=name;
		this.address=address;
		
	}
	
	public void displayInfo() {
		System.out.println("The student name is "+name+ " and the address is "+address);
	}
	public static void main(String [] args) {
		Student obj = new Student("Madeeha","8165 Gilroy Dr");
		obj.displayInfo();
	}
}
