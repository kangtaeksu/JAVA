package kosta.exception;

public class Exam_exception {

	public static void add() throws Exception {

		// throw Exception ����ȸ���ϴ� �� ���ο��� �˾Ƽ���
		int a = 10;
		int b = 0;

		a = a / b;
	}

	public static void multi() throws Exception {// �߶Ծ����ٴ�

		int a = 10;
		int b = 10;
		if (a == b) {
			// �����̻�Ȳ�� �ȴٸ�? �ڹٹ����� �����¾�����
			// �������� ���ܻ�Ȳ �߻���Ŵ
			throw new Exception("����������");
		}
	}

	public static void main(String[] args) {

		System.out.println("1");
		try {
			//add();
			multi();
			System.out.println("2");// ���ܹ߻��ϸ� �н�
		} catch (Exception e) {// ���ܹ߻��ÿ��� �ߵ�
			System.out.println("3");
			System.out.println(e.getMessage());
//		e.printStackTrace();//���� ����
		} finally {// ������ �ؾ����� ���߿� close���Բ� Ȱ��
			System.out.println("4");

		}
		System.out.println("5");
	}
////////////////////////
}
