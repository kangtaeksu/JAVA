package kosta.oop;

import java.util.Scanner;

public class RectangularMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("tlwkr");
		Rectangular rec = new Rectangular(sc.nextInt(), sc.nextInt());// 생성자 괄호안에
		// 생성자를 통한 객체 초기화도 가능하다.
		// 생성자란 객체가 생성되고 실행해야할 명령문을 써주는 부분

//		System.out.print("가로입력 : ");
//		rec.wid = sc.nextInt();

//		System.out.print("세로입력 : ");
//		rec.length = sc.nextInt();

		rec.area();
		rec.print();

	}

}
