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
		// 이름, 전화번호, 생년월일 입력
		// PhoneInfo객체 생성 => 배열에 추가
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("전화번호: ");
		String phoneNo = sc.nextLine();
		System.out.print("생년월일: ");
		String birth = sc.nextLine();

//			PhoneInfo info = new PhoneInfo(name, phoneNo, birth);
//			arr[count++] = info;
		arr[count++] = new PhoneInfo(name, phoneNo, birth);

	}

	public void listPhoneInfo() {
		// 배열에 있는 PhoneInfo객체 모두를 출력
		for (int i = 0; i < count; i++) {
			arr[i].show();
		}
	}

	public void searchPhoneInfo() {
		// 키보드로 부터 이름 입력 받아
		// 해당 PhoneInfo객체만 출력
		System.out.print("이름: ");
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
			System.out.println("찾을 수 없습니다.");
		}
	}

	public void updatePhoneInfo() {
		System.out.print("이름: ");
		String name = sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = arr[i];
			if (name.equals(info.getName())) {
				System.out.print("수정 전화번호 입력: ");
				String phoneNo = sc.nextLine();
				info.setPhoneNo(phoneNo);
				idx = i;
				break;
			}
		}

		if (idx == -1) {
			System.out.println("찾을 수 없습니다.");
		}
	}

	public void deletePhoneInfo() {
		System.out.print("이름: ");
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
			System.out.println("찾을 수 없습니다.");
		}
	}
}
