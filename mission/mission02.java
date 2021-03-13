package kosta.mission;

import java.util.Scanner;


public class mission02 {
	
	
	public static int sum(int n1, int n2, int n3) {
		int sum = n1+n2+n3;
		return sum;
	}
	
	
	public static int aver(int total) {
		int aver = total/3;
		return aver;
	}
	
	public static void main(String[] args) {
//		int eng = 93;
//		int math = 58;
//		int kor = 72;
//		int sum = eng + math + kor;
//		float average =(float)sum / 3;
//		int average2 = (int)sum/3;
//		System.out.println(sum);
//		System.out.println(average);
//		System.out.println(average2);

		Scanner sc = new Scanner(System.in);

		int kor, eng, mat;
		int sum = 0;
		int aver = 0;
//
		System.out.print("±¹¾î : ");
		kor = sc.nextInt();
		System.out.print("¿µ¾î : ");
		eng = sc.nextInt();
		System.out.print("¼öÇÐ : ");
		mat = sc.nextInt();
//
//		sum = kor + eng + mat;
//		aver = (int) (sum / 3.0);
//
//		System.out.println("ÃÑÁ¡ : " + sum);
//		System.out.println("Æò±Õ : " + aver);
		
		sum = sum(kor, eng, mat);
		
		aver = aver(sum);
		
		System.out.println(sum+","+ aver);
		
	}

}
