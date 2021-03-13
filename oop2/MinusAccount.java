package kosta.oop2;

public class MinusAccount extends Account {

	private int creditLine;

	public MinusAccount() {
	}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	@Override // 내가하고싶은대로 입맛에 맞게 덮어쓰기 //부모가 예외안쓰면 자식도 못씀
	public int withdraw(int amount) { // 예외뿐아니라 첫줄은 같아야함(파라미터)
		if (getBalance() + creditLine < amount) {
			return 0;
		}
		int n = getBalance();
		setBalance(n - amount);
		return amount;
		// 반환값필요없으면 지운거나 수정
		
	}
//마이너스 한도금액

	

}
