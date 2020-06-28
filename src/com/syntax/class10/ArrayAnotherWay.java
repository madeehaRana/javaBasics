package com.syntax.class10;

public class ArrayAnotherWay {

	public static void main(String[] args) {
		//we created an array and stored the initial values
		
		String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday"};
	
		
		//Let us print the element with 3
		System.out.println(weekdays[3]);
		
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);
		//1st way
		double [] balances = {1000, 23.50, 5540.0};
		System.out.println("Total money is "+(balances[1]+balances[2]));
		
		//2nd way
			int total1 = (int) balances[0] + (int) balances[1] + (int) balances [2];
			System.out.println("total is "+total1);
		//3rd way0
		int total2 = (int) (balances[0] + balances[1] + balances [2]);
			System.out.println("total is "+total2);
	
	//dont ever create an array with 0 elements because you can not add later
		int[] numbers1 = new int[0];
		
		int[] numbers2= {};
		numbers2[0] = 5;
		System.out.println(numbers2[0]);
		
		
		
			
			
			
			
			
			
	}
	

}
