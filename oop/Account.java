package kosta.oop;

public class Account {// ������ ����-> �����ų�����̾���
//������ ����ȭ (���¸� ������)
	// ���¹�ȣ, ������, �ܾ� : ���� ( Ư��) => �������(�ʵ�)
	String accountNo;
	String ownerName;
	int balance;

	//������
	//���Ͼ��� �̸��� ������ Ŭ���� ����
//	public Account() {}
//	public Account(String accountNo, String owneString, int balance)
//	{
//	
//		this.accountNo =accountNo;
//	 this.ownerName = ownerName;
//	 this.balance = balance;    //�����ڱ��ڽ� ��ü
//	 ������� = ��������
//	}
	
	
public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;    //�����ڸ� ����� ���� ->��ü �ʱ�ȭ!!
		//�޸� ���� 
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
		System.out.println("���¹�ȣ�� : "+ accountNo);
		System.out.println("�����ִ� : "+ ownerName);
		System.out.println("�ܾ� : "+ balance);
	}
}
