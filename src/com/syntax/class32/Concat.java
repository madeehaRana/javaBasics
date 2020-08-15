package com.syntax.class32;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Concat {

	public static void main(String[] args) {
		
			/*
			 * Create the collection that will store single uniques Objects of a String type
			 * in which order is preserved. Write a logic to concatenate all string from the
			 * collection
			 */
			
				Collection<String> unique =  new LinkedHashSet<>();
				unique.add("SDLC");
				unique.add("STLC");
				unique.add("Manual Testing");
				unique.add("Selenium");
				
				String concat = "";
				
				for (String name : unique) {
					concat=concat+ name + " ";
				}
				System.out.println(concat);
			}
		}
	


