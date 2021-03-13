package kosta.oop2;

public class Account {// 메인이 없다-> 실행시킬생각이없다
//데이터 구조화 (상태를 변수로)
	// 계좌번호, 계좌주, 잔액 : 상태 ( 특성) => 멤버변수(필드)
	private String accountNo;
	private String ownerName;
	private int balance;

	// 생성자
	// 리턴없음 이름은 무조건 클래스 따라감
	public Account() {
	} // 슈퍼안쓰면 자식이 부모 디폴트 생성자 불러옴


	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance; // 현재자기자신 객체 참조변수
//	 멤버변수 = 지역변수               //this()=> 자신의 생성자에서 다른생성자 호출
	}
	// super은 부모가 호출될때 최우선으로 부르게됨
	// ex

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
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
		System.out.println("계좌번호는 : " + accountNo);
		System.out.println("계좌주는 : " + ownerName);
		System.out.println("잔액 : " + balance);
	}
}
