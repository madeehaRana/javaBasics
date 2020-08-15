package com.syntax.class30;

import java.util.ArrayList;

public class HomeWork {
	public static void main (String[] args) {
		//Create an arrayList of drinks. If any drink has
		//letter “a” or “e” replace it with water
		
		ArrayList <String> drinks = new ArrayList(); 
		drinks.add("Coke");
		drinks.add("Sprite");
		drinks.add("Pepsi");
		drinks.add("Lemonaid");
		drinks.add("Icetea");
		drinks.add("Sparking water");
		drinks.add("milk");
		
		for(int i=0; i<drinks.size(); i++) {
			if(drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
				drinks.set(i, "water");
			}
		}
		System.out.println(drinks);
	}
}
