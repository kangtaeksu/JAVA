package kosta.video;

public class OrderMain {

	public static void main(String[] args) {

		Product pd[] = { new Product(1, "iphone", 1000000), new Product(2, "applewatch", 400000),
				new Product(3, "MacBook", 9999000) };

		Order od = new Order(2, "���ü�");
//		gm.rentalService(v1);
//		System.out.println("���� ���� : "  +gm.rentalVideo.title);

		for (int i = 0; i < pd.length; i++) {
			od.buy(pd[i]);

			System.out.println(od.person + "���� �� ������ " + od.o_name.p_name + "�̰�  \"" + od.o_name.price + "\" ���Դϴ�");
		}
	}

}
