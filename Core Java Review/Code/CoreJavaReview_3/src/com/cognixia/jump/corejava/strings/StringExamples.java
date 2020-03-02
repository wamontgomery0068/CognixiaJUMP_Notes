package com.cognixia.jump.corejava.strings;

public class StringExamples {

	public static void main(String[] args) {
		
		// String created in String Pool
		String str = "Hello World";
		
		// String will be Heap Memory
		String str2 = new String("Hello World");
		
		// Same reference to String for str
		String str3 = "Hello World";
		
		// compare reference in memory
		if(str == str3) 
			System.out.println("str is the same String reference as str3");
		
		if(str == str2)
			System.out.println("str is the same as str2");
		else
			System.out.println("str is not the same as str2");
		
		// compares the values
		if(str.equals(str2)) 
			System.out.println("str equals str2");
		else
			System.out.println("str doesn't equal str2");
		
		
		// length
		System.out.println("Length of str: " + str.length());
		
		// access a character at an index
		System.out.println("Fourth character: " + str.charAt(3));
		
		// find the index for a character
		System.out.println("Find the index for e: " + str.indexOf('e'));
		System.out.println("Find index for World: " + str.indexOf("World"));
		
		System.out.println("Find index for l after index 4: " + str.indexOf('l', 4));
		
		String str4 = "Hello World Hello World";
		System.out.println("Find World after index 11: " + str4.indexOf("World", 11));
		
		// can't find this
		System.out.println("Find World after index 11: " + str.indexOf("World", 11));
		System.out.println("Find index for a: " + str.indexOf('a'));
		
		
		// getting substrings
		System.out.println("Substring after 3rd index: " + str.substring(2));
		System.out.println("Substring between index 2 to 7: " + str.substring(2, 7));

		
		
	}
	
}
