package com.syntax.class15;

public class ReplaceFuntion {

	public static void main(String[] args) {
		String me="I am a good tester. I am good person";
		
		String str="Hello";
		str=str.replace('e', 'E');
		System.out.println(str);
		
		me=me.replace(" ", "");
		System.out.println(me);
		
		me=me.replace("we", "us");//if it find it--->replace if it will not--->does nothing
		System.out.println(me);
		
		String fromApplication="Phone number is 1234567890";
		fromApplication=fromApplication.replaceAll("[A-Z]", "");
		System.out.println(fromApplication);//hone number 1234567890
		
		fromApplication=fromApplication.replaceAll("[A-Z]", "");
		System.out.println("New String value is: "+fromApplication);
		
		String another= "Hello12345";
		another=another.replaceAll("[A-Z]", "").replaceAll("[a-z]", "");
		System.out.println(another);
		
		String anotherWay ="HelloYiihkjldfkhjgld45487";
		anotherWay=anotherWay.replaceAll("[A-Za-z]", "");//45487
		
		System.out.println(anotherWay);
		
		//replacing all numbers form the String
		String mix = "Hello76588 friends 0976886";
		mix=mix.replaceAll("[0-9]","");//Hello friends
		System.out.println(mix);
		
		//replacing all special characters
		String mix1="hello ###";
		mix1= mix1.replaceAll("[^A-Za-z0-9]", "");
		
		System.out.println(mix1);
	}

}
