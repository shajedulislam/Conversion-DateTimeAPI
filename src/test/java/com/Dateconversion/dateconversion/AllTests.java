package com.Dateconversion.dateconversion;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DateToLocalDate.class, DateToLocalDateTime.class, LocalDateTimeToDate.class,
		LocalDateTimeToOffsetDateTime.class, LocalDateTimeToZonedDateTime.class, LocalDateToDate.class,
		LocalDateToZonedDateTime.class, OffsetDateTimeToLocalDateTime.class, ZonedDateTimeToLocalDateTime.class })
public class AllTests {

}
