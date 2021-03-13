package kosta.thread2;

import java.util.ArrayList;
import java.util.List;

public class DonaManager {

	List<String> list = new ArrayList<String>();

	public synchronized void donation(int money) {

		while (list.size() == 100000) {
			try {
				System.out.println(" donation complete");

			} catch (Exception e) {
				e.printStackTrace();// TODO: handle exception
			}
		}
		list.add(money);
		int total = 0;
		for (int i = 0; i < list.size(); i++) {

			total += money;
			System.out.println(" customer is" + money);
		}
	}
}
