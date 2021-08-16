package ch05_3_enumeration;

import java.util.Calendar;
//import java.util.Scanner;

public class EnumWeekExample {
	public static void main(String[] args) {
//		java.util.Scanner scanner = new java.util.Scanner(System.in); import���Ҳ��� �̷��� ����Ѵ�.(��Ű������ �� �� ���¡)

		Week today = null; // ����Ÿ�� ���� ����

		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // ��(1) ~ ��(7)������ ���ڸ� ���� (�ݿ����϶� 6�� ��µȴ�.)

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		}

		System.out.println("���� ���� = " + today);
		if(today == Week.FRIDAY) {
			System.out.println("�ұݿ� �ڹ�~");
		}else {
			System.out.println("�ٸ����ϵ� �ڹ�~...");
		}
	}
}
