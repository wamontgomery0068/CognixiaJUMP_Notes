package com.cognixia.jump.corejava.enums;

public enum Grade {

	FRESHMAN, SOPHMORE, Junior, SENIOR;
	
	// an Enum's constructor runs once for each value
	// this statement is printed for each grade
	Grade() {
		System.out.println("This student is a " + this.toString() + " and has been " 
					+ "in highschool for " + (this.ordinal() + 1) + " years.");
	}
	
	// method
	public void hello() {
		System.out.println("Hello I am a " + this.toString() + " level student.");
	}
	
}
