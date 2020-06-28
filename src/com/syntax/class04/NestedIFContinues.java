package com.syntax.class04;

public class NestedIFContinues {
public static void main(String [] args) {
	
	boolean allergies = false;
	boolean peanut = true;
	boolean lactose = false;
	boolean bee = true;
	boolean seafood = true;
	
		if(!allergies) {
		System.out.println("check if patient has allergies");	
		
		}else{
			System.out.println("You are healthy otherwise");
							
			}if(peanut){
				System.out.println("Don't eat peanut");
		    }if(lactose) {
			   System.out.println("Don't drink milk");
			}if(bee ) {
				 System.out.println("Don't mess with the bees");
				 
			}if(seafood) {
				 System.out.println("Dont eat seafood");
			 }
}
}
