package com.ccunix.ihousekeeping.base.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

	public static SimpleDateFormat dateFormat_yyyyMMdd = new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat dateFormat_yyyyMMddhhmmss = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	public static SimpleDateFormat dateFormat_yyMMDD = new SimpleDateFormat("yyMMdd");
	
	
	public static String getDateString(SimpleDateFormat format, Date date) {
		return format.format(date);
	}

	public static Date getDateDate(SimpleDateFormat format, String date) {
		try {
			return format.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };

	public static String getWeekDayStr_by_date(String date) {
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		
		Calendar cal = Calendar.getInstance(); // 获得一个日历
		Date datet = null;
		try {
			datet = f.parse(date);
			cal.setTime(datet);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1; // 指示一个星期中的某天。
		if (w < 0)
			w = 0;
		return weekDays[w];
	}
	
	public static void main(String[] args) {
		System.out.println(getWeekDayStr_by_date("2018-12-12"));
	}

}
