package com.syntax.class25;

public class Computer {
/*Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 
*Define common behavior within and some fields in parent class and override 
*some of the methods in child classes
*Define some methods specific to child classes
*Create objects of child classes and store them into array. Loop 
*through each object and execute available methods.
* 
 */
	int cost;
	String type;
	
	public Computer(int cost, String type) {
		this.cost=cost;
		this.type=type;
	}
	
	public void smart() {
		System.out.println("Computer are smart and help with many daily task");
	}
	
	public void fun() {
		System.out.println("Computers are fun from gaming to online shopping");
	}
	
}
class Apple extends Computer{
	public Apple(int cost, String type) {
		super(cost,type);
	}
	public void smart() {
		System.out.println("Computer are smart and help with many daily task for example helping with online school");
	}
	
}
class Lenovo extends Computer{
	public Lenovo(int cost, String type) {
		super(cost,type);
	}
	
	public void smart() {
		System.out.println("Computer are smart and help with many daily task for example researches");
	}
	
}
class Hp extends Computer{
	public Hp(int cost, String type) {
		super(cost, type);
		
	}
	public void smart() {
		System.out.println("Computer are smart and help with many daily task for example watching youtube");
	}
	
}
class Dell extends Computer{
	public Dell(int cost, String type) {
		super(cost, type);
		
	}
	public void smart() {
		System.out.println("Computer are smart and help with many daily task for example building software");
	}
}