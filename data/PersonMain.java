package kosta.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain {

	public static void main(String[] args) {

		List<Person>list = new ArrayList<Person>();
		
		list.add(new Person("강자바",60));
		list.add(new Person("김자바",50));
		list.add(new Person("이자바",20));
		list.add(new Person("박자바",90));
		list.add(new Person("최자바",70));
	
		//Collections.sort(list); //정석 desendinf
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
	//익명내부클래스로 만들어보기 오름차순
	
		System.out.println(list);
		
	}

}
