package kosta.sort;

import java.util.Random;
import java.util.*;

public class SortExam {

	public static void main(String[] args) {
//최초의 정렬 기준 : comparable => compareTo() 오버라이딩 (정렬기준)
		//정렬기준 변경 : comparator => compare() 오버라이딩 (변경 정렬기준)
		
		Random r = new Random();
		TreeSet<Integer> set =
				new TreeSet<Integer>(new Desending());
		
		for(int i=0;set.size()<6;i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		
		
		
		
	}

}
