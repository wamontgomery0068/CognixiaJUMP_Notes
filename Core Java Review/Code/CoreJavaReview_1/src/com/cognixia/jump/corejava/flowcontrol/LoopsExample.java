package com.cognixia.jump.corejava.flowcontrol;

public class LoopsExample {
	
	public static void main(String[] args) {
		
		boolean condition = false;
		
		int counter = 1;
		
		// not run if condition is false
		while(condition) {
			System.out.println("While " + counter);
			counter++;
			
			if(counter > 5) {
				condition = false;
			}
		}
		
		System.out.println("-------");
		
		condition = false;
		counter = 1;
		
		// run once no matter if condition is false
		do {			
			System.out.println("Do While " + counter);
			counter++;
			
			if(counter > 5) {
				condition = false;
			}
			
		} while(condition);
		
		
		System.out.println("\n\n");
		
		// for loop
//		for(int i = 0; i < 10; i++) {
//			System.out.println("For Loop " + i);
//		}
		
		// condition blocks don't necessarily depend on the iterator we create
//		boolean stop = false;
//		
//		for(int i = 1; i < 10 && !stop; i++) {
//			System.out.println("For Loop " + i);
//			
//			if(i % 5 == 0) {
//				stop = true;
//			}
//		}
		
		// don't just need to increment by 1
		
		for(int i = 0; i < 10; i+=2) {
			System.out.println("For Loop " + i);
		}
		
		System.out.println("----");
		
		for(int i = 10; i > 0; i-=2) {
			System.out.println("For Loop " + i);
		}
		
		
		
		// nested for loop
		
		for(int len = 1; len < 4; len++) {
			for(int width = 1; width < 4; width++) {
				
				int area = len * width;
				
				System.out.println("length = " + len + ", width = " + width 
						+ " area = " + area);	
			}
			
		}
		
		for(int len = 1; len <= 4; len++) {
			for(int width = 1; width <= 4; width++) {
				System.out.print("o");
			}
			System.out.println();
		}
		
		
		System.out.println("\n\n");
		
		// breaks and continue
		int x = 3;
		
		for(int i = x; i < 100; i++) {
			
			if(i % 9 == 0) {
				continue;
			}
			else if (i % x == 0) {
				System.out.println("Divisible by " + x);
			}
			else if (i % (9 + x) == 0) {
				break;
			}
			
			
			System.out.println(i);
		}
		
	}

}
