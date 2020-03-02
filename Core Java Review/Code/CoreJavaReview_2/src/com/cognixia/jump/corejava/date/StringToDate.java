package com.cognixia.jump.corejava.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException {
		
		// create a date
		Date date = new Date();
		System.out.println(date);
		
		// these are depreciated 
		//date.getDay();
		//date.setMonth(2);
		
		// String to a Date
		
		// string to convert
		String dateStr = "21/08/2020"; // day, month, year format (dd/MM/yyyy)
		
		// parse the string to a date
		date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
		
		System.out.println(date);
		
		// date with hours and minutes
		date = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse("01/01/2020 12:30");
		System.out.println(date);
		
		
	}
}
