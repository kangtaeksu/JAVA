package kosta.oop2;

public class MinusMain {

	public static void main(String[] args) {
		
		MinusAccount ma = new MinusAccount("333-333", "���ü�", 5000, 10000);
		
		
		
		
//		Account ra[] = {new MinusAccount("123","���̳ʽ���",10000, 1000000 )
//				,new MinusAccount("123","�Ϲݰ���", 10000)};
//		try {
//			for(int i=0;i<ra.length;i++) {
//			ma.pay("222", 70000);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		ma.withdraw(14999);// �����ε������Ƿ� �˾Ƽ� �ڽĲ��� ȣ��ȴ�
		ma.print();
	}

}
