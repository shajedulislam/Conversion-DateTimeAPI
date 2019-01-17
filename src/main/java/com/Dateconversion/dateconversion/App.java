package com.Dateconversion.dateconversion;



import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String DateTimeFormat = null;

	public static void main( String[] args )
    {
    	Calendar cal = Calendar.getInstance();
    	Date date = cal.getTime();
    	
    	
    	
    	LocalDate l = date.toInstant()
			      .atZone(ZoneId.systemDefault())
			      .toLocalDate();
    	
    	LocalDate D = LocalDate.now();
    	
    	System.out.println(date);
    	System.out.println(l);
    	
    	System.out.println(D);
    	
    	
    	LocalDateTime ldt  = LocalDateTime.now() ;
    	
    	Calendar cal2 = Calendar.getInstance();
		Date date2 = cal2.getTime();
		
		LocalDateTime ld= date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    	
    	System.out.println("ldt "+ldt);
    	System.out.println(ld);
    	
    	SimpleDateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z YYYY", Locale.ENGLISH);
    	 
    	String dateInString = "Wed Jan 30 15:40:27 BDT 2019";
    	try {
			Date date3 = formatter.parse(dateInString);
			System.out.println("Parsed = "+date3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	ZoneId zoneid = ZoneId.of("Asia/Dhaka");
		
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(ld, zoneid);
		
		System.out.println("Zooo"+zonedDateTime);
		
		ZoneOffset offset = ZoneOffset.ofHoursMinutes(1, 30);

        OffsetDateTime offsetDateTime = OffsetDateTime.of(ld, offset);
        
        System.out.println("offffff "+offsetDateTime);
        
        System.out.println("offffff "+offsetDateTime.toLocalDateTime());
        
        
        System.out.println(ld.getDayOfMonth()); 
    	
        
        
        Instant instant = Instant.from(l.atStartOfDay(ZoneId.of("GMT")));
        
        Date datex = Date.from(instant);
       
        
        System.out.println(l);
        
        Date dat = new Date();
        
        System.out.println(datex);
        
        
        System.out.println("----------------------");
        Date in = new Date();
        System.out.println(in);
        LocalDateTime ldt2 = LocalDateTime.ofInstant(in.toInstant(), ZoneId.systemDefault());
        System.out.println(ldt2);
        Date out = Date.from(ldt2.atZone(ZoneId.systemDefault()).toInstant());
        System.out.println(out);
        
        System.out.println("----------------------");
        
        
        
        LocalDateTime swissLocal = zonedDateTime.toLocalDateTime();
        
        System.out.println(swissLocal);
        
        LocalDate localDate = LocalDate.parse("2019-01-16");
        System.out.println(localDate);
        ZonedDateTime zonedDateTime2 = localDate.atStartOfDay(ZoneId.systemDefault());
        System.out.println(zonedDateTime2);
    	
    }
}
