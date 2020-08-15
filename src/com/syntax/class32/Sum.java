package com.syntax.class32;

import java.util.Collection;
import java.util.LinkedList;

public class Sum {
/*Create a collection of integers in which you can keep duplicates. 
 *Write a logic to find sum of all integers 
 */
	public static void main(String[] args) {
	
		Collection<Integer> sum = new LinkedList<>();
		
		sum.add(15);
		sum.add(90);
		sum.add(55);
		sum.add(10);
		sum.add(20);
		sum.add(30);
		
	int count =0;
	
	for(Integer num:sum) {
		count+=num;
	}
		System.out.println("Sum of all number is "+count);
		
		
		

	}

}
