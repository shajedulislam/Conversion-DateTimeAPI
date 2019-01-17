package com.Dateconversion.dateconversion;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DateToLocalDateTime extends TestCase {
	
	public void test()
	{
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z YYYY", Locale.ENGLISH);
   	 	
		Date D = null;
    	String dateInString = "Wed Jan 16 16:39:55 BDT 2019";
    	try {
			D = formatter.parse(dateInString);
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	
    	Conversion con = new Conversion();
    	
    	
    	
    	String s="2019-01-02T16:39:55";
    	
    	assertEquals(s, con.DateToLocalDateTime(D).toString());
	}

}
