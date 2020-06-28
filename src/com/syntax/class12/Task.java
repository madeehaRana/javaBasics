package com.syntax.class12;

public class Task {

	public static void main(String[] args) {
		/*create a 2D that will store food of different kinds
		 * and retrieve all values from that array using 2 different loop
		 * 
		 */
		String [][] food= {
				{"Indian","Korean", "Japanease","Italian"},
				{"Pakistani","Bolivian", "French"},
		};
		for(int i=0; i<food.length; i++) {
			for(int j=0; j<food[i].length;j++) {
				String foods=food[i][j];
				System.out.print(foods+" ");
			}
			System.out.println();
		}
		System.out.println("-------------2nd way--------");
		for(String[] array:food) {
			for(String yummy:array) {
				System.out.println(yummy);
				
			}
		}
	}

}
