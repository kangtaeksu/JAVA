package kosta.mission;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		// ���� �� �Է¹޾� ������ ���
		// 3���̻��� ������ �Է¹ް�
//��� ����		����	����	����	���
		// ��ü ������
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][5];
//		String subject[] = { "����", "����", "����", "����", "���" };
		int count = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" �����Է��Ͻÿ� ");
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j];
			}
			arr[i][4] = arr[i][3] / 3;
			count++;
		}
		
	
		System.out.println("����\t����\t����\t����\t���\t");
		for(int i=0;i<count;i++) {
			for(int j = 0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			Arrays.sort(arr);
			System.out.println();
		
		
//		Arrays.sort(arr, new Comparator<T>() {
//
//			@Override
//			public int compare(T o1, T o2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		});
//		
		}
		
	}

}
