package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;




public class TestHomework3 {

	public static void main(String[] args) {
		ArrayList <Insurance> obj = new ArrayList();
		obj.add(new Car("Geico","Lexus"));
		obj.add(new Pet("GEHA","Cat"));
		obj.add(new Health("BlueCross"));
		
		System.out.println("-------For Loop--------");
		for(int i=0; i<obj.size(); i++) {
			obj.get(i).getQuote();
			obj.get(i).cancelInsurance();
		}
		System.out.println("------Enhanced Loop------");
		
		for(Insurance in:obj) {
			in.getQuote();
			in.cancelInsurance();
			
		}
		
		System.out.println("-------Iterator---------");
		Iterator <Insurance> it = obj.iterator(); 
		while(it.hasNext()) {
			Insurance in =it.next();
			in.getQuote();
			in.cancelInsurance();
		}

	}

}
