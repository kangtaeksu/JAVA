package kosta.sort;// Ŭ���������� ���� ���� ����

import java.util.Comparator;

public class Desending implements Comparator<Integer> {


	@Override
	public int compare(Integer o1, Integer o2) {
		//���ο� ���� : ���������� ���� ���ı���
		if(o1<o2) {
			return 1;//�ڸ��ٲ�� �Ǹ� 1
		}else if(o1>o2) {
			return -1;//�ȹٲ㵵�Ǹ� 
			
		}
		return 0;
		
		
	}

}


