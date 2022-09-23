package java1.kString;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import java1.e클래스.EX15_정적멤버.Calculator;

public class EX3_Date클래스 {
	
	public static void main(String[] args) {
		
		//date클래스
		
		EX4_달력 ex = new EX4_달력();
		Date now = new Date();				System.out.println(now);
		String strNow1 = now.toString();	System.out.println(strNow1);
		
		//simpleDateFormat()  API인듯?
			// 1. simpleDateFormat 객체명 = new simpleDateFormat("형식");
			// 2. 객체명.format(데이터)
		SimpleDateFormat sdf = new SimpleDateFormat();
		String strNow2 = sdf.format(new Date());
		System.out.println(strNow2);
		
		// Calender 클래스
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get( Calendar.YEAR); System.out.println(year);
		int month = cal.get(Calendar.MONTH)+1 ; System.out.println(month);
		int day = cal.get(Calendar.DAY_OF_MONTH); System.out.println(day);
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
			// 일~토 : 1~7
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY : strWeek = "월"; break;
			case Calendar.TUESDAY : strWeek = "화"; break;
			case Calendar.WEDNESDAY : strWeek = "수"; break;
			case Calendar.THURSDAY : strWeek = "목"; break;
			case Calendar.FRIDAY : strWeek = "금"; break;
			case Calendar.SATURDAY : strWeek = "토"; break;
			default :  strWeek = "일"; break;			
		}
		System.out.println(strWeek);
		
		int amPm = cal.get(Calendar.AM_PM);
		System.out.println(amPm);
		if(amPm== Calendar.AM) {
			System.out.println("오전입니다");
		}else {
			System.out.println("오후입니다");
		}
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		new EX4_달력().run();
		ex.run();
		
		
		
	}
	
}
