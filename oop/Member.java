package kosta.oop;

public class Member {
	String name;
	int age;

	public Member(){} //=>����Ʈ ������ ������ ����µ� �츮���� �Ⱥ��ϻ�
	//�׳� ������ ���ִ� ������ ������!
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}//�ҽ����� ���� ������ �̰��������� ����Ʈ �����ڰ� �־����
	
	
	
	public void print() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}


}
