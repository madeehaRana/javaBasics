package com.syntax.class23;

 public class userInfo extends userClass {
	 
	 public String address;
	 
	 public userInfo(String name, String mobileNumber, String address) {
		 super(name,mobileNumber);
		 this.address=address;
		 
	 }
	 
	 public void userDetails() {
		 System.out.println("The user name is "+name+" and the mobile number is "+mobileNumber+" the address is "+address);
	 }

}
