package kosta.data;

import java.io.ObjectInputStream.GetField;
import java.util.*;

public class MapMission {

	public static void main(String[] args) {
		// �̸� ������ �ѽ����� �� �ڷᱸ�� ����
		// ���ڹ� : 100 ���ڹ� : 50
		// keysetȰ���� ���������ڸ� ���
		// ������ ��� values()�� ������Ÿ���� �÷��� => ���ͷ����� () Ȱ��
		// ������ ��� , �ְ� , ���� collection() max(), min()
		Map<String, Integer> map =
				new HashMap<String, Integer>();
		map.put("���ü�", 100);
		map.put("���ڹ�", 90);
		map.put("������", 80);
		
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
		
		while (iter.hasNext()) {//�� ������ �ִ�
			int num = iter.next();
			total += num;
			
		}
		System.out.println(total);
		System.out.println(total/map.size());
		System.out.println(Collections.max(values));
		System.out.println(Collections.min(values));
		
		
	
		
		
		
		
		
		
	}
	

}
