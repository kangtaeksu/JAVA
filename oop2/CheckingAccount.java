package kosta.oop2;

public class CheckingAccount extends Account {

	private String cardNo;
	
	public CheckingAccount() {}
	
	public CheckingAccount(String accountNo, String ownename, int balance, String cardNo) {
		super(accountNo, ownename, balance);///////////얘가 부모생성자불러옴
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount)throws Exception{
		
		if(!cardNo.contentEquals(this.cardNo)||getBalance()<amount) {
			throw new Exception("결제 불능");
			
		}
		return withdraw(amount);
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
}
