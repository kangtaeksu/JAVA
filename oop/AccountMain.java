package kosta.oop;


public class AccountMain {

	public static void main(String[] args) {
//		Account account;// 레퍼런스 변수 선언
//		Account account2;// 레퍼런스 변수 선언
		// 새로생성된 객체의 주소를 보관하기위한변수
		
		//객체안의 생성자!!를 확인
		
	
		Account arr[] = { new Account("1111-1111", "홍길동", 10000), new Account("2222-2222", "강택수", 99000) };
//		account = new Account("1111-1111", "홍길동", 10000);
		// 새로운 객체생성(메모리 할당)
//		account2 = new Account("2222-2222", "강택수", 99000);
		// 새로운 객체생성(메모리 할당)
		// = account변수: 주소값을 갖는다 = 인스턴스(객체생성)변수
		// = 객체라고도 부름(정확히따지면 아님)
		// 추상클래스는 객체생성이 금지되어있다=인스턴스화가 금지되었다

		// 객체초기화-> 모든주소는 account이 갖고있다.->account.ㅇㅇ으로 접근
//		account.accountNo = "1111-11111";
//		account.ownerName = "강택수";
//		account.balance = 100000;
		// 객체 매서드 호출
//		account.deposit(5000);
//		account.print();
		// 인출하기 매서드를 통해서 인출금액, 잔액의 정보를 출력하라

//		int re = account.withdraw(10000);
//		System.out.println(" 인출금액은 : " + re);
//		System.out.println(" 잔액은 : " + account.balance);

		for (Account account : arr) { // 향상된 포문
			account.deposit(5000);

			account.print();
		}

	}

}
