package ch05_3_enumeration;

import java.util.Calendar;
//import java.util.Scanner;

public class EnumWeekExample {
	public static void main(String[] args) {
//		java.util.Scanner scanner = new java.util.Scanner(System.in); import안할꺼면 이렇게 써야한다.(패키지까지 싹 다 써야징)

		Week today = null; // 열거타입 변수 선언

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일(1) ~ 토(7)까지의 숫자를 리턴 (금요일일땐 6이 출력된다.)

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		}

		System.out.println("오늘 요일 = " + today);
		if(today == Week.FRIDAY) {
			System.out.println("불금엔 자바~");
		}else {
			System.out.println("다른요일도 자바~...");
		}
	}
}
