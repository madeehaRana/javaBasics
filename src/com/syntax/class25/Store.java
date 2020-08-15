package com.syntax.class25;

public class Store {
	String name, location;
	
	public Store(String name, String location) {
		this.name=name;
		this.location=location;
		
	}
	
	public void openHours() {
		System.out.println("Stores are open form 8Am - 8PM");
	}
	public void sell() {
		System.out.println("Stores sale items");
	}

}
class Macys extends Store{
	public Macys(String name, String location) {
		super(name, location);
	}
	
	public void openHours() {
		System.out.println(name+" is open from 8AM=12AM");
	}
}
class Starbucks extends Store{
	public Starbucks(String name, String location) {
		super(name, location);
	}
	
	public void openHours() {
		System.out.println(name+" is open everyday from 6AM -8PM");
	}
	
	public void sellDrinks() {
		System.out.println(name+ " sells different types of drinks");
	}
}

class Nike extends Store{
	
	String shoes;
	public Nike(String name, String location, String shoes) {
		super(name, location);
		this.shoes=shoes;
	}
}