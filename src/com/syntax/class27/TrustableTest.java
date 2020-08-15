package com.syntax.class27;

public class TrustableTest {

	public static void main(String[] args) {
		Bank b = new BOA();
		b.trust();
		b.deposit();
		b.withdraw();
		
		Bank p = new PNC();
		p.deposit();
		p.withdraw();
		p.trust();
		
		Investments i = new PNC();
		i.doInvestments();
		
		Mortgage m = new PNC();
		m.giveMortgage();
		

	}

}
