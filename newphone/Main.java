package kosta.newphone;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Manager m = new Manager();
		FileUtil fu = new FileUtil();

		while (true) {
			System.out.println("1.�߰� 2.��ü ��� 3.�˻� 4.���� 5.���� 6.����");
			System.out.print("����: ");
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
				//		��̸���Ʈ�� (�������� �ø��� �������� ������ Ŭ������
				//				�ø��� ���������ؾߴ� ���ڿ� Ŭ�������� �ٵǾ���)
				//���Ͽ�  ������Ʈ�� �ƿ�ǲ��Ʈ��
						//������Ʈ ��ǲ��Ʈ�� 
						fu.readFile(file);
						
						
					case "7":
						m.deletePhoneInfo();
					case "8":	
						m.deletePhoneInfo();
						System.out.println("����");
						return;

					}

					// Ű�����Է����� ����ġ

			}

		}

	
}
