package com.syntax.class06;

import java.util.Scanner;

public class SwitchExample {
public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("what month");
	String month = scan.next();
	
	String season = "Unknown";

	
	switch(month.toLowerCase()){//convert everything to lowercase
	case "January":
		season = "Winter";
		break;
	case "Febuary":
		season = "Winter";
		break;
	case "March":
		season = "Spring";
		break;
	case "April":
		season = "Spring";
		break;	
	case "May":
		season = "Spring";
		break;
	case "June":
		season = "Summer";
		break;
	case "July":
		season = "Summer";
		break;
	case "August":
		season = "Summer";
		break;
	case "September":
		season = "Summer";
		break;
	case "October":
		season = "Fall";
		break;
	case "November":
		season = "Fall";
		break;
	case "December":
		season = "Winter";
		break;
	default:
		season ="Unknown";
	}
	
	
	System.out.println("You were born in "+ season);
	
	
	
}
}
