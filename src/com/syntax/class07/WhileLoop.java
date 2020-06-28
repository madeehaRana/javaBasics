package com.syntax.class07;

public class WhileLoop {
	public static void main(String[] args) {
		
		int time = 10;
		
		while (time <= 12) {
			// this code will excute infinitely but we fixed it by adding time++
			System.out.println("Good Morning");
			time++;
			
		}
		//while (time > 12) {
		//	System.out.println("Good morning");
		//	time++;
		
		
		

	
	//	boolean isRain= true;
		
	//	if (isRain) {
	//		 System.out.println("Take your umbrella");
	//	 }
	//	System.out.println("-----------while rain-----------");
	//	while (isRain) {
	//		System.out.println("Take umbrella");
	//		isRain = false;
	//	}
	//	System.out.println("----------------------------");
		//how to print numbers 1 -50
		
		int x = 1;
		
		while (x<=50) {
			System.out.println(x);
			x++;
		}
		System.out.println("---------------------------------");
		
		int y = 20;
		//how to print number 20 to 30?
		while (y <= 30) {
			System.out.println(y);
			y++;
		}
	System.out.println("+=========================================");	
		//how to print number from 5 to 15 at the same line?
	int z =5;
	
	while (z <= 15) {
		System.out.print(z + " ");
		z++;
	}
	System.out.println();
	System.out.println("=============================");
	
	//how to print number from 10 to 1?
	int q = 10;
	while(q >= 1) {
		System.out.println(q);
		q--;
	}
	//how to print 50 to 1
	//how to print odd number from 1 - 20
	//1, 3, 5, 7, 9, 11, 13, 15, 17, 19

	int m = 50;
	while (m >= 1) {
		System.out.println(m);
		m--;
	}
	System.out.println("_-----------------------");
	// 1 way of doing it
	int o = 1;
	
	while(o <= 20) {
		System.out.println(o);
		o +=2;
	System.out.println("__________________________");
	}
	// 2nd way of doing it
	int u = 1;
	while (x < 20) {
		if (x % 2 ==1) {
			System.out.println(u);
		}
		u++;
		System.out.println("-------------------------------");
	}
	
	// 3rd way
	
	int p =1;
	while (p<20) {
		p++;
		System.out.println(p);
		p++;
	}
	
	
	
	
	
	
	
	
}
		
		
}		
		
		
		
		
		
		
//	}


