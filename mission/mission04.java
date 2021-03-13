package kosta.mission;

import java.util.Scanner;

public class mission04 {

	public static void main(String[] args) {
		String m_id = "abcd";
		String m_pw = "1234";
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 :");
		String id = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 :");
		String pw = sc.nextLine();

		if (id.equals("abcd") && pw.equals("1234")) {
			System.out.println("f로그인성공");
		}if(!id.equals("abcd"))
		{
			System.out.println("아이디가 존재하지않습니다.");
		}else { 
			System.out.println("비밀번호가 틀렸습니다");
		}
	}

}
