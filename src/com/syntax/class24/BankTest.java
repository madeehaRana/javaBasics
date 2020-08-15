package com.syntax.class24;

public class BankTest {

	public static void main(String[] args) {
	BOA boa = new BOA(9000);
	double boafee=boa.chargeFee();
	System.out.println(boafee);
	
	PNC pnc = new PNC(900);
	double pncfee= pnc.chargeFee();
	System.out.println(pncfee);
	}

}
