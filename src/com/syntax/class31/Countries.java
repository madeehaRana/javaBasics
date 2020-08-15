package com.syntax.class31;

import java.util.Iterator;
import java.util.Set;

import java.util.TreeSet;

public class Countries {

	public static void main(String [] args) {
		Set<String> countries = new TreeSet<>();
		countries.add("USA");
		countries.add("Canada");
		countries.add("Turkey");
		countries.add("Pakistan");
		countries.add("Australia");
		System.out.println("------first way------");
		for(String c:countries) {
			System.out.print(c+" ");
		}
		System.out.println();
		System.out.println("-----Second way------");
		Iterator<String> it = countries.iterator();
		
		while(it.hasNext()) {
			String i= it.next();
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
