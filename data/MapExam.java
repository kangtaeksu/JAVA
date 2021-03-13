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
		map.put("2", "�λ�");		
		map.put("3", "KT");
		
		System.out.println("����� ������ " + map.size());
		
		if(map.containsValue("�λ�")) {
			map.remove("2");
			
		}
	System.out.println(map.size());
//	System.out.println(map.get("1"));
	
	// map�� ���������� ��ü��� ����ϴ¸޼ҵ嵵����.
	//-> iterate Ȱ�� �׷����� Map->Set->Iterator���� ����ȯ�ؾ���
	
	Set set = map.entrySet();//�ʿ��� �����͸� �̾ƿ��� ���(Ű�� ������)
	Iterator iter = set.iterator();//Ű�������ִ� ���ͷ�����
	
	while(iter.hasNext()) {    //
		Map.Entry<String, String> e =    //inner class �����������̽� 
				(Map.Entry<String, String>)iter.next();
		
		System.out.println(e.getKey()+"     "+ e.getValue());
	}
	//Map.Entry== ("1","NC")    =>�̷��� �ѽ��� Map.Entry��� ��
	
	
	
	}

}
