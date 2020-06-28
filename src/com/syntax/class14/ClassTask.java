package com.syntax.class14;

import java.util.Scanner;

public class ClassTask {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter username.");
		String userName=scan.nextLine();
		
		System.out.println("Please enter Password");
		String password=scan.nextLine();
		
	
	   System.out.println("Please Re enter the Password");
	   String rePassword=scan.nextLine();
	if(userName.isEmpty()) {
		System.out.println("Username and Password cannot be empty");
	}
	if(rePassword.length()<8) {
		System.out.println("Password too short");
	}
	if (rePassword.equals(userName)) {
		System.out.println("Password cannot contain username.");
		}
	if (!rePassword.equalsIgnoreCase(rePassword)) {
		System.out.println("Password do not match");
	
	}else{
		System.out.println("Your username and password has been created");
	}
}

}
