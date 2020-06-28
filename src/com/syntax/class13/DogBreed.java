package com.syntax.class13;

public class DogBreed {

	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.breed="Husky";
		dog1.color="Black";
		dog1.age=5;
		System.out.println("The breed of the 1st dog is "+dog1.breed+
				" and the color is "+dog1.color+" and is "+dog1.age+" year old");
			
		dog1.doTricks();
		dog1.intelligence();
		dog1.peopleFriendly();
		
		
		Dog dog2 = new Dog();
		dog2.breed="Bulldog";
		dog2.color="White";
		dog2.age=8;
		
		System.out.println("The breed of the 2nd dog is "+dog2.breed+
				" and the color is "+dog2.color+" and is "+dog2.age+" year old");
	
	
		dog2.doTricks();
		dog2.intelligence();
		dog2.peopleFriendly();
	
		Dog dog3 = new Dog();
		dog3.breed = "Labrador";
		dog3.color= "Gray";
		dog3.age= 1;
		
		System.out.println("The breed of the 3rd dog is "+dog3.breed+
				" and the color is "+dog3.color+" and is "+dog3.age+" year old");
	
		dog3.doTricks();
		dog3.intelligence();
		dog3.peopleFriendly();
	
	}

}
