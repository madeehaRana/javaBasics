package com.syntax.class11;

public class Homework2 {

	public static void main(String[] args) {
		/*Create a 2D array that first row will contain 4 names and second 
		 * row will contain grades. Then you program should print 
		 * name of the students that has A and B grade 
		 */
		
		String [][]names = new String [2][4];
			//{"Madeeha","Khala","Aaban","Ammar"},
			// {"A", "B,", "C", "A"},
	names [0][0]= "Madeeha";
	names [0][1]= "Khala";
	names [0][2]= "Aaban";
	names [0][3]= "Ammar";
	names [1][0]="A";
	names [1][1]="B";
	names [1][2]="C";
	names [1][3]="A";
	
		
		

	System.out.println(names [0][0]+" has grade of "+ names[1][0]);
	System.out.println(names [0][1]+" has grade of "+ names[1][1]);
	System.out.println(names [0][2]+" has grade of "+ names[1][2]);
	System.out.println(names [0][3]+" has grade of "+ names[1][3]);
	
	}

}
