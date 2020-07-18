package com.syntax.class19;

public class HW {
	//another way for Task 2 which is easier. 
	public static StringBuffer reverse(String b) {
		StringBuffer strb = new StringBuffer(b);
		return strb.reverse();
	}
	public static void main (String [] args) {
		System.out.println(reverse("Hello"));
	}
}
