package kosta.oop2;

public class Account {// ������ ����-> �����ų�����̾���
//������ ����ȭ (���¸� ������)
	// ���¹�ȣ, ������, �ܾ� : ���� ( Ư��) => �������(�ʵ�)
	private String accountNo;
	private String ownerName;
	private int balance;

	// ������
	// ���Ͼ��� �̸��� ������ Ŭ���� ����
	public Account() {
	} // ���۾Ⱦ��� �ڽ��� �θ� ����Ʈ ������ �ҷ���


	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance; // �����ڱ��ڽ� ��ü ��������
//	 ������� = ��������               //this()=> �ڽ��� �����ڿ��� �ٸ������� ȣ��
	}
	// super�� �θ� ȣ��ɶ� �ֿ켱���� �θ��Ե�
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

//��������� �ʱ�ȭ�� ���� �ʴ´�...
//����� ����� �����ؾ��� -> �� �ൿ(���)-> ��� �޼ҵ�(���۷��̼�)
//1.�Ա��ϴ�  	2.����ϴ�. 	3.������������ϱ�
//�޼ҵ� �Ķ����(�ҷ�)�� ����(���� �����)(Ż������) ��������

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
		System.out.println("���¹�ȣ�� : " + accountNo);
		System.out.println("�����ִ� : " + ownerName);
		System.out.println("�ܾ� : " + balance);
	}
}
