package com.syntax.class12;

public class ArrayRecap {

	public static void main(String[] args) {
		String [] colors = new String[3];
		colors[2]="red";
		colors[1]="yellow";
		colors[0]="blue";
		
		System.out.println(colors.length);
		
		String color=null;//will take the last color
		for(int b = 0; b<colors.length; b++) {
		color=colors[b];
			
	
		}
	System.out.println(color);
	//advanced loop
	for(String c:colors) {
		System.out.println(c);
	}
	
	}

}
