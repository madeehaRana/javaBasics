package com.syntax.class23;

public class overload {
/*Create 1 class with a static method that has 3 overloaded forms. 
 *Then call each overloaded method with specific arguments and observe result. 
 */
	
	static void pandemic() {
		System.out.println("Pandemic COVID-19 has turned the world upside down.");
	}
	
	static void pandemic(String place) {
		System.out.println("Pandemic COVID-19 has turned the world upside down. Which first emerged in " +place);
	}
	
	static void pandemic(String place, String year) {
		System.out.println("Pandemic COVID-19 has turned the world upside down. Which first emerged in " +place+ " and in the year "+year);
		
	}
	public static void main(String [] args) {
		overload obj = new overload();
		obj.pandemic();
		obj.pandemic("China");
		obj.pandemic("China", "2020");
		
	}
}
