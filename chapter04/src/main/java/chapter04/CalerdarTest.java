package chapter04;

import java.util.Calendar;

public class CalerdarTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, 2021);
		cal.set(Calendar.MONTH, 11); //12를 지정한 것 (MONTH-1)
		cal.set(Calendar.DATE, 25);
		printDate(cal);
		
		cal.set(2020,8,29);			// 기준 날짜를 세팅해준다
		cal.add(Calendar.DATE, 400); // 몇일 만큼 더해준다.
		printDate(cal);
	}
	public static void printDate(Calendar cal) {
		final String[] DAYS = {"일","월","화","수","목","금","토"};
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); // 0~11 까지 출력 +1해줘야함
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK); // 1(일)~7(토)
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year + "년 " + (month+1)+ "월 "+ date + "일 " + DAYS[day-1] +"요일 "+ hour + "시" + minute+ "분" + second + "초");
	}
	
}
