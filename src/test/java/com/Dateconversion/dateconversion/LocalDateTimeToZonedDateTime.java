package com.Dateconversion.dateconversion;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

public class LocalDateTimeToZonedDateTime {

	@Test
	public void test() {
   	 	
		LocalDateTime dateTime = LocalDateTime.parse("2019-01-16T17:15:15.665");
    	
    	Conversion con = new Conversion();
    	
    	
    	
    	String s="2019-01-16T17:15:15.665+06:00[Asia/Dhaka]";
    	
    	assertEquals(s, con.DateToZonedTime(dateTime).toString());
	}

}
