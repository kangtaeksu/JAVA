package kosta.api;

import java.util.Calendar;

public class CalendarMission {

	public static void main(String[] args) {
//2���޷¸����

		int year = 2021;
		int month = 2;
		System.out.println("\t" + "[ " + year + "�� " + month + "��" + " ]");
		System.out.println("============================");
		System.out.println("  ��     ��   ȭ   ��   ��   ��   ��");

		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);

		int lastOfDate = cal.getActualMaximum(Calendar.DATE);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		for (int i = 1; i < week; i++)
			System.out.print("   ");
		for (int i = 1; i <= lastOfDate; i++) {
			System.out.print((i < 10) ? "  " + i : " " + i); // �ڸ��������� ����
			if (week % 7 == 0)
				System.out.println(); // �����ϸ��� ����
			week++;

			
		}
	}
}
