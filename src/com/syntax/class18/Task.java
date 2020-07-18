package com.syntax.class18;

public class Task {
/*Create a Class called Employee:
*Create three  variables  eID , salary and set the CEO to “Sumair” 
*Create two objects of the class Employee 
*Set the value of eID, salary for each of the objects
*Print out the eID , salary and  CEO for each of the objects
* 
 */
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.eID= 123456;
		obj.salary=95000;
		obj.bio();
		
		Employee obj1=new Employee();
		obj1.eID= 9876;
		obj1.salary=195000;
		obj1.bio();
		
		
	}
	
}
