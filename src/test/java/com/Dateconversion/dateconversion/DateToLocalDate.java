package com.Dateconversion.dateconversion;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

import junit.framework.Assert;

public class DateToLocalDate {

	@Test
	public void test() {
		
		LocalDate ld = LocalDate.now();
		
		DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z YYYY", Locale.ENGLISH);
   	 	
		Date D = null;
    	String dateInString = "Wed Jan 16 15:40:27 BDT 2019";
    	try {
			D = formatter.parse(dateInString);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	
    	Conversion con = new Conversion();
    	
    	
    	
    	String s="2019-01-02";
    	
    	assertEquals(s, con.Operation(D).toString());
	}

}
