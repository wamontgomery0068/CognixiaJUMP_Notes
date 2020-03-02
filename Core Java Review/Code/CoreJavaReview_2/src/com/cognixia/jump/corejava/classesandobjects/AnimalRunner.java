package com.cognixia.jump.corejava.classesandobjects;

public class AnimalRunner {
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		System.out.println(a1);
		
		Animal a2 = new Animal(300, "lion");
		System.out.println(a2);
		
		Whale w1 = new Whale();
		System.out.println(w1);
		
		w1.setSwimSpeed(50);
		
		Animal a3 = new Whale();
		System.out.println(a3);
		
		// error, an Animal is not always a Whale
		// does not have all its properties
		//a3.setSwimSpeed(50);
		
	}

}
