package com.cognixia.jump.corejava.classesandobjects;

public class Animal {
	
	// Attributes
	private double weight;
	private String type;
	
	//Constructor
	public Animal() {
		//this.weight = 0;
		//this.type = "N/A";
		this(0, "N/A");
	}
	
	public Animal(double weight, String type) {
		this.weight = weight;
		this.type = type;
	}
	
	
	// Methods
	public void move() {
		System.out.println("This animal moves.");
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + ", type=" + type + "]";
	}

}
