package kosta.restraunt;

import java.io.ObjectInputStream.GetField;
import java.util.*;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int totalSales = 0;

	public static void addMenu(LinkedList<Order> list) {
		System.out.println("food name");
		String foodName = sc.nextLine();

		System.out.println("price");
		int price = Integer.parseInt(sc.nextLine());
		// 입력을 교차로 받으면 버그나는걸 방지하기위한 방법
		System.out.println("amount");
		int amount = Integer.parseInt(sc.nextLine());

		///////////////////////////// 추가과정 중요!!
		list.offer(new Order(new Food(foodName, price), amount));
	}

	public static void menuService(LinkedList<Order> list) {

		if (!list.isEmpty()) {
			Order order = list.poll();
			order.show();
			totalSales += order.getTotal();

		}
	}

	public static void main(String[] args) {

		LinkedList<Order> list = new LinkedList<Order>();

		while (true) {
			System.out.println("1: order 2: churi 3. total price");
			System.out.println("pick");
			String menu = sc.nextLine();

			switch (menu) {

			case "1":
				addMenu(list);
				System.out.println("추가완료");
				break;
			case "2":
				menuService(list);
				break;
			case "3":

				System.out.println("총액" + totalSales);
				break;
			}
		}

	}
}