package com.syntax.class21;

public class TestClassABC {

	public static void main(String[] args) {
		//A class which is the parent class
		
		A obj = new A();
		obj.mom ="Ana ji";
		obj.momAge=67;
		obj.race="South Asian";
		obj.childAge=36;
		obj.displayInfo();
		obj.makesFood();
		
		
		B obj1 = new B();
		obj1.mom="Madeeha";
		obj1.momAge=36;
		obj1.race="South Asian";
		obj1.childAge=10;
		A.printF();
		
		obj1.displayInfo();
		obj1.playGames();
		
		C obj2 = new C();
		obj2.mom="Amaiya";
		obj2.momAge=27;
		obj2.race="South Asian";
		obj2.childAge=1;
		
		obj2.displayInfo();
		obj2.spoiled();
		

	}

}
