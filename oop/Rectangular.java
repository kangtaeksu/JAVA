package kosta.oop;

public class Rectangular {
//���� ���� ���̸� ���ؼ� ������ ���ϴ� ���α׷��� ������
	// �Ӽ�; = ����
	// �޼ҵ�; =���

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
		System.out.println("������ : " + area);
	}
}
