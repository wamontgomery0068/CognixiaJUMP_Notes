package com.cognixia.jump.corejava.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatcher {

	public static void main(String[] args) {
		
		// regex: email for a company
		// Cognixia emails formated: [first name].[last name]@cognixia.com
		
		// regex pattern for email
		String emailRegex = "[a-zA-Z]+\\.[a-zA-Z]+@cognixia\\.com";
		
		System.out.println(emailRegex);
		
		// create pattern
		Pattern pattern = Pattern.compile(emailRegex);
		
		// create the matcher with the pattern and string
		Matcher matcher = pattern.matcher("orquidia.moreno@cognixia.com");
		
		
		// check if matches
		if(matcher.matches()) {
			System.out.println("Email matches");
		}
		else {
			System.out.println("Email doesn't match");
		}
		
		// get regex pattern from matcher
		System.out.println(matcher.pattern());
		
		
		
		
		// answer from exercise for address
		Pattern p = Pattern.compile("\\d+ [A-Z][a-z]* (Street|Avenue), [A-Z][a-z]*, [A-Z]{2} \\d{5}");
		
		Matcher m = p.matcher("9 South 27th Place, A City, CAB 12378-0123");
		
		if(m.matches()) {
			System.out.println("Matches address");
		}
		else {
			System.out.println("Doesn't match address");
		}
		
		
		
	}
	
}
