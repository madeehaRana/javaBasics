package com.syntax.class03;

public class RelationOperator {
	public static void main(String [] args) {
		
		int a = 7;
		int b = 10;
		
		System.out.println(3>4);// false
		System.out.println(a>b); //true
		System.out.println(a ==b); // false
		System.out.println(a != b); //true
		
		System.out.println("____________________________-__-");
		
		double i = 10.75;
		double j = 10.55;
		 
		boolean result1 = i > j;
		boolean result2 = i == j;
		boolean result3 = i != j;
		boolean result4 = i >= j;
		boolean result5 = i <= j;
		
		System.out.println(i>j);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}
	
	
}
