package com.cognixia.jump.corejava.flowcontrol;

import java.util.Scanner;

public class ConditionalsExample {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your grade: ");
//		int grade = sc.nextInt();
//		
//		sc.close();
//		
//		// A  >=90
//		// B  >=80
//		// C  >=70
//		// D  >=65
//		// F  < 65
//		
//		if(grade == 100) {
//			System.out.println("A+ perfect score!");
//		}
//		else if(grade >= 90) {
//			System.out.println("Letter grade is A");
//		}
//		else if (grade >=80) {
//			System.out.println("Letter grade is B");
//		}
//		else if (grade >=70) {
//			System.out.println("Letter grade is C");
//		}
//		else if (grade >=65) {
//			System.out.println("Letter grade is D");
//		}
//		else {
//			System.out.println("F, you failed");
//		}
		
		
		int gradeLevel = 2;
		
		
		switch (gradeLevel) {
		case 1:
		case 2:
		case 3:
			System.out.println("Hello from 3rd grade");
		case 4:
		case 5:
			System.out.println("You're in elementary school");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("You're in middle school");
			break;
		case 9:
		case 10:
		case 11:
		case 12:
			System.out.println("You're in high school");
			break;
			
		default:
			System.out.println("Not proper grade level");
			break;			
		}
		
		
		
		
		
		
	}
}
