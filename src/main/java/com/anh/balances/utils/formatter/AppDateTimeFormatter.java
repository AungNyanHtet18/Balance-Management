package com.anh.balances.utils.formatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AppDateTimeFormatter {
    
	public static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	public static final DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	
	
	public String formatDateTime(LocalDateTime dateTime) {
		
		if(null != dateTime) {
			 return dateTime.format(DTF);
		}
		
		return null;
	}
	
	public String formatDate(LocalDate date) {
		
		if(null != date) {
			 return date.format(DF);
		}
		
		return null;
	}
	
	
}
