package kosta.mission;

import java.util.Scanner;

public class Mission04_1 {

	public static int check(String id, String pw) {

		if (id.equals("rkdxortn") && pw.contentEquals("1234")) {
			return 1;
		} else
			return 0;
	}

	// 0실패 1성공
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		String id, pw;
		System.out.print("아이디입력하시오 : ");
		id = sc.nextLine();
		System.out.print("비밀번호입력하시오 : ");
		pw = sc.nextLine();

		if (check(id, pw) == 1) {
			System.out.println("로그인성공");
		} else {
			System.out.println("로그인실패");
		}

	}

}
