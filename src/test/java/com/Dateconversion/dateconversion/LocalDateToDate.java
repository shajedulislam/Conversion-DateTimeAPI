package com.Dateconversion.dateconversion;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.Test;

public class LocalDateToDate {

	@Test
	public void test() {
		LocalDate ld = LocalDate.parse("2019-01-16")  ;
		
		String exp = "Wed Jan 16 00:00:00 BDT 2019";
		
		Conversion con = new Conversion();
		
		assertEquals(exp,con.LocalDateToDate(ld).toString());
	}

}
