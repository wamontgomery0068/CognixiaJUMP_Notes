package com.cognixia.jump.corejava.enums;

import java.util.HashMap;
import java.util.Map;

public enum Element {
	
	Nitrogen("N", 7), Oxygen("O", 8), Argon("Ar", 18), Carbon("C", 6), Gold("Au", 79);
	
	// store both the symbol and the entire Element enum
	private static final Map<String, Element> BY_SYMBOL = new HashMap<String, Element>();
	private static final Map<Integer, Element> BY_ATOMIC_NUMBER = new HashMap<Integer, Element>();
	
	// we can populate this map through a static block
	static {
		for(Element e : values()) {
			
			BY_SYMBOL.put(e.symbol.toUpperCase(), e);
			BY_ATOMIC_NUMBER.put(e.atomicNumber, e);
		}
	}
	
	public final String symbol;
	public final int atomicNumber;
	
	Element(String symbol, int atomicNumber) {
		this.symbol = symbol;
		this.atomicNumber = atomicNumber;
	}
	
	public static Element valueOfSymbol(String symbol) {
		return BY_SYMBOL.get(symbol.toUpperCase());
	}
	
	public static Element valueOfAtomicNumber(int atomicNumber) {
		return BY_ATOMIC_NUMBER.get(atomicNumber);
	}

}
