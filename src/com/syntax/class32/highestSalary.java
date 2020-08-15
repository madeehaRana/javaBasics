package com.syntax.class32;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class highestSalary {

	public static void main(String[] args) {
		/*Create a Map that will store Employee name and salary. 
		 *Write a logic to retrieve an employee who gets the highest salary.
		 *Output should be in the below format
		 *John Smith=$100000 
		 */
		
		Map<String,Integer> salary = new LinkedHashMap<>();
		
		salary.put("Madeeha", 250000);
		salary.put("Price",500000);
		salary.put("Karen", 50000);
		salary.put("Julie", 170000);
		salary.put("De", 45000);
		
		Set<Entry<String,Integer>> high = salary.entrySet();
		
		int largest=0;
		String name="";
		
		for(Entry<String,Integer> entry:high) {
			if(entry.getValue()>largest) {
				largest=entry.getValue();
				name=entry.getKey();
			}
		}
		
		System.out.println(name +"=$"+largest);
		

	}

}
