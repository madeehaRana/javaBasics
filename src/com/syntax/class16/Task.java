package com.syntax.class16;

public class Task {

	//Create a method that will take 2 parameters
	//as a numbers and prints which number is larger.
	
	void larger(int a, int b){
		if( a >  b) {
			System.out.println(a +" is larger");
		}else {
			System.out.println(b + " is larger");
		
			
		}
	}
		///Create a method that will take a number 
			//and prints whether the number is even or odd.
		
	
	void evenOdd(int a) {
		if(a %2  ==0) {
			System.out.println(a + " is a even number");
	
	}else {
		System.out.println(a +" is odd");
	}

		//Create a method that will print whether given
		//String is palindrome or not.
		
		
				
			}
		
	void palinDrome(String word) {
			String b ="";
			for(int i=word.length()-1; i>0; i--) {
				b=b+word.charAt(i);
				}
			if(b.equals(word)) {
				System.out.println(word+" is palindrome");
			}else {
				System.out.println(word+" is not palindrome");
		
			}
			
	}
		//Create a method that will say Hello in different language 
		//based on the country that will passed when method is executed.
			
			
			void sayHello(String country) {
				switch(country) {
				case "usa":
					System.out.println("Hello");
					break;
				case "Turkey":
					System.out.println("Merhaba");
					break;
				case "Egypt":
					System.out.println("Elhen wa Sahlen");
					break;
				default:
					System.out.println("Hi");
				}
			}
			
			
			
			
	}

