package com.Dateconversion.dateconversion;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.junit.Test;

public class LocalDateTimeToDate {

	@Test
	public void test() {
		
		LocalDateTime ldt = LocalDateTime.parse("2019-01-17T12:26:18.124");
 		
    	Conversion con = new Conversion();   	
    	
    	String s="Thu Jan 17 12:26:18 BDT 2019";
    	
    	assertEquals(s, con.LocalDateTimeToDate(ldt).toString());
	}

}
