package com.syntax.class04;

public class NestingElseIF {
public static void main(String [] args) {
	
	//if student completed the quiz we'll check the score
	//if score > 90---> A, great job!
	//if score > 80---->B, well done!
	//if score > 70----> C, Just passed!
	// otherwise---F, you failed!
	//if student didn't complete the quiz, Please finish your quiz!
	
	boolean completed = true;
	int score = 90;
	
	if(completed) {
		System.out.println("We will check the score");
		if(score>=90) {
			System.out.println("A, great job");
		}else if(score >=80) {
				System.out.println("B, well dont!");
		}else if(score >= 70) {
				System.out.println("C, just passed");
		}else {
			System.out.println("you failed");
					}
				
	}else{
		System.out.println("Please finish your quiz");
		
			
		}

	


}

}

