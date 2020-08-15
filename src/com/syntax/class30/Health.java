package com.syntax.class30;

public class Health extends Insurance{
	Health(String insuranceName){
		super(insuranceName);
	}
	public void getQuote() {
		System.out.println("Get quote for your insurance with "+insuranceName);
	}
	public void cancelInsurance() {
		System.out.println("You can cancel policy with "+insuranceName+" at any time");
	}
}
