package kosta.oop;

public class Account {// 메인이 없다-> 실행시킬생각이없다
//데이터 구조화 (상태를 변수로)
	// 계좌번호, 계좌주, 잔액 : 상태 ( 특성) => 멤버변수(필드)
	String accountNo;
	String ownerName;
	int balance;

	//생성자
	//리턴없음 이름은 무조건 클래스 따라감
//	public Account() {}
//	public Account(String accountNo, String owneString, int balance)
//	{
//	
//		this.accountNo =accountNo;
//	 this.ownerName = ownerName;
//	 this.balance = balance;    //현재자기자신 객체
//	 멤버변수 = 지역변수
//	}
	
	
public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;    //생성자를 만드는 이유 ->객체 초기화!!
		//메모리 관리 
	}
//멤버변수는 초기화를 하지 않는다...
//공통된 기능을 구현해야함 -> 즉 행동(기능)-> 멤버 메소드(오퍼레이션)
//1.입금하다  	2.출금하다. 	3.계좌정보출력하기
//메소드 파라미터(쌀로)와 리턴(떡을 만들기)(탈출조건) 가장유의

	public void deposit(int amount) {
		balance += amount;
	}

	public int withdraw(int amount) {
		if (balance < amount) {
			return 0;
		} else {
			balance -= amount;
			return amount;
			
		}
	}
	
	public void print() {
		System.out.println("계좌번호는 : "+ accountNo);
		System.out.println("계좌주는 : "+ ownerName);
		System.out.println("잔액 : "+ balance);
	}
}
