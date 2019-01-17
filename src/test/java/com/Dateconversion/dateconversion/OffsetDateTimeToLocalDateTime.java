package com.Dateconversion.dateconversion;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import org.junit.Test;

public class OffsetDateTimeToLocalDateTime {

	@Test
	public void test() {
		OffsetDateTime odt = OffsetDateTime.parse("2019-01-17T12:51:40.886+01:30");
 		
    	Conversion con = new Conversion();   	
    	
    	String s="2019-01-17T12:51:40.886";
    	
    	assertEquals(s, con.OffsetDateTimeToLocalDateTime(odt).toString());
	}

}
