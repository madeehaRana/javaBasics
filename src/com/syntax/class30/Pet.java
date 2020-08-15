package com.syntax.class30;

public class Pet extends Insurance{
	String petType;
	
	Pet(String insuranceName, String petType){
		super(insuranceName);
		this.petType=petType;
	}
	
	public void getQuote() {
		System.out.println("Get a quote with "+insuranceName+" for your "+petType);
	}
	public void cancelInsurance() {
		System.out.println("Pet insurance can be canceled whenever for your "+petType);
	}
}