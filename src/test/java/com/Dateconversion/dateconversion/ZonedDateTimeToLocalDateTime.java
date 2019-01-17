package com.Dateconversion.dateconversion;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

import org.junit.Test;

public class ZonedDateTimeToLocalDateTime {

	@Test
	public void test() {
		ZonedDateTime zdt = ZonedDateTime.parse("2019-01-17T12:37:06.750+06:00[Asia/Dhaka]");
 		
    	Conversion con = new Conversion();   	
    	
    	String s="2019-01-17T12:37:06.750";
    	
    	assertEquals(s, con.ZonedDateTimeToLocalDateTime(zdt).toString());
	}

}
