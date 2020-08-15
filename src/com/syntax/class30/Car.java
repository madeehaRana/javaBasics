package com.syntax.class30;

public class Car extends Insurance{
	String carModel;
	Car(String insuranceName, String carModel){
		super(insuranceName);
		this.carModel=carModel;
	}
	public void getQuote() {
		System.out.println("Get a quote with"+insuranceName+" before signing up for insurance for "+carModel);
	}
	public void cancelInsurance() {
		System.out.println("Cancel insurance with "+insuranceName+" at any time for "+carModel);
	}
	
}
