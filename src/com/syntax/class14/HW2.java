package com.syntax.class14;

public class HW2 {

	public static void main(String[] args) {
	/*Create a String and if the String is not empty perform the following: 
     *if the String has an odd number of characters and has 3 or more 
     *characters, print the character in the middle of the String.
     *Create a String and print it in reverse order (Sunday → yadnuS).
	 */

		String str="AAbAA";
		int size =str.length();
		
		if(!str.isEmpty()) {
			if(size>=3) {
				if(size %2 !=0) {
					int print =(size/2);
					System.out.println(str.charAt(print));
				}else {
					System.out.println("The string has an even num char");
				}
			}else {
				System.out.println("This string has less than 3 char");
			}
		}
		
		
	}

}
