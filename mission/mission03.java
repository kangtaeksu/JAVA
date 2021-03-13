package kosta.mission;

import java.util.Scanner;

public class mission03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("5ㅈ리 정수 입력 : ");
	
	int num = sc.nextInt();
	int even =0;
	int odd = 0;
	
	even += (num/10000%2 == 0)? 1:0;
	even += (num/1000%10%2 == 0)? 1:0;
	even += (num/100%10%2 == 0)? 1:0;
	even += (num/10%10%2 == 0)? 1:0;
	even += (num%2 == 0)? 1:0;
	odd = 5 - even;
	
	System.out.println(even);
	System.out.println(odd);
	
	
	}

}
