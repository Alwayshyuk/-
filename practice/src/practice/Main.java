package practice;

import java.util.Calendar;

public class Main {

	public static void main(String[] args) {
		Calendar cal2 = Calendar.getInstance();
		Calendar cal1 = Calendar.getInstance();
		cal2.set(2015, 7, 16); // 날짜를 2015년 8월 15일로 설정한다.
		cal1.set(2015, 7, 15); // 날짜를 2015년 8월 15일로 설정한다.

		long difference = (cal2.getTimeInMillis() - cal1.getTimeInMillis())/1000;      //두 날짜간의 차이.
		
		System.out.println(difference/24);
		
	}

}
