package kosta.sort;

import java.util.Random;
import java.util.*;

public class SortExam {

	public static void main(String[] args) {
//������ ���� ���� : comparable => compareTo() �������̵� (���ı���)
		//���ı��� ���� : comparator => compare() �������̵� (���� ���ı���)
		
		Random r = new Random();
		TreeSet<Integer> set =
				new TreeSet<Integer>(new Desending());
		
		for(int i=0;set.size()<6;i++) {
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		
		
		
		
	}

}
