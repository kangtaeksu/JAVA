package kosta.api;

import java.util.Calendar;

public class CalendarMission {

	public static void main(String[] args) {
//2월달력만들기

		int year = 2021;
		int month = 2;
		System.out.println("\t" + "[ " + year + "년 " + month + "월" + " ]");
		System.out.println("============================");
		System.out.println("  일     월   화   수   목   금   토");

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < week; i++)
			System.out.print("   ");
		for (int i = 1; i <= lastOfDate; i++) {
			System.out.print((i < 10) ? "  " + i : " " + i); // 자리수에의한 띄어쓰기
			if (week % 7 == 0)
				System.out.println(); // 일주일마다 개행
			week++;

			
		}
	}
}
