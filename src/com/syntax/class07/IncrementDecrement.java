package com.syntax.class07;

public class IncrementDecrement {
	
	public static void main(String [] args) {
		
		int x = 10;
		x = x + 1;
		x += 1;
		// another way to add 1 into the VARIABLE	
		x++;
		//3++; //-----> can't be done compiler error
		//3--; //------> compile error
		System.out.println(x);
		int y = 50;
		y = y -1;
		y -= 1;
		y--;
		System.out.println(y);
		//x++; post increment
		//++x; pre increment
		
		int z =5;
		//System.out.println(z++);
		if (++z == 6) {
			System.out.println("Hi there");
		}
		int k = 10;
		if (k++ == 11) {
			System.out.println("nail was here");
		}
		System.out.println(k);
	
	int m =5;
	//m++2; complie error, can not increment by 2 only 1
	
	
	}
	
	
	

}
