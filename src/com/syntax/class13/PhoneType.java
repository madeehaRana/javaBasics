package com.syntax.class13;

public class PhoneType {

	public static void main(String[] args) {
		Phone phone1 = new Phone();
		phone1.brand="iPhone";
		phone1.model="iphoneX";
		phone1.color="Blue";
		phone1.year=2019;
		phone1.memory=32;
		
		System.out.println("The 1st phone is "+phone1.brand+" the model is "
				+phone1.model+ " and the color is "+phone1.color+" and the year "
				+phone1.year+" with the memory of "+phone1.memory);
		
		
		phone1.mms();
		phone1.faceTime();
		phone1.takePictures();
		
		Phone phone2 = new Phone();
		phone2.brand="Android";
		phone2.model="S+";
		phone2.color="Pink";
		phone2.year=2020;
		phone2.memory=56;
		
		System.out.println("The 2nd phone is "+phone2.brand+" the model is "
				+phone2.model+ " and the color is "+phone2.color+" and the year "
				+phone2.year+" with the memory of "+phone2.memory);
		phone2.mms();
		phone2.faceTime();
		phone2.takePictures();
		
		
		Phone phone3 = new Phone();
		phone3.brand="Nokia";
		phone3.model="560";
		phone3.color="Purple";
		phone3.year=2006;
		phone3.memory=17;
		
		System.out.println("The 2nd phone is "+phone3.brand+" the model is "
				+phone3.model+ " and the color is "+phone3.color+" and the year "
				+phone3.year+" with the memory of "+phone3.memory);
		phone3.mms();
		phone3.takePictures();
		
		
	}

}
