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
		Iterator<String> iter = list.iterator();//����Ʈ�� �����µ����� ���ͷ����ͷ� ��ȯ
		while(iter.hasNext()) {
			System.out.println(iter.next()+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// list�� Ȱ���� Ű����� ���� ���ڿ��� �Է¹޾�
		//������ �߰� ���� ����� �����϶�
		LinkedList<String> list = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("1�߰� 2���� 3����");
			String key = sc.nextLine();
			switch (key) {
			case "1":
				System.out.println("�߰��� �����͸� �Է��ϼ���");
				list.add(sc.nextLine());
				show(list);
				break;
			case "2":
				System.out.println("������ �������ε����� �Է��ϼ���");
				sc.nextInt();
//				int n = sc.nextInt();
//				list.remove(n);//�̰͵�����
				
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
