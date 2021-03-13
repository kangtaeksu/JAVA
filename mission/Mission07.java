package kosta.mission;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Mission07 {

	public static void main(String[] args) {
		// 국영 수 입력받아 총점과 평균
		// 3명이상의 성적을 입력받고
//출력 국어		영어	수학	총점	평균
		// 전체 성적이
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[2][5];
//		String subject[] = { "국어", "영어", "수학", "총점", "평균" };
		int count = 0;

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(" 성적입력하시오 ");
				arr[i][j] = sc.nextInt();
				arr[i][3] += arr[i][j];
			}
			arr[i][4] = arr[i][3] / 3;
			count++;
		}
		
	
		System.out.println("국어\t영어\t수학\t총점\t평균\t");
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
