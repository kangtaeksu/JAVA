package kosta.mission;

import java.util.Scanner;

public class mission04 {

	public static void main(String[] args) {
		String m_id = "abcd";
		String m_pw = "1234";
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ��� :");
		String id = sc.nextLine();
		System.out.print("��й�ȣ�� �Է��ϼ��� :");
		String pw = sc.nextLine();

		if (id.equals("abcd") && pw.equals("1234")) {
			System.out.println("f�α��μ���");
		}if(!id.equals("abcd"))
		{
			System.out.println("���̵� ���������ʽ��ϴ�.");
		}else { 
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�");
		}
	}

}
