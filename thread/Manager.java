package kosta.thread;

import java.util.ArrayList;
import java.util.List;

public class Manager {

	List<String> list = new ArrayList<String>();

	// �����߰� �����忡
	public synchronized void push(String threadName, String bread) {

		while (list.size() > 3)
		{// ���Ǹ��� �ݺ����� ��������

		try {
			System.out.println(threadName + " wait ");
			this.wait();
		} catch (Exception e) {
			e.printStackTrace();
		}}
		list.add(bread);
		System.out.println(threadName+ " "+ bread);
		System.out.println(threadName + " : " + bread + " make");
		this.notify();

	}

	// �����忡 ���� ������

	public synchronized void pop(String threadName) {

		while (list.size() == 0)
		{// ���Ǹ��� �ݺ����� ��������

		try {
			System.out.println(threadName + " wait ");
			this.wait();
		} catch (Exception e) {
			e.printStackTrace();
		}}
		System.out.println("now bread" + list.size());
		String bread = list.remove(list.size() - 1);// ���ϸ����������
		System.out.println(threadName + " : " + bread + " buy");
		this.notify();

	}
}
