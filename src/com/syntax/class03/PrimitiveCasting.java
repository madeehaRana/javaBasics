package com.syntax.class03;

public class PrimitiveCasting {
	public static void main(String [] args) {
		//casting in java is a conversion of one type into another type. (primitive and non primitive)
		//byte-->short-->int--->long--->float-->double
		//1, widening---its a implicit casting and done automatically.
		//2. narrowing---explicit and this is done manually. 
		
		//widening---> implicit
		double d = 7;
		System.out.println(d);
		
		//int i = 7.58; // compile time error : type mismatch; cannot convert from dounle to int.
		
		//narrowing (explicit casting, manually)
		int i = (int) 7.58; //forcing it into
		System.out.println(i);
		
		//narrowing a large number into a byte
		byte b = (byte) 123865;
		
		System.out.println(b);
		
		//narrowing explicitly you are trying to fit somthing from big box into a small
		
		
		long l2 = 45;
		long l1=121354658476876846l;
		
		int number2=(int)l2;
		
		System.out.println(l2);
		System.out.println(number2);
		
		int number= (int)l1;
		System.out.println(number);
		
		int num11=3244;
		double dNum=num11;
		System.out.println(dNum);
		
		double dNum2=99.9;
		int dNum3=(int)dNum2;
		System.out.println(dNum3);
		
		
		
		
		
	}

}
