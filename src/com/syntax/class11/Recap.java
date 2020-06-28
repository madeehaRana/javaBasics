package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		int [] grades = new int[5];
		grades [4] = 90;
		
		int size = grades.length;
		System.out.println("array size is:" + size);

		grades [4] = 90;
		grades [3] = 85;
		grades [2] = 92;
		grades [1] = 75;
		grades [0] = 100;
		
		//what is the average of the class?
		//1st way silly
		int average = (grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/size;
		System.out.println("Class average is:" + average);
		
		//2nd way best way!
		int total = 0;
		for(int k = 0; k < size; k++) {
			total += grades[k];
		}
		System.out.println("Class averge is; " + total / size);
		
		
		
		
		
		
		
		
		System.out.println("----------------------------------------------");
		
		String[] cities = {"Fairfax", "Kiev", "Tempa", "Washington", "Arlington"};
		//I live in Tampa
		System.out.println("I live in "+cities[2]);
		
		int i =1;
		System.out.println("I live in "+ cities[1]);
		
		i += 2;
		System.out.println("I moved to "+ cities[i]);
		
		int cityLength = cities.length;
		System.out.println("Total number of cities is:" + cityLength);
		
		System.out.println("The last city in the lis t is:" + cities[cityLength - 1]);
		System.out.println("---------------------------------------------");
		
		
		
		//I want to print all the cities
		for (int j = 0; j < 5; j++) {
			System.out.println(cities[j]);
		}
		
		
		
		
		
		
	}

}
