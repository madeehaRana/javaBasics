package com.syntax.class07;

public class Homework {

	public static void main(String[] args) {
		
		int num=1;
		while (num <=100) {
			System.out.print(num+" ");
			num++;
		}
		System.out.println();
		System.out.println("_______Print numbers from 100 to 1____________");

	int num2=100;
	while (num2>=1) {
		System.out.println(num2);
		num2--;
	}
	
	System.out.println("Another way to do it with For loop--which is the best way");
	// print numbers form 100 to 1
	//    step 1     step 2  step 4
	for (int i=100; i >=1; i--) {
		System.out.println(i);//step 3
	}
	//print number 1, 2, 3
	for (int a = 1; a<=3; a++) {
		System.out.print(a+",");
	}
	
	
	
	
System.out.println("Print even numbers from 20 to 1 (2 ways)");
	int num3= 20;
	
	while (num3 >=1) {
		if(num3 %2 ==0) {
			System.out.print(num3 +" ");
		}
		
		num3--;
	}

	int num4=20;
	while (num4>1) {
	
		System.out.println(num4);
		num4-=2;
}
System.out.println("Print odd numbers between 20 and 50 (2 ways");

int num5=20;
while (num5<=50) {
	System.out.println(num5);
	num5 +=2;
	
}

	for (int i=20; i<=50; i++) {
		if(i%2==1) {//it's an odd number print it.
			System.out.println(i);
		
			
		}
		
	for (int o=21; i <=50; o+=2) {
		System.out.println(o);
	}
		
	}
System.out.println("2nd way");
	int num6 =20;
	while (num6<=50) {
		if (num6 %2==1) {
			System.out.println(num6);
		}
		num6++;
	}

System.out.println("----Print numbers from 5 and 1----");
	for (int j =5; j>=5; j--) {
		System.out.println(j);
	}














	}

}
