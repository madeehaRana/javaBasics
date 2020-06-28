package com.syntax.class13;

public class Factory {
	public static void main(String[] args) {
	    //building an object of the car
		Car car1=new Car();
		car1.make="Tesla";
		car1.model="X";
		car1.color="Red";
		car1.year=2020;
		System.out.println("Make of 1 car is "+car1.make+
				" and model is "+car1.model+" and it is in "
				+car1.color+" color");
		System.out.println("--Accessing method from Car class using car1--");		
		car1.drive();
		car1.reverse();
		car1.transportPeople();
		
		//building an object of the car
		Car car2=new Car();
		car2.make="BMW";
		car2.model="M5";
		car2.color="Blue";
		car2.year=2018;
		car2.speed=240;
		System.out.println("Make if 2 car is "+car2.make);
		//new Bus(); compiler will give an error
		//because we never created Bus class
		
		System.out.println("--Accessing method from Car class using car2--");
		car2.drive();
		car2.reverse();
		car2.transportPeople();
		
		Car car3=new Car();
		car3.make="Lexus";
		car3.model="i250c";
		car3.color="Red";
		car3.year=2010;
		car3.speed=450;
		System.out.println("Make of 3 car is "+car3.make+
				" and model is "+car3.model+" and it is in "
				+car3.color+" color");
		
		System.out.println("--Accessing method from Car class using car3--");		
		car3.drive();
		car3.reverse();
		car3.transportPeople();
		
		Car car4=new Car();
		car4.make="BENZ";
		car4.model="i250c";
		car4.color="White";
		car4.year=2012;
		car4.speed=450;
		System.out.println("Make of 4 car is "+car4.make+
				" and model is "+car4.model+" and it is in "
				+car4.color+" color");
		System.out.println("--Accessing method from Car class using car4--");		
		car4.drive();
		car4.reverse();
		car4.transportPeople();		
		
		
}
}
