package kosta.oop2;

public class CheckingAccount extends Account {

	private String cardNo;
	
	public CheckingAccount() {}
	
	public CheckingAccount(String accountNo, String ownename, int balance, String cardNo) {
		super(accountNo, ownename, balance);///////////�갡 �θ�����ںҷ���
		this.cardNo = cardNo;
	}

	public int pay(String cardNo, int amount)throws Exception{
		
		if(!cardNo.contentEquals(this.cardNo)||getBalance()<amount) {
			throw new Exception("���� �Ҵ�");
			
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
