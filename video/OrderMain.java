package kosta.video;

public class OrderMain {

	public static void main(String[] args) {

		Product pd[] = { new Product(1, "iphone", 1000000), new Product(2, "applewatch", 400000),
				new Product(3, "MacBook", 9999000) };

		Order od = new Order(2, "강택수");
//		gm.rentalService(v1);
//		System.out.println("빌린 비디오 : "  +gm.rentalVideo.title);

		for (int i = 0; i < pd.length; i++) {
			od.buy(pd[i]);

			System.out.println(od.person + "님이 산 물건은 " + od.o_name.p_name + "이고  \"" + od.o_name.price + "\" 원입니다");
		}
	}

}
