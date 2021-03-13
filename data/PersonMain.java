package kosta.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {

		List<Person>list = new ArrayList<Person>();
		
		list.add(new Person("���ڹ�",60));
		list.add(new Person("���ڹ�",50));
		list.add(new Person("���ڹ�",20));
		list.add(new Person("���ڹ�",90));
		list.add(new Person("���ڹ�",70));
	
		//Collections.sort(list); //���� desendinf
	Collections.sort(list, new Comparator<Person>() {

		@Override
		public int compare(Person o1, Person o2) {
			if(o1.getName().compareTo(o2.getName())>0){
				return 1;
			}else if(o1.getName().compareTo(o2.getName())<0){
				return -1;
		}
			return 0;}
	});
	//�͸���Ŭ������ ������ ��������
	
		System.out.println(list);
		
	}

}
