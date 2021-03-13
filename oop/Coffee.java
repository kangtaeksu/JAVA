package kosta.oop;

public class Coffee {

	String cate;
	String temp;
	String size;
	int money;

	public Coffee() {
	}
//생성자란 객체를 생성할수있는 방식의 갯수
	public Coffee(String cate, String temp, String size) {
		super();
		this.cate = cate;//같은용어쓰지만 다른 데이터타입=오버로드
		this.temp = temp;
		this.size = size;
	}

	public void calculate() {
		if (cate.contentEquals("Americano")) {
			money = 4100;
		} else if (cate.equals("CafeMoca")) {
			money = 5500;
		} else {
			money = 5000;
		}
	}

	public void order() {

		System.out.println(cate + "\t" + temp + "\t" + size + "\t" + money);
	}
}
