package kosta.mission;

import java.util.Scanner;

public class Mission06 {

//	public static void add(String arr[]) {
//
//		Scanner sc = new Scanner(System.in);
//		int count = 0;
//		System.out.print("문자열 입력하세요 : ");
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
//		System.out.print("궁금한 문자열을 입력하세요 : ");
//		some = sc.nextLine();
//		for(int i=0;i<100;i++) {
//			if(arr[i].equals(some)) {
//				System.out.println( "위치는 "+ i+ "번째입니다");
//		}else{
//			System.out.println( "없습니다");
//					
//		}
//		
//		}}

	public static void main(String[] args) {
		// 메뉴를 선택해서 메뉴의 명형을 실행해보자
		// 1추가 스위치 2 출력스위치 3 검색 4종료
		// String 배열
//		입력1누르면 배열에 데이터 추가
//		2번 모든 데이터 출력
//		입력 3 해당문자열의 인덱스 출력 없으면 없다고
//		입력 4번은 프로그램종료 즉 return;
		int count = 0;
		String arr[] = new String[count++];
		Scanner sc = new Scanner(System.in);

		while (true) {
			int chos = 0;
			System.out.print(" 입력 : ");
			chos = sc.nextInt();
			switch (chos) {
			case 1:
			
				System.out.print("문자열 입력하세요 : ");
				String str = sc.nextLine();
				arr[count++] = str;
				break;

			case 2:
				for(int i =0; i<count;i++) {
					System.out.println(arr[i]);
				}
				break;
			case 3:
				System.out.println("검색 입력 : ");
				String search = sc.nextLine();
				int idx = -1;
				for(int i =0;i<count;i++) {
					if(arr[i].equals(search)) {
						idx = i;
					break;
					}
				}
				System.out.println((idx+1)+"번째에있습니다");
				break;
			case 4:
				System.out.println("w=종료");
				return;

			}
		}
	}

}
