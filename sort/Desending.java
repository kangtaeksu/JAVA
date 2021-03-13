package kosta.sort;// 클래스선언을 통한 정렬 생성

import java.util.Comparator;

public class Desending implements Comparator<Integer> {


	@Override
	public int compare(Integer o1, Integer o2) {
		//새로운 정렬 : 내림차순에 대한 정렬기준
		if(o1<o2) {
			return 1;//자리바꿔야 되면 1
		}else if(o1>o2) {
			return -1;//안바꿔도되면 
			
		}
		return 0;
		
		
	}

}


