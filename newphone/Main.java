package kosta.newphone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		FileUtil fu = new FileUtil();

		while (true) {
			System.out.println("1.추가 2.전체 출력 3.검색 4.수정 5.삭제 6.종료");
			System.out.print("선택: ");
			String menu = sc.nextLine();

			switch (menu) {
			case "1":
				m.addPhoneInfo();
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhoneInfo();
				break;
			case "4":
				m.updatePhoneInfo();
				break;
			case "5":
				m.deletePhoneInfo();
				break;
			case "6":
				//		어레이리스트를 (폰인포도 시리얼 라이저블 즉하위 클래스는
				//				시리얼 라이저블해야댐 문자열 클래스들은 다되었음)
				//파일에  오브젝트는 아웃풋스트림
						//오브젝트 인풋스트림 
						fu.readFile(file);
						
						
					case "7":
						m.deletePhoneInfo();
					case "8":	
						m.deletePhoneInfo();
						System.out.println("종료");
						return;

					}

					// 키보드입력으로 스위치

			}

		}

	
}
