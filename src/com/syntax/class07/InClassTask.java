package com.syntax.class07;

public class InClassTask {

	public static void main(String[] args) {
		boolean workday = true;
		int day =1;
		
		while(workday) {
			if (day< 6) {
			System.out.println("I need a day off");
			day++;
			}else {
				System.out.println("I do not need a day off any more");
				workday = false;
			}
			
		}
	}

}
