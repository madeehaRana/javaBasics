package com.syntax.class25;

public class ComputerTest {

	public static void main(String[] args) {
		Computer apple = new Apple(2000, "MacBook Pro");
		Computer lenovo = new Lenovo(700, "Linex");
		Computer hp = new Hp(800, "Fastest");
		Computer dell = new Dell (900,"Packet");
		
		Computer mycomputer [] = {apple, lenovo, hp, dell};
		int size = mycomputer.length;
		System.out.println(size);
		
		for(Computer c :mycomputer) {
			c.smart();
			c.fun();
			System.out.println("---------------------------");
		}
		
		for(int i=0; i<mycomputer.length; i++) {
			mycomputer[i].smart();
		}
		
	}

}
