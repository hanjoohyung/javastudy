package chapter04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		printDate01(now);
		printDate02(now);
	}
	
	public static void printDate01(Date d) { 
		// 2021-09-13 16:06:30 으로 출력을 하려함 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String date = sdf.format(d);
		
		System.out.println(date);
	}
	public static void printDate02(Date d) { 
		// 년도(+1900)
		int year = d.getYear();
		// 월(0~11, +1) 
		int month = d.getMonth();
		// 일
		int date = d.getDate();
		// 시
		int hours = d.getHours();
		// 분
		int minutes = d.getMinutes();
		// 초
		int secends = d.getSeconds();
		
		System.out.println((year+1900) + "-" + (month+1) + "-" + date + "  " + hours + ":" + minutes + ":" + secends);
	}
}
