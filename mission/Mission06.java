package kosta.mission;

import java.util.Scanner;

public class Mission06 {

//	public static void add(String arr[]) {
//
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		System.out.print("���ڿ� �Է��ϼ��� : ");
//		arr[count++] = sc.nextLine();
//
//	}

	

//	public static void print(String arr[]) {
//
//		
//		System.out.println(Arrays.deepToString(arr));
//
//	}

//	public static void search(String arr[]) {
//		
//		Scanner sc = new Scanner(System.in);
//		String some;
//		System.out.print("�ñ��� ���ڿ��� �Է��ϼ��� : ");
//		some = sc.nextLine();
//		for(int i=0;i<100;i++) {
//			if(arr[i].equals(some)) {
//				System.out.println( "��ġ�� "+ i+ "��°�Դϴ�");
//		}else{
//			System.out.println( "�����ϴ�");
//					
//		}
//		
//		}}

	public static void main(String[] args) {
		// �޴��� �����ؼ� �޴��� ������ �����غ���
		// 1�߰� ����ġ 2 ��½���ġ 3 �˻� 4����
		// String �迭
//		�Է�1������ �迭�� ������ �߰�
//		2�� ��� ������ ���
//		�Է� 3 �ش繮�ڿ��� �ε��� ��� ������ ���ٰ�
//		�Է� 4���� ���α׷����� �� return;
		int count = 0;
		String arr[] = new String[count++];
		Scanner sc = new Scanner(System.in);

		while (true) {
			int chos = 0;
			System.out.print(" �Է� : ");
			chos = sc.nextInt();
			switch (chos) {
			case 1:
			
				System.out.print("���ڿ� �Է��ϼ��� : ");
				String str = sc.nextLine();
				arr[count++] = str;
				break;

			case 2:
				for(int i =0; i<count;i++) {
					System.out.println(arr[i]);
				}
				break;
			case 3:
				System.out.println("�˻� �Է� : ");
				String search = sc.nextLine();
				int idx = -1;
				for(int i =0;i<count;i++) {
					if(arr[i].equals(search)) {
						idx = i;
					break;
					}
				}
				System.out.println((idx+1)+"��°���ֽ��ϴ�");
				break;
			case 4:
				System.out.println("w=����");
				return;

			}
		}
	}

}
