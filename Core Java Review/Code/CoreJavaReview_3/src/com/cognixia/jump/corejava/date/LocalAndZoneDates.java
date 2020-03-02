package com.cognixia.jump.corejava.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalAndZoneDates {
	
	public static void main(String[] args) {
		
		// just the date
		LocalDate christmas = LocalDate.of(2019, 12, 25);
		System.out.println(christmas);
		
		// just time
		LocalTime afternoon = LocalTime.of(13, 00);
		System.out.println(afternoon);
		
		// both date and time
		LocalDateTime yesterday = LocalDateTime.of(2020, 1, 27, 3, 30);
		System.out.println(yesterday);
		
		// adding time
		System.out.println("Christmas in 2 years: " + christmas.plusYears(2));
		System.out.println("Time in 100 seconds: " + afternoon.plusSeconds(100));
		System.out.println("Date in 6 weeks: " + yesterday.plusWeeks(6));
		
		// accessing parts of the time/date
		System.out.println("christmas month: " + christmas.getMonthValue());
		
		
		// Time zone with date
		LocalDateTime ldt = LocalDateTime.of(2020, 5, 24, 9, 43);
		ZoneId id = ZoneId.of("America/La_Paz");
		//System.out.println(ZoneId.getAvailableZoneIds());
		
		ZonedDateTime zdt = ZonedDateTime.of(ldt, id);
		System.out.println(zdt);
		
		// Prints: 2020-05-24T09:43-04:00[America/La_Paz]
		// The time is off by 4 hours at UTC, will be 5:43 AM in this time zone
		
		zdt.getOffset(); // gets offset from UTC
		zdt.plusMonths(4); // add time to date
	}

}
