package kosta.oop2;

public class CheckingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount ca = 
				new CheckingAccount("222", "�Ϲݰ���", 50000,"222");
		
//		Account ra[] = {new MinusAccount("123","���̳ʽ���",10000, 1000000 )
//						,new Account("123","�Ϲݰ���", 10000)};
//		Account new Account("123","�Ϲݰ���", 10000);

		try {
		
		ca.pay("222", 7000);
		
	}catch(Exception e) {
		e.printStackTrace();
	}
ca.print();



	}}
