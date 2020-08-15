package com.syntax.class23;

public class userClass {
/*Write program: userClass  that has a constructor that initializes 
 *instance variable name and mobile number. Create a subclass userInfo 
 *that will have user address variable and it also being initialized through 
 *constructor call. Print users name, mobile number and address in userDetails
 *method. Test your code.
 */
	public String name;
	public String mobileNumber;
	
	public userClass(String name, String mobileNumber) {
		this.name=name;
		this.mobileNumber = mobileNumber;
		
	}
	
}
