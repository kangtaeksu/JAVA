package kosta.phone;


public class PhoneInfoMain {

	public static void main(String[] args) {

		Manager m = new Manager();

		// ��ü�� �����ؾ� �޼��带 �ҷ���
		// ���⼭ ����Ǵϱ� ����
		
		//����ƽ�� �޸𸮸� �ѹ������⶧���� ���뺯��ó�������ִ�.
		//����� final static = �빮�ڷξ�, Ŭ���������� ȣ
		while (true) {

			System.out.print("��� ��ȣ�� �Է��ϼ��� : ");
			String menu = DataInput.sc.nextLine();
			switch (menu) {
			case "1":
				//try {
					m.addPhoneInfo();
					System.out.println("����Ϸ� ");
			//	} 
//				catch (Exception e) {
//					e.printStackTrace();
//				}
				break;
			case "2":
				m.listPhoneInfo();
				break;
			case "3":
				m.searchPhonInfo();
				break;
			case "4":
				m.rePhonInfo();
				break;
			case "5":
				m.deletePhonInfo();
				break;
			case "6":
		//		��̸���Ʈ�� (�������� �ø��� �������� ������ Ŭ������
		//				�ø��� ���������ؾߴ� ���ڿ� Ŭ�������� �ٵǾ���)
		//���Ͽ�  ������Ʈ�� �ƿ�ǲ��Ʈ��
				//������Ʈ ��ǲ��Ʈ�� 
				
				
				
			case "7":
				
			case "8":	
				
				System.out.println("����");
				return;

			}

			// Ű�����Է����� ����ġ
		}
	}

}
