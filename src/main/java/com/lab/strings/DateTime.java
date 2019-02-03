package com.lab.strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateTime {

	public static void main(String[] args) {
		
		//String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		try {
			sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
			cal.setTime(sdf.parse("2018-11-11 11:31:30"));
			
			System.out.println(cal.getTimeInMillis());
			System.out.println(sdf.format(cal.getTimeInMillis()));
			
			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sdf1.setTimeZone(TimeZone.getTimeZone("PST"));
			System.out.println(sdf1.format(cal.getTime()));
			System.out.println(cal.getTimeInMillis());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String convertToDate(Long time) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date(time);
		sdf.setTimeZone(TimeZone.getTimeZone("PST"));
		return sdf.format(date);
	}

}
