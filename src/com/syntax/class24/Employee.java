package com.syntax.class24;

public class Employee {
	double salary;
	
	void getPaid() {// overriden method
		System.out.println("Employee gets paid salary = "+salary);
	}

}
class Contractor extends Employee{
	double hourlyRate;
	
	void getPaid() {//overiding method
		System.out.println("Contractor gets paid salary "+hourlyRate);
	}
}
class FulltimeEmployee extends Employee{
	
}