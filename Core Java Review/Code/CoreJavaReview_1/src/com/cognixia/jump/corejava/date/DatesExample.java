package com.cognixia.jump.corejava.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DatesExample {
	
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println("Date: " + date);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LDT: " + ldt);
		
		ldt = LocalDateTime.of(2019, Month.JULY, 12, 10, 45, 4);
		System.out.println("LDT: " + ldt);
		
		LocalDate ld = LocalDate.of(2019, Month.JULY, 12);
		System.out.println("LD: " + ld);
		
		
		ldt = LocalDateTime.now();
		ZoneId id = ZoneId.of("Europe/Paris");
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, id);
		System.out.println("ZDT: " + zdt);
		
		System.out.println(ldt.atZone(id));
		
		
		
	}

}
