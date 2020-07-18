package com.syntax.class18;

public class Employee {
int eID;
double salary;

static String CEO="Sumair";


void bio(){
	System.out.println("Employee eID# "+eID+" salary $"+salary+" "+ CEO);


}
static void sayHelloToCeo() {
	System.out.println("Hi "+CEO);
}


}



