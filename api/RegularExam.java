package kosta.api;

import java.util.Scanner;

public class RegularExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("input : ");
//		String str = sc.nextLine();
//		if(str.matches(".*abc.*")) {
//			
//			System.out.println("��Ī");
//		}else {
//			System.out.println(" no match");
//		}
//		
		// ���ڸ� 3�ڸ�
//		if (str.matches("[\\d{3}]")) {
//
//			System.out.println("��Ī");
//		} else {
//			System.out.println(" no match");
//		}
//
//		if (str.matches("[\\w{5,}]")) {
//
//			System.out.println("��Ī");
//		} else {
//			System.out.println(" no match");
//		}
//		
//		if (str.matches("[��-�R]{3-5}")) {
//
//			System.out.println("��Ī");
//		} else {
//			System.out.println(" no match");

		// dolsam77@nate.com =>
		// ���� �Ⱦ�
		// @ �ʼ� , �����°� �߰��Ǿ�ȵ�

//		if (str.matches("^[\\D]\\w+@\\w+\\.\\w{2,3}$")) {
//
//			System.out.println("��Ī");
//		
//		} else {
//			System.out.println("���Ī");
//
//		}
		
		
	//	\\S : ���鹮�ھƴѰ�
		//�̹��� ���� ������ ����ǥ�������� abc.jpg
		//�Ҵ빮�� �������� (?!) �Ҵ빮�� ���о���
//		if (str.matches("^[\\w]+\\.(?i)(jpg|png|gif)$")) {
//ȸ�����Խ� �������� Ȱ��
//			
//			System.out.println("�̹���");
//		
//		} else {
//			System.out.println("�̹����ƴ�");
//
//		}
//	}
	String message ="32434234SW ������ ó��� �ٹ�7676�� ������ �������� �����ؾ� ������=���ý��������� ���� = �ڱ��� ������� 23�� ����Ʈ����(SW) �߽ɻ�ȸ�� �����ϱ� ���ؼ��� SW�� ��ġ�� ����� �����ϴ� ���� ����ؾ� �Ѵٰ� ���ߴ�. �� ������� �̳� ���� �Ǳ� ��ũ��븮���� ���� 'SW �߽ɻ�ȸ ���� ��������ȸ'���� �츮���� IT �������� ���� �����ϱ� ���ؼ��� SW �о��� ����� Ȯ���� �ñ��� ������� �̰��� ������. �� ������� ���忡�� SW�� ��ġ�� ����� �������� �ʾ� SW ������� ���ͼ��� ��ȭ�ǰ�, ����� ���簡 ���Ե��� �ʴ� �Ǽ�ȯ�� ���� ����� �Ѵٸ� �����ι��� SW �����ֱ� ����� �ΰ����� Ȯ��� â�Ǽ��� ����� ������ ���� �޴� ȯ���� ������ �������� ����� ���̶�� ����ߴ�.  �̾� �׵��� ���� ����ȭ����� ������ �ΰ� SW ������ �����Ų�ٴ� ������ �־��µ� �ΰ��� ����� ��������� ���� ���߹� ������ �ؾ� �� ���ΰ� ������ �ΰ������� �����Ű�� ���� �־�� �� �� ���̶�� �ΰ����忡 ��ġ�� ������ ������ ���ϴ� �� ���� ����ȭ��� ���������� ������ �ʿ䰡 �ִٰ� �����ߴ�.  �� ������� �� SW �������� ó��� �ٹ����ǵ� ������ �������� ������ �ʿ䰡 �ִٸ� SW �����ڰ� '���� ����'�� �� �ְ��� ������� ���Եǰ� �̵��� SW ��� ������ �̲����, �׷��� ����Ʈ���� �����ڵ��� ó�찡 ���� �����Ǵ� ����ȯ ������ ����� ������ �ϰڴٰ� �����ߴ�.  Ư�� �ڶ󳪴� �̷����뿡 ���� SW ������ �������� �߿��ϴٸ� SW �߽ɻ�ȸ�� �ֿ��� �� �̷� ���밡 '��ǻ���� ���'�� �⺻�Ҿ����� ���� �� �ֵ��� �ʡ��ߵ��б��������� SW������ ��ȭ�ؾ� �Ѵٰ� ���ߴ�.";
	String data[] = {
			"bat", "bba", "bbg", "bonus",
			"CA", "ca", "c232", "car",
			"date", "dic", "diraaa"
	};
	
	System.out.println(message);
	String result = message.replaceAll("SW", "����Ʈ����");
	System.out.println(result);//�ϳ��� �ٲٰ� ������ replace
	
	String remov = message.replaceAll("\\d", "");
	
	System.out.println(remov);
	
	}
}
