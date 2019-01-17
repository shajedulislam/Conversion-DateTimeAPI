package com.Dateconversion.dateconversion;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Test;

public class LocalDateTimeToOffsetDateTime {

	@Test
	public void test() {
		LocalDateTime dateTime = LocalDateTime.parse("2019-01-16T17:47:51.088");
    	
    	Conversion con = new Conversion();   	
    	
    	String s="2019-01-16T17:47:51.088+01:30";
    	
    	assertEquals(s, con.DateToOffsetDateTime(dateTime).toString());
	}

}
