package kosta.phone;

import java.util.ArrayList;

import kosta_grade.ScienStudent;

public class Manager {

	
	ArrayList<PhoneInfo> pi = new ArrayList<PhoneInfo>(); 
	int count = 0;
	String menu = "";

	public void Manager() {}

	public void addPhoneInfo() {
		// �̸� ���� ��������Է¹޾Ƽ�
		// �������� ��ü �����ؼ� => �迭�� �߰� == ��ȭ��ȣ �߰�����Ȱ�
// 1. �Ϲݸ��   2.��â 3.����

		System.out.print("� �η����� �Է��ϼ��� : ");
		String menu = DataInput.sc.nextLine();
		if (menu == "x") {

			System.out.print("�߰��� �̸� �Է��ϼ��� : ");
			String name = DataInput.sc.nextLine();
			System.out.print("��ȭ��ȣ �Է��ϼ��� : ");
			String phoneNo = DataInput.sc.nextLine();
			System.out.print("������� �Է��ϼ��� : ");
			String birth = DataInput.sc.nextLine();
//		
//		if (phoneNo == null || phoneNo.length() == 0) {
//			throw new Exception("�ݵ�� ��Ȧ�� �Է��ϼ��� ");
//		}
			pi[count++] = new PhoneInfo(name, phoneNo, birth);

		} else if (menu == "y")

		{

			System.out.print("�߰��� �̸� �Է��ϼ��� : ");
			String name = DataInput.sc.nextLine();
			System.out.print("��ȭ��ȣ �Է��ϼ��� : ");
			String phoneNo = DataInput.sc.nextLine();
			System.out.print("������� �Է��ϼ��� : ");
			String birth = DataInput.sc.nextLine();
			System.out.print("� �μ����� �Է��ϼ��� : ");
			String dept = DataInput.sc.nextLine();
			System.out.print("� ��å���� �Է��ϼ��� : ");
			String position = DataInput.sc.nextLine();

//			if (phoneNo == null || phoneNo.length() == 0) {
//				throw new Exception("�ݵ�� ��Ȧ�� �Է��ϼ��� ");
//			}
			pi[count++] = new PhoneInfo(name, phoneNo, birth);
			System.out.println("����Ϸ� ");
		} else if (menu == "z")

		{

			System.out.print("�߰��� �̸� �Է��ϼ��� : ");
			String name = DataInput.sc.nextLine();
			System.out.print("��ȭ��ȣ �Է��ϼ��� : ");
			String phoneNo = DataInput.sc.nextLine();
			System.out.print("������� �Է��ϼ��� : ");
			String birth = DataInput.sc.nextLine();
			System.out.print("� �������� �Է��ϼ��� : ");

			String major = DataInput.sc.nextLine();
			System.out.print("�� �й����� �Է��ϼ��� : ");
			String position = DataInput.sc.nextLine();

//			if (phoneNo == null || phoneNo.length() == 0) {
//				throw new Exception("�ݵ�� ��Ȧ�� �Է��ϼ��� ");
//			}
			pi[count++] = new PhoneInfo(name, phoneNo, birth);
			System.out.println("����Ϸ� ");
		}
	}

	////////////////////////////////////////////////////////

	public void listPhoneInfo() {
		// �迭�� �ִ� ��������ü��θ� ���

		System.out.print("��� ����� �Է��ϼ��� : ");
		String name = DataInput.sc.nextLine();

		// 1.��ü 2. ��â 3.����
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

		System.out.print("�˻��� �̸� �Է��ϼ��� : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];// �߿�!! ��������ü�迭 ����
			if (name.equals(info.getName())) {
				info.show();
				idx = i;
				break;
			}
		}
		if (idx == -1) {
			System.out.println("no here");

			// Ű����� ���� �̸��� �Է¹޾� �ش� ������ ��ü�� ����ϵ���
		}
	}

	public void rePhonInfo() {
		System.out.print("������ �̸� �Է��ϼ��� : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];
			if (name.equals(info.getName())) {
				System.out.print("�ٲ� ��ȭ��ȣ�� �Է��ϼ��� : ");
				String phoneNo = DataInput.sc.nextLine();
				// pi[i].setPhoneNo(phoneNo);
				info.setPhoneNo(phoneNo);
				idx = i;
				System.out.println("�ٲ����ϴ�.");
				break;
			}

		}
		if (idx == -1) {
			System.out.println("no here");
		}

	}

	public void deletePhonInfo() {

		System.out.print("����� ���� �̸� �Է��ϼ��� : ");
		String name = DataInput.sc.nextLine();
		int idx = -1;

		for (int i = 0; i < count; i++) {
			PhoneInfo info = pi[i];
			if (name.equals(info.getName())) {
				// pi[i] = pi[i + 1]; //�����Ŀ� �߰� �Է��� ��½� ������
				// ������͹���
				idx = i;
				break;
			}
		}
		if (idx != -1) {
			for (int i = idx; i < count; i++) {
				pi[i] = pi[i + 1];
			}
			pi[count - 1] = null;// 0���θ����
			count--;// �ϳ����̱�

		} else {
			System.out.println("no here");
		}
	}
}
