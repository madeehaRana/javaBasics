package com.syntax.class04;

public class MoreNestedIF {
public static void main(String [] args) {
	
	boolean isFriday = false;
	int date = 13;
	
	if(isFriday) {
		System.out.println("It is Friday. I am going to watch a movie!");
		if(date==13) {
			System.out.println("I will watch a SCARY movie");
			
		}else {
			System.out.println("I will watch a COMEDY");
			
		}
	}else {
		System.out.println("It is NOT Friday. I am goind to study JAVA");
	}
	
}
}
