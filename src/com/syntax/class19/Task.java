package com.syntax.class19;

public class Task {
/*Create a method that will accept an array as parameters 
 * and will return a sum of all elements from that array. 
 * Method should be visibly only within same package and 
 * accessible by the creating an instance of the class.
 * 
 */

	
	protected int sum1(int[] array) {
		int sum= array[0];
		for(int i=0; i<array.length;i++) {
			sum=sum+array[i];
		}
		return sum;
	}
	
public static void main (String [] args) {
	Task arr = new Task();
	
	int[] array1 = { 5, 2, 6, 9, 1 };
	int test=arr.sum1(array1);
	//System.out.println(arr.sum1(array1));
	System.out.println(test);
}
	
	
	
	
	
	
}
