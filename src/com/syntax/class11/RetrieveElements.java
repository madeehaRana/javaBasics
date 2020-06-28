package com.syntax.class11;

public class RetrieveElements {

	public static void main(String[] args) {
		// 1st way
		char [] grades = {'A', 'B', 'C', 'D', 'F'};
		
		for (int i = 0; i <= 4; i++) {
			System.out.println(grades[i]);
		}
		// 2nd way
		char [] grades2 = {'A', 'B', 'C', 'D', 'F'};
		
		for (int i = 0; i < grades2.length; i++) {
			System.out.print(grades2[i]+",");
		}
		
	System.out.println();
		System.out.println("--Print using advanced/enhanced, for each loop----");
		
		for (char element : grades) {
			System.out.print(element + " ");
		}
		System.out.println("--------------------------------------");

		String [] fruits = {"Apple", "Orange", "Grapes", "Banana", "Cucumber"};
	// print all the fruits in 2 different ways
		
		for (String element : fruits) {
			System.out.print(element + ",");
		}
	System.out.println();
		System.out.println("-------------------");
		for (int f = 0; f <fruits.length; f++) {
			if(fruits[f].contentEquals("Grapes")){
				System.out.println(fruits[f]+ " Is my favorite fruit.");
				
			}else {
				System.out.println(fruits[f]);
			}

		
			System.out.println("---------");
			for (String q : fruits) {

				if (q.equals("Grapes")) {
					System.out.println(f + " is my favorite!!!");
				} else {
					System.out.println(f);
				}
		
			}	
		
	}
	
	}

	}
