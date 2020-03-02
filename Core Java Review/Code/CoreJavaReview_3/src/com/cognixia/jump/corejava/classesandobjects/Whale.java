package com.cognixia.jump.corejava.classesandobjects;

public class Whale extends Animal {
	
	private double swimSpeed;

	// Constructor
	public Whale() {
		super();
		setType("whale");
		this.setSwimSpeed(0);
	}
	
	public Whale(double weight, double swimSpeed) {
		super(weight, "whale");
		this.setSwimSpeed(swimSpeed);
	}
	
	public void move() {
		System.out.println("This animal swims");
	}
	
	public String toString() {
		return "This whale weighs " + getWeight() + " and swim speed is " + swimSpeed;
	}

	public double getSwimSpeed() {
		return swimSpeed;
	}

	public void setSwimSpeed(double swimSpeed) {
		this.swimSpeed = swimSpeed;
	}
	
}
