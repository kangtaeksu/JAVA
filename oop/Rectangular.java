package kosta.oop;

public class Rectangular {
//가로 세로 길이를 구해서 면적을 구하는 프로그램을 만들어보자
	// 속성; = 상태
	// 메소드; =기능

	int wid;
	int length;
	int area;

	public Rectangular() {
	}
//	void Rectangular(int wid,int length) {
//		this.wid = wid;
//		this.length = length;
//	}

	public Rectangular(int wid, int length) {
		super();
		this.wid = wid;
		this.length = length;
	}

	public void area() {
		area = wid * length;
	}

	public void print() {
		System.out.println("면적은 : " + area);
	}
}
