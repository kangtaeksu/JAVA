package kosta.thread2;

public class Main {

	public static void main(String[] args) {
		//����� ������.
		//�������� ����ڰ� ���� ��θ� ���� ��ݾ��� �����Ҷ����� ����ϵ��� �Ѵ�.
		//�ѱ�αݾ��� ��½� : 100000(��Ȯ��)
		
		DonaManager m = new DonaManager();
		Dona d = new Dona();
		
		Dona d1 = new Dona(m,d.getMoney());
		Dona d2 = new Dona(m,d.getMoney());
		Dona d3 = new Dona(m,d.getMoney());
	
	
		d1.start();
		d2.start();
		d3.start();
	}

}
