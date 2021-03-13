package kosta.mission;

import java.util.Scanner;

public class Galluggg {

	public static int deep(int a, int b, int day) {
		
		if(b>a) {
			return day;
		}else {
			return deep(a*2, b*3,day+1);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	StringBuffer sb =new StringBuffer();
	System.out.println("Ω√¿€!");
	int t =sc.nextInt();
	
	for(int i=0;i<t;i++) {
		
		sb.append("#"+ (i+1+" "+ deep(sc.nextInt(),sc.nextInt(),0) ));
		sb.append("\n");
	}
	System.out.println(sb);
	}

}
