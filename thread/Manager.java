package kosta.thread;

import java.util.ArrayList;
import java.util.List;

public class Manager {

	List<String> list = new ArrayList<String>();

	// ㅏ빵추가 진열장에
	public synchronized void push(String threadName, String bread) {

		while (list.size() > 3)
		{// 조건말고 반복문을 쓰는이유

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

	// 진열장에 빵을 구매함

	public synchronized void pop(String threadName) {

		while (list.size() == 0)
		{// 조건말고 반복문을 쓰는이유

		try {
			System.out.println(threadName + " wait ");
			this.wait();
		} catch (Exception e) {
			e.printStackTrace();
		}}
		System.out.println("now bread" + list.size());
		String bread = list.remove(list.size() - 1);// 제일마지막빵사기
		System.out.println(threadName + " : " + bread + " buy");
		this.notify();

	}
}
