package com.syntax.class23;

public class Circle extends Shape {
	public Circle(double radius) {
		super(radius);
	}
	
	public void calculateArea() {
		
		System.out.println("The area of the circle is: "+3.14*(radius*radius));
	}
	
}
