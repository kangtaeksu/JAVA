package kosta.data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayExam {

	public static void show(List<String> list) {
//			for(int i =0;i<list.size();i++) {
//				System.out.print(list.get(i)+",");
//			}
		Iterator<String> iter = list.iterator();//리스트로 가져온데이터 이터레이터로 변환
		while(iter.hasNext()) {
			System.out.println(iter.next()+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// list를 활용한 키보드로 부터 문자열을 입력받아
		//데이터 추가 삭제 출력을 구현하라
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("1추가 2삭제 3종료");
			String key = sc.nextLine();
			switch (key) {
			case "1":
				System.out.println("추가할 데이터를 입력하세요");
				list.add(sc.nextLine());
				show(list);
				break;
			case "2":
				System.out.println("삭제할 데이터인덱스를 입력하세요");
				sc.nextInt();
//				int n = sc.nextInt();
//				list.remove(n);//이것도가능
				
				int idx = list.indexOf(str2)
						if(idx != -1) {
							list.remove(idx)
						}
				show(list);
				break;
			case "3":
				int num = list.size();
				for(int i=0;i<num;i++) {
				
				String str = list.get(i);
				System.out.println(str);
				
				break;
				}
				
			}
		
		}
		

}}
