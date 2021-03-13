package kosta.oop2;

public class MinusAccount extends Account {

	private int creditLine;

	public MinusAccount() {
	}

	public MinusAccount(String accountNo, String ownerName, int balance, int creditLine) {
		super(accountNo, ownerName, balance);
		this.creditLine = creditLine;
	}

	@Override // �����ϰ������� �Ը��� �°� ����� //�θ� ���ܾȾ��� �ڽĵ� ����
	public int withdraw(int amount) { // ���ܻӾƴ϶� ù���� ���ƾ���(�Ķ����)
		if (getBalance() + creditLine < amount) {
			return 0;
		}
		int n = getBalance();
		setBalance(n - amount);
		return amount;
		// ��ȯ���ʿ������ ����ų� ����
		
	}
//���̳ʽ� �ѵ��ݾ�

	

}
