package kosta.data;

import java.util.LinkedList;

public class StackExam01 {

	public static void main(String[] args) {

		LinkedList<String> queue = new LinkedList<String>();
		queue.offer("≈‰≥¢");
		queue.offer("ªÁΩø");
		queue.offer("∞≥");
		while (queue.isEmpty()) {
			String str = queue.poll();
			System.out.println("queue : " + str);
		}
	}

}
