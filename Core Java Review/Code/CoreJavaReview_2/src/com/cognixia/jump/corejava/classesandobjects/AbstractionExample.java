package com.cognixia.jump.corejava.classesandobjects;

public class AbstractionExample {
	
	private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if(num >= 0) {
			this.num = num;
		}
	}


	public static int ageByMonths(int months) {
		
		// leftover months once we hit each year
		int leftover = months % 12;
		
		// calc age
		int age = (months - leftover) / 12;
		
		return age;
	}

	
	public static void main(String[] args) {
		
		int myAgeMonths = 200;
		
		int ageYears = ageByMonths(myAgeMonths);
		
		System.out.println(ageYears);
		
		
		AbstractionExample ae1 = new AbstractionExample();
		
		ae1.setNum(4);
		System.out.println(ae1.getNum());
		
		ae1.setNum(-2);
		System.out.println(ae1.getNum());
		
	}
}
