package kosta.oop;

import java.util.Scanner;

public class RectangularMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("tlwkr");
		Rectangular rec = new Rectangular(sc.nextInt(), sc.nextInt());// ������ ��ȣ�ȿ�
		// �����ڸ� ���� ��ü �ʱ�ȭ�� �����ϴ�.
		// �����ڶ� ��ü�� �����ǰ� �����ؾ��� ��ɹ��� ���ִ� �κ�

//		System.out.print("�����Է� : ");
//		rec.wid = sc.nextInt();

//		System.out.print("�����Է� : ");
//		rec.length = sc.nextInt();

		rec.area();
		rec.print();

	}

}
