package calendarExample;

import java.util.Calendar;

public class CalendarEx03 {

	public static void main(String[] args) {
		
		//기본적으로 현재 날짜와 시간으로 설정된다.(싱글톤 패턴)
		Calendar today1 = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance();
		
		//날짜를 설정
		today1.set(2015, 7, 15);
		
		long diff = (today2.getTimeInMillis() - today1.getTimeInMillis())/1000;
		long diffDay = diff/(24*60*60);
		
		System.out.println("20150715~20220628 사이 지난 초 : " + diff);		
		System.out.println("20150715~20220628 사이 지난 일수 : " + diffDay);
		
	
		
		
		

	}

}
