package com.cognixia.jump.corejava.strings;

public class EditStrings {
	
	public static void main(String[] args) {
		
		// both StringBuilder and StringBuffer are mutable
		
		StringBuilder sb = new StringBuilder("Orquidia");
		System.out.println("Original String: " + sb);
		
		sb.append(" Moreno");
		System.out.println("Appended: " + sb);
		
		sb.append(3.2F);
		System.out.println("Appended: " + sb);
		
		sb.setCharAt(6, '@');
		System.out.println("Set character at index 6 to @: " + sb);
		
		sb.deleteCharAt(4);
		System.out.println("Delete character: " + sb);
		
		sb.delete(5, 8);
		System.out.println("Delete multiple: " + sb);
		
		sb.insert(3, "---");
		System.out.println("Insert: " + sb);
		
		sb.reverse();
		System.out.println("Reverse: " + sb);
		
		sb.setLength(10);
		System.out.println("Length 10: " + sb);
		
		sb.setLength(0);
		System.out.println("Clear: |" + sb + "|");
		
	}

}
