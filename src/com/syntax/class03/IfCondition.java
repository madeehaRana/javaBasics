package com.syntax.class03;

public class IfCondition {
	public static void main(String [] args) {
		//Declare a number and compare if the number is larger than100
		//If it is larger than 100, I will print---> My number is large
		
		
	int num = 178;
	boolean result = num > 100;
	System.out.println(result);
	System.out.println("Let us check");
	
	if(num > 100) {
		
		System.out.println("My number is large");
		
	}else {
		System.out.println("My number is small");
		
	}
	   System.out.println("The check is complete");
	   
	   
	System.out.println("_---------------------");
	
	int expectedHours = 15;
	int actualHours = 20;
	
	if(actualHours >= expectedHours) {
		System.out.println("YOu will love Java");
		
	}else {
		System.out.println("YOU will NOT love java");
		
	}
	   
	System.out.println("________________________________");
	
	double budget = 10000;
	double carPrice = 15000;
	
	if (budget > carPrice) {  //I will buy only if I have more money
		System.out.println("I will buy this");
		System.out.println("I am happy");
		
	}else { //otherwise
		System.out.println("I will not buy this car");
		System.out.println("I will study Java");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
