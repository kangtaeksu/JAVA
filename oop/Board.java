package kosta.oop;

public class Board {
//�Խ��ǿ� �������� ���� �Է¹ް� ��ü�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
//�� :�۹�ȣ, ������, �ۼ���, ����
// ��� : �۾���, ��ü �� ���  ������ ���
	
	int num;
	String title;
	String who;
	String x;
	
	public Board() {}
	
	public Board(int num, String title, String who, String x) {
		super();
		this.num = num;
		this.title = title;
		this.who = who;
		this.x = x;
	}
	
	public void print() {
	
		System.out.println(num+" \t "+title+ " \t "+who + "\t"+x);
	}
	
}
