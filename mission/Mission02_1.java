package kosta.mission;

import java.util.Scanner;

public class Mission02_1 {
//�����޼ҵ�
	public static void sum(int arr[]) {
		
		for(int i=0;i<3;i++) {
			arr[3] +=arr[i];
		}
	}
	
	//��ո޼ҵ�
	public static void aver(int arr[]) {
		
		arr[4]=arr[3]/3;
	}
	
	//��¸޼ҵ�
	public static void print(int arr[]) {
		
		System.out.println("����\t����\t����\t����\t���");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}
	
	public static void main(String[] args) {

		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.print(" ���� �Է��Ͻÿ� : ");
		arr[0] = sc.nextInt();
		System.out.print(" ���� �Է��Ͻÿ� : ");
		arr[1] = sc.nextInt();
		System.out.print(" ���� �Է��Ͻÿ� : ");
		arr[2] = sc.nextInt();

//		arr[3] = arr[0] + arr[1] + arr[2];
//		arr[4] = arr[3] / 3;

		sum(arr);
		aver(arr);
		print(arr);

	}

}
