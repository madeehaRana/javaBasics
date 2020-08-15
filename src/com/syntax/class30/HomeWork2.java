package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;



public class HomeWork2 {

	public static void main(String[] args) {
		//Create an arrayList of even numbers from 1 to 50. 
		//Remove any number that is divisible by 5 from that arrayList.
		
		ArrayList <Integer> even = new ArrayList();
		for(int i=1; i<=50; i++) {
			if(i%2==0) {
				even.add(i);
				
			}
		}
		System.out.println(even);
		Iterator <Integer> num = even.iterator();
		while(num.hasNext()) {
			int n = num.next();
			if(n %5==0) {
				num.remove();
			}
		}
		
		System.out.println("Removed numbers divisible by 5: "+even);
	}

}
