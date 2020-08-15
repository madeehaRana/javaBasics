package com.syntax.class26;

public abstract class Phone {
	void makeCall() {
		System.out.println("Phone makes call");
	}
	
	void sendText() {
		System.out.println("Phone can send text");
	}
	
	public abstract void navigate();
	
	public abstract void playMusic();
	
	
}
class Samsung extends Phone{
	public void navigate() {
		System.out.println("Samsung navigates...");
	}
	public void playMusic() {
		System.out.println("Samsung plays music from google store");
	}
}
class Iphone extends Phone{
	public void navigate() {
		System.out.println("Iphone navigates...");
	}
	public void playMusic() {
		System.out.println("Iphone plays music from google store");
	}
}