package kosta.oop;


public class AccountMain {

	public static void main(String[] args) {
//		Account account;// ���۷��� ���� ����
//		Account account2;// ���۷��� ���� ����
		// ���λ����� ��ü�� �ּҸ� �����ϱ����Ѻ���
		
		//��ü���� ������!!�� Ȯ��
		
	
		Account arr[] = { new Account("1111-1111", "ȫ�浿", 10000), new Account("2222-2222", "���ü�", 99000) };
//		account = new Account("1111-1111", "ȫ�浿", 10000);
		// ���ο� ��ü����(�޸� �Ҵ�)
//		account2 = new Account("2222-2222", "���ü�", 99000);
		// ���ο� ��ü����(�޸� �Ҵ�)
		// = account����: �ּҰ��� ���´� = �ν��Ͻ�(��ü����)����
		// = ��ü��� �θ�(��Ȯ�������� �ƴ�)
		// �߻�Ŭ������ ��ü������ �����Ǿ��ִ�=�ν��Ͻ�ȭ�� �����Ǿ���

		// ��ü�ʱ�ȭ-> ����ּҴ� account�� �����ִ�.->account.�������� ����
//		account.accountNo = "1111-11111";
//		account.ownerName = "���ü�";
//		account.balance = 100000;
		// ��ü �ż��� ȣ��
//		account.deposit(5000);
//		account.print();
		// �����ϱ� �ż��带 ���ؼ� ����ݾ�, �ܾ��� ������ ����϶�

//		int re = account.withdraw(10000);
//		System.out.println(" ����ݾ��� : " + re);
//		System.out.println(" �ܾ��� : " + account.balance);

		for (Account account : arr) { // ���� ����
			account.deposit(5000);

			account.print();
		}

	}

}
