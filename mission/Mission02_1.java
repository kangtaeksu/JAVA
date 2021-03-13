package kosta.mission;

import java.util.Scanner;

public class Mission02_1 {
//총점메소드
	public static void sum(int arr[]) {
		
		for(int i=0;i<3;i++) {
			arr[3] +=arr[i];
		}
	}
	
	//평균메소드
	public static void aver(int arr[]) {
		
		arr[4]=arr[3]/3;
	}
	
	//출력메소드
	public static void print(int arr[]) {
		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"\t");
	}
	
	public static void main(String[] args) {

		int arr[] = new int[5];

		Scanner sc = new Scanner(System.in);

		System.out.print(" 국어 입력하시오 : ");
		arr[0] = sc.nextInt();
		System.out.print(" 영어 입력하시오 : ");
		arr[1] = sc.nextInt();
		System.out.print(" 수학 입력하시오 : ");
		arr[2] = sc.nextInt();

//		arr[3] = arr[0] + arr[1] + arr[2];
//		arr[4] = arr[3] / 3;

		sum(arr);
		aver(arr);
		print(arr);

	}

}
