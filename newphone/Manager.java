package kosta.newphone;

import java.util.ArrayList;
import java.util.Scanner;

import kosta.phone.PhoneInfo;

public class Manager {

//	PhoneInfo[] arr;
	ArrayList<PhoneInfo> pi = new ArrayList<PhoneInfo>();
	Scanner sc = new Scanner(System.in);
	int count;
	

	public Manager() {
//		arr = new PhoneInfo[10];
//		pi.add(new PhoneInfo(getname, phoneNo, birth))
	}

	public void addPhoneInfo() {
		// �̸�, ��ȭ��ȣ, ������� �Է�
		// PhoneInfo��ü ���� => �迭�� �߰�
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		System.out.print("��ȭ��ȣ: ");
		String phoneNo = sc.nextLine();
		System.out.print("�������: ");
		String birth = sc.nextLine();

//			PhoneInfo info = new PhoneInfo(name, phoneNo, birth);
//			arr[count++] = info;
		arr[count++] = new PhoneInfo(name, phoneNo, birth);

	}

	public void listPhoneInfo() {
		// �迭�� �ִ� PhoneInfo��ü ��θ� ���
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	public void searchPhoneInfo() {
		// Ű����� ���� �̸� �Է� �޾�
		// �ش� PhoneInfo��ü�� ���
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = arr[i];
			if (name.equals(info.getName())) {
				info.show();
				idx = i;
				break;
			}
		}

		if (idx == -1) {
			System.out.println("ã�� �� �����ϴ�.");
		}
	}

	public void updatePhoneInfo() {
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = arr[i];
			if (name.equals(info.getName())) {
				System.out.print("���� ��ȭ��ȣ �Է�: ");
				String phoneNo = sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
				break;
			}
		}

		if (idx == -1) {
			System.out.println("ã�� �� �����ϴ�.");
		}
	}

	public void deletePhoneInfo() {
		System.out.print("�̸�: ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = arr[i];
			if (name.equals(info.getName())) {
				idx = i;
				break;
			}
		}

		if (idx != -1) {
			for (int i = idx; i < count; i++) {
				arr[i] = arr[i + 1];
			}

			arr[count - 1] = null;
			count--;

		} else {
			System.out.println("ã�� �� �����ϴ�.");
		}
	}
}
