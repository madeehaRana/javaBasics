package com.syntax.class11;

public class RetrievingValuesFromTwoDArrays {

	public static void main(String[] args) {
		String [][]months = 
				{{"December", "January", "February","March"},
				{"April", "May","June", "July"},
				{"August","September", "October", "November"}};
		
		
	
	int seasons = months.length;//how many arrays are inside, how many rows?
	System.out.println(seasons + "rows");
	
	int winterLength = months[0].length; //how many elements/col are in row with index 0
	System.out.println(winterLength + "months in row with index 0");
	


	
	//Nested loops
	for (int i = 0; i < months.length; i++) { //iterating over rows
		for (int j=0; j < months[i].length;j++) { // iterating over columns
			
			System.out.println(months[i][j]);
			
		}
	}
	
	
	
	
	
	}
	
	

}
