package com.syntax.class05;

public class HomeworkTask1 {
	/*1.Write a program that will read three inputs of scores 
	 * (quiz, mid term, and final scores) and determine the grade based
	 *  on the following rules: 
	 *  ●if the average score >=90 →grade=A
	 *  ●if the average score >= 70 and <90 →grade=B
	 *  ●if the average score>=50 and <70 →grade=C
	 *  ●if the average score<50 →grade=F
	 */
public static void main(String [] args) {
	int quiz = 90;
	int midTerm = 85;
	int finalScores = 95;
	int averageScore = (quiz + midTerm + finalScores) / 3;
	
	if (averageScore >= 90) {
		System.out.println("grade = A");
	}else if(averageScore >= 70 && averageScore <= 90) {
		System.out.println("grade = B");
	}else if(averageScore >= 50 && averageScore <= 70) {
		System.out.println("grade C");
	}else if(averageScore > 50) {
		System.out.println("grade = F");
	}
	
	
}
}
