package kosta.oop2;

public class MinusMain {

	public static void main(String[] args) {
		
		MinusAccount ma = new MinusAccount("333-333", "강택수", 5000, 10000);
		
		
		
		
//		Account ra[] = {new MinusAccount("123","마이너스용",10000, 1000000 )
//				,new MinusAccount("123","일반계좌", 10000)};
//		try {
//			for(int i=0;i<ra.length;i++) {
//			ma.pay("222", 70000);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		ma.withdraw(14999);// 오버로드햇으므로 알아서 자식껄로 호출된다
		ma.print();
	}

}
