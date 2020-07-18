package com.syntax.class18;

public class InstanceVariables {
	String name; //instance variable
	
	public static void main(String[] args) {
		String name="Kristina"; //local variable
		System.out.println(name);
		
		//we create an Object or we instanciate a class -> InstanceVariables
		InstanceVariables obj=new InstanceVariables();
		obj.name="Jane";
		System.out.println(obj.name);//Jane
		
		//would like to change value from Kristina to Castro--> changing value of the local variable
		name="Castro";
		System.out.println(name);
		
		//would like to change Jane to Ed--->changing value of the instance variable
		obj.name="Ed";
		System.out.println("New value of instance variable "+obj.name);
	}

}
