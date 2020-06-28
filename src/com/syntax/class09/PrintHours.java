package com.syntax.class09;

public class PrintHours {
	public static void main(String [] args) {
		/*Let's print the clock!
		 * 0:00
		 * 0:01
		 * ...
		 * 1:00
		 * 1:01
		 * ...
		 * 23:58
		 * 23:59
		 * Hour goes from 0 to 23
		 * Minute goes from 0 to 59
		 * for (int hour = 0; hour <24; hour ++) 
		 * { for (int min =0; min<60; min++) {for (int sec =0; sec<60; sec++)  
		 * System.out.println(" time "+ hour +":" +min + ":"+ sec);
		 */
		for (int h = 0; h< 24; h++) {
			for (int m = 0; m < 60; m++) {
				
					
				if(m < 10) {
					System.out.println(h + ":0" + m);
				}else {
					System.out.println(h + ":" + m);
				}
				for (int sec =0; sec<60; sec++) {
					
				}
			}
		}
		
		}
		
		
		
		
		
		
		
	

}
