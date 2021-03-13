package kosta.data;

import java.io.ObjectInputStream.GetField;
import java.util.*;

public class MapMission {

	public static void main(String[] args) {
		// 이름 점수를 한쌍으로 맵 자료구조 구현
		// 김자바 : 100 강자바 : 50
		// keyset활용한 시험응시자만 출력
		// 점수만 출력 values()의 데이터타입은 컬렉션 => 이터레이터 () 활용
		// 총점과 평균 , 최고 , 최저 collection() max(), min()
		Map<String, Integer> map =
				new HashMap<String, Integer>();
		map.put("강택수", 100);
		map.put("강자바", 90);
		map.put("강씨플", 80);
		
		Set<String> set = map.keySet();
		System.out.println(set);
		
//		Iterator iter = set.iterator();
	
//		while (iter.hasNext()) {
//
//			Map.Entry e = (Map.Entry)iter.next();
//			System.out.println(e.getKey());
//		}
//		Set set = map.keySet();
	
		Collection<Integer>values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		int total = 0;
		
		while (iter.hasNext()) {//너 가지고 있니
			int num = iter.next();
			total += num;
			
		}
		System.out.println(total);
		System.out.println(total/map.size());
		System.out.println(Collections.max(values));
		System.out.println(Collections.min(values));
		
		
	
		
		
		
		
		
		
	}
	

}
