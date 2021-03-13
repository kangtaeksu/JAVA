package kosta.phone;

import java.util.ArrayList;

import kosta_grade.ScienStudent;

public class Manager {

	
	ArrayList<PhoneInfo> pi = new ArrayList<PhoneInfo>(); 
	int count = 0;
	String menu = "";

	public void Manager() {}

	public void addPhoneInfo() {
		// 이름 전번 생년월일입력받아서
		// 폰인포에 객체 생성해서 => 배열에 추가 == 전화번호 추가저장된것
// 1. 일반멤버   2.동창 3.직장

		System.out.print("어떤 부류인지 입력하세요 : ");
		String menu = DataInput.sc.nextLine();
		if (menu == "x") {

			System.out.print("추가할 이름 입력하세요 : ");
			String name = DataInput.sc.nextLine();
			System.out.print("전화번호 입력하세요 : ");
			String phoneNo = DataInput.sc.nextLine();
			System.out.print("생년월일 입력하세요 : ");
			String birth = DataInput.sc.nextLine();
//		
//		if (phoneNo == null || phoneNo.length() == 0) {
//			throw new Exception("반드시 번홀ㄹ 입력하세요 ");
//		}
			pi[count++] = new PhoneInfo(name, phoneNo, birth);

		} else if (menu == "y")

		{

			System.out.print("추가할 이름 입력하세요 : ");
			String name = DataInput.sc.nextLine();
			System.out.print("전화번호 입력하세요 : ");
			String phoneNo = DataInput.sc.nextLine();
			System.out.print("생년월일 입력하세요 : ");
			String birth = DataInput.sc.nextLine();
			System.out.print("어떤 부서인지 입력하세요 : ");
			String dept = DataInput.sc.nextLine();
			System.out.print("어떤 직책인지 입력하세요 : ");
			String position = DataInput.sc.nextLine();

//			if (phoneNo == null || phoneNo.length() == 0) {
//				throw new Exception("반드시 번홀ㄹ 입력하세요 ");
//			}
			pi[count++] = new PhoneInfo(name, phoneNo, birth);
			System.out.println("저장완료 ");
		} else if (menu == "z")

		{

			System.out.print("추가할 이름 입력하세요 : ");
			String name = DataInput.sc.nextLine();
			System.out.print("전화번호 입력하세요 : ");
			String phoneNo = DataInput.sc.nextLine();
			System.out.print("생년월일 입력하세요 : ");
			String birth = DataInput.sc.nextLine();
			System.out.print("어떤 전공인지 입력하세요 : ");

			String major = DataInput.sc.nextLine();
			System.out.print("몇 학번인지 입력하세요 : ");
			String position = DataInput.sc.nextLine();

//			if (phoneNo == null || phoneNo.length() == 0) {
//				throw new Exception("반드시 번홀ㄹ 입력하세요 ");
//			}
			pi[count++] = new PhoneInfo(name, phoneNo, birth);
			System.out.println("저장완료 ");
		}
	}

	////////////////////////////////////////////////////////

	public void listPhoneInfo() {
		// 배열에 있는 폰인포객체모두를 출력

		System.out.print("출력 방식을 입력하세요 : ");
		String name = DataInput.sc.nextLine();

		// 1.전체 2. 동창 3.직장
		if (menu == "a") {
			for (int i = 0; i < count; i++) {
				pi[i].show();
			}

		} else if (menu == "b") {

			for (int n = 0; n < pi.length; n++) {
				if (pi[n] instanceof Company) {

					Company cp = (Company) pi[n];

					cp.show();
				}
			}
		} else if (menu == "c") {

			for (int k = 0; k < pi.length; k++) {
				if (pi[k] instanceof Company) {

					Universe cp = (Universe) pi[k];

					cp.show();
				}
			}
		}
	}

	public void searchPhonInfo() {

		System.out.print("검색할 이름 입력하세요 : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];// 중요!! 폰인포객체배열 생성
			if (name.equals(info.getName())) {
				info.show();
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.println("no here");

			// 키보드로 부터 이름을 입력받아 해당 폰인포 객체만 출력하도록
		}
	}

	public void rePhonInfo() {
		System.out.print("수정할 이름 입력하세요 : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];
			if (name.equals(info.getName())) {
				System.out.print("바뀐 전화번호를 입력하세요 : ");
				String phoneNo = DataInput.sc.nextLine();
				// pi[i].setPhoneNo(phoneNo);
				info.setPhoneNo(phoneNo);
				idx = i;
				System.out.println("바꼈습니다.");
				break;
			}

		}
		if (idx == -1) {
			System.out.println("no here");
		}

	}

	public void deletePhonInfo() {

		System.out.print("지우고 싶은 이름 입력하세요 : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];
			if (name.equals(info.getName())) {
				// pi[i] = pi[i + 1]; //지운후에 추가 입력후 출력시 복제됨
				// 여기부터문제
				idx = i;
				break;
			}
		}
		if (idx != -1) {
			for (int i = idx; i < count; i++) {
				pi[i] = pi[i + 1];
			}
			pi[count - 1] = null;// 0으로만들고
			count--;// 하나줄이기

		} else {
			System.out.println("no here");
		}
	}
}
