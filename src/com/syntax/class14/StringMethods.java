package com.syntax.class14;

public class StringMethods {

	public static void main(String[] args) {
		
		//1 way to create a String literal--->this is the most popular way
		String name="Olga";//literal 
		
		//2 way to create String using new keyword
		String name1= new String();
		name1= "Olga";
		
		System.out.println(name);
		System.out.println(name1);
		System.out.println("-----------.length() method--------");
		//methods of String class
		String school="Syntax";
		//tells how many characters are in the String
		int size=school.length();
		System.out.println("The length of the String is = "+size);
		
		String greetings="Hello Syntax";
		int sizeofDifferentString=greetings.length();
		System.out.println(sizeofDifferentString);
		
		System.out.println("------------.toUpperCase() method----------");
		
		String city ="Washington DC";
		String newCity=city.toUpperCase();
		System.out.println(newCity);
		
		System.out.println("------------.toLowerCase() method-----");
		
		String lowerCaseString=newCity.toLowerCase();
		System.out.println(lowerCaseString);
		
		System.out.println("----------.concat() method--------" );
		String country ="USA";
		String capital ="washington DC";
		
		//+ with Strings serves as concatenation operator
		//+ with numbers serves as arithmetic operator
		System.out.println(country+capital);
		
		System.out.println(country.concat(capital));//will work only if both values are of String type
		
		int day = 27;
		String month = "June";
		System.out.println(day+month);
		
		//System.out.println(month.concat(day)); cannot use because both values must be string
		
		//System.out.println(day.concat(month)); CE: day is an int type and it does not have an access to String method
		
	System.out.println("---------.isEmpty()method--------");
		//if length of the String is =0 ---> then it is Empty
		String str="Hello";
		boolean isEmpty=str.isEmpty();
		
		String str1="";
		System.out.println(str1.isEmpty());
		System.out.println(isEmpty);
		
	System.out.println("---------.trim() method---------");
		//Only trim space before and after the string but NOT inside or in the middle.
		String cat="Jessy";
		String dog="     My dog name    Charly   ";
		System.out.println("-----Before triming-------");
		System.out.println(cat);
		System.out.println(dog);
		
		System.out.println("-----After triming-------");
		
	    System.out.println(cat.trim());
		System.out.println(dog.trim());
		
		
		
		
		
	}

}
