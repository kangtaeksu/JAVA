package kosta.data;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		
		Map<String, String>map =
				new HashMap<String, String>();
		map.put("1", "NC")	;	
		map.put("2", "두산");		
		map.put("3", "KT");
		
		System.out.println("요소의 사이즈 " + map.size());
		
		if(map.containsValue("두산")) {
			map.remove("2");
			
		}
	System.out.println(map.size());
//	System.out.println(map.get("1"));
	
	// map은 순서가없고 전체목록 출력하는메소드도없다.
	//-> iterate 활용 그러러면 Map->Set->Iterator으로 형변환해야함
	
	Set set = map.entrySet();//맵에서 데이터를 뽑아오는 방식(키와 밸류모두)
	Iterator iter = set.iterator();//키밸류모두있는 이터레이터
	
	while(iter.hasNext()) {    //
		Map.Entry<String, String> e =    //inner class 내부인터페이스 
				(Map.Entry<String, String>)iter.next();
		
		System.out.println(e.getKey()+"     "+ e.getValue());
	}
	//Map.Entry== ("1","NC")    =>이렇게 한쌍을 Map.Entry라고 함
	
	
	
	}

}
