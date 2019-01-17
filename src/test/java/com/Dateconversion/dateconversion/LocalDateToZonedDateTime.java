package com.Dateconversion.dateconversion;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.junit.Test;

public class LocalDateToZonedDateTime {

	@Test
	public void test() {
		LocalDate ld = LocalDate.parse("2019-01-16");
    	
    	Conversion con = new Conversion();   	
    	
    	String s="2019-01-16T00:00+06:00[Asia/Dhaka]";
    	
    	assertEquals(s, con.LocalDateToZonedDateTime(ld).toString());
	}

}
