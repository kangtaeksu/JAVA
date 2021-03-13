package kosta.mission;

import java.util.Random;
import java.util.Scanner;

public class Misson05 {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		// ·£´ýÅ¬·¡½º·Î ³­¼ö»ý¼º
		int k = 0;
		int count= 0;
		int n = rd.nextInt(100);// 1~100
		System.out.println(n);		
		
	while(true) {
		do {
			System.out.println("1~100 ¼ýÀÚÀÔ·Â");
			k = sc.nextInt();
		}while(n>100);
		
		count++;
		if(n == k) {
			System.out.println(count+"¹øÂ° ¸Â­Ÿ½À´Ï´Ù.");
			break;
		}else if(k<n) {
			System.out.println("up");
			
		}else if(k>n) {
			System.out.println("down");
			
		}
	}

	}

}
