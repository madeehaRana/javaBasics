package com.syntax.class17;

public class classTask {
/*Create a method createEmail(). Based on values of users name,
 *lastName and email type, your method should return complete email
 *Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
 * 
 * Write a method to return whether given number is prime or not?
 * 
 * Create  class Student that will have a method getGrade. Your method 
 * should accept the score of a student and return a grade:
 * score > 90 - A
 * score >80 - B
 *score >70 - C
 *score > 50 - D
 *anything else - F
*/
	public static void main(String []args) {
		classTask obj=new classTask();
		
		String answer= obj.userName("madeeha", "rana", "@gmail.com");
		System.out.println(answer);
		
		boolean isItprimeNum =obj.primeNum(90);
		System.out.println(isItprimeNum);
		
		String stu = obj.getGrade(81);
		System.out.println(stu);
		
		
	}
	String getGrade(int a) {
		String grade;
		if(a > 90) {
			grade="A";
			}else if(a >= 80 && a <= 90) {
				grade = "B";
			}else if(a >= 70 && a <= 80) {
				grade ="C";
			}else if(a >= 50 && a <= 60) {
				grade ="D";
				
			}else {
				grade="F";
			}
	
		return grade;	
	
	}
	
	boolean primeNum (int a) {
		boolean prime=true;
		if(a >1) {
			for(int i =2; i <=a / i; i++){
				if (a % i==0) {
					prime=false;
					break;
				}
			}
		}else {
			prime=false;
		
		}
		return prime;
	}

	
	String userName(String firstName, String lastName, String mailType) {
		String mail= firstName + lastName +"@" +mailType + ".com";
		return mail.toLowerCase();
	}
}
