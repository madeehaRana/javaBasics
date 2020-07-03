package com.syntax.class15;

public class Hw {

	public static void main(String[] args) {
		//How would you reverse a String character by character?
		String str="Reverse";
		
		System.out.println("String character :"+str);
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
			
		}
		System.out.println();
		
		//How would you reverse a String word by word?
		
		String wBw ="This Java class is driving me crazy";
		
		String []arr= wBw.split(" ");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		
		//How would you swap  2 strings without a temporary variable?
		
		String str1="Good";
		String str2="Day";
		
		str1=str1.concat(str2);
		str2=str1.concat(str2).replace(str2, "");
		str1=str1.concat(str2).replace(str2, "");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("How would you check if String is palindrome or not?");
		String orWord="mom";
		String rev="";
		
		for(int i=orWord.length()-1; i>=0; i--) {
			rev=rev+orWord.charAt(i);
		}
		
		if(orWord.equals(rev)) {
			System.out.println(orWord+" The word is palindrome.");
		}else {
			System.out.println(orWord+" The word is not palindrome");
		}
		
		
		
		
		
		
	}

}
