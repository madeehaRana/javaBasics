package com.syntax.class14;

public class StringMethodsCont {

	public static void main(String[] args) {
	System.out.println("---------.contains() method--------");
	String str="Good afternoon all";
	String searchValue0= "afternoon";
	
	boolean contains=str.contains("afternoon");
	System.out.println(contains);
	
	String searchValue="good";
	boolean isItThere=str.contains(searchValue);
	System.out.println(isItThere);
	
	System.out.println(str.contains("G"));
	System.out.println(str.contains("after"));
	
	System.out.println("--------.startsWith() method------");
	
	String drink="Welcome students";
	boolean starts=drink.startsWith("Welcome");
	System.out.println(starts);
	
	System.out.println("=========.endWith() method=======");
	boolean ends=drink.endsWith("a");
	System.out.println(ends);
	
	//drink.startsWith('W'); CE: we need to check if it starts with specified String, cannot be just char
	
	String srt1= "Hello Mohammad";
	String str2= "Hello Bulat";
	
	System.out.println("String "+srt1+" "+srt1.startsWith("Hello"));
	System.out.println(str2.endsWith("t"));
	
	System.out.println("----------.equals() method---------");
	String string1 ="Saturday";
	String string2 ="saturday";
	
	boolean equality= string1.contentEquals(string2);
	System.out.println(equality);
	
	boolean equalityNoCase=string1.equalsIgnoreCase(string2);
	System.out.println(equalityNoCase);

	System.out.println("----Real example-------");
	String expected="Password cannot be empty";
	String actual= "password cannot be empty";
	
	if (expected.equals(actual)) {
		System.out.println("Test pass");
		
	}else {
		System.out.println("Test fail");
	}
	
	System.out.println("----Real exp. of equalsIgnoreCare----");
	
	String expectedBrowsers="Chrome";
	
	if(expectedBrowsers.equalsIgnoreCase("Chrome")) {
		System.out.println("Test pass");
		
	}else {
		System.out.println("Test fail");
	}
	
	
	
	
	
	
	
	}

}
