package com.syntax.class11;

public class ClassTask {

	public static void main(String[] args) {
		String [] cars = {"Toyota", "Honda", "Nissan", "BMW", "Benz","Tesla"};
		
		for(int i = 0; i < cars.length; i++) {
			System.out.print(cars[i]+" ,");
			
		}
		System.out.println();
		System.out.println("----------------------------------");
		int [] integers = {5, 10, 15, 20, 25, 30};
		
		System.out.println(integers[0]+integers[1]+integers[2]+integers[3]
				+integers[4]+integers[5]);
		System.out.println("-----------------------------------");
		
		int sum=0;
		for(int num :integers) {
			sum += num;
		}
		
		System.out.println("The sum of all number is: " + sum);
		System.out.println("-----------Using Loop----------------------");
		//Using Loop
		
		int total=0;
		for(int i = 0; i<integers.length; i++) {
			int num = integers[i];
			total += num;
			
		}
		System.out.println("The total of all number is: " + total);
		
		System.out.println("---------------------------");
		
		
		
		String [] countries = {"USA", "Canada", "Pakistan", "Turkey", "Spain"};
		
			for(int i = 0; i < countries.length; i++) {
			
			if(countries[i].contentEquals("USA")){
				System.out.println(countries[i]+" :The capital is Washington D.C");
			}else if(countries[i].contentEquals("Canada")) {
				System.out.println(countries[i]+" :The capital is Ottawa");
			}else if(countries[i].contentEquals("Pakistan")) {
				System.out.println(countries[i]+" :The capital is Islamabad");
			}else if(countries[i].contentEquals("Turkey")) {
				System.out.println(countries[i]+" :The capital is Ankara");
			}else if(countries[i].contentEquals("Spain")) {
				System.out.println(countries[i]+" :The capital is Madrid");
			}else {
				System.out.println(countries[i]);
			}
		}

	}

}
