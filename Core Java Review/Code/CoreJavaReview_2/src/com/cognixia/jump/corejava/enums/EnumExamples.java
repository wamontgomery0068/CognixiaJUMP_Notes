package com.cognixia.jump.corejava.enums;

enum Colors {
	RED, BLUE, GREEN, YELLOW, PURPLE
}

public class EnumExamples {

	public static void main(String[] args) {
		
		Grade g1 = Grade.Junior;
		
		System.out.println(g1);
		System.out.println("Ordinal for junior: " + g1.ordinal());
		
		if(g1 == Grade.FRESHMAN) {
			System.out.println("This is a junior");
		}
		else {
			System.out.println("Not a junior");
		}
		
		g1.hello();
		Grade.FRESHMAN.hello();
		
		Colors blue = Colors.BLUE;
		
		
		// Elements
		Element gold = Element.Gold;
		System.out.println(gold);
		System.out.println("symbol: " + gold.symbol);
		
		System.out.println(Element.values());
		
		
		System.out.println(Element.valueOfSymbol("c"));
		System.out.println(Element.valueOfAtomicNumber(79));
		
		
	}
	
}
