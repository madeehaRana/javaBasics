package com.syntax.class13;

public class Car {

	//define car features in a from of varibales
	String make;
	String model;
	String color;
	int year; 
	int speed;
	public static void main(String[] args) {
		System.out.println("Hello, I am from main method");
		
		Car c1 = new Car();
		c1.make="Toyota";
		c1.model="Camry";
		c1.color="Yellow";
		c1.year=2020;
		c1.speed=180;
		
		c1.drive();
		c1.reverse();
		c1.transportPeople();
		
		
		
	}
	//define behavior in a form of method
	void drive() {
		System.out.println(make+" can drive");
	}
	
	void reverse() {
		System.out.println(make+ " can reverse");
	}
	
	void transportPeople() {
		System.out.println(make+ " can transport people");
	}
	
}
