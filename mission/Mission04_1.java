package kosta.mission;

import java.util.Scanner;

public class Mission04_1 {

	public static int check(String id, String pw) {

		if (id.equals("rkdxortn") && pw.contentEquals("1234")) {
			return 1;
		} else
			return 0;
	}

	// 0���� 1����
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String id, pw;
		System.out.print("���̵��Է��Ͻÿ� : ");
		id = sc.nextLine();
		System.out.print("��й�ȣ�Է��Ͻÿ� : ");
		pw = sc.nextLine();

		if (check(id, pw) == 1) {
			System.out.println("�α��μ���");
		} else {
			System.out.println("�α��ν���");
		}

	}

}
