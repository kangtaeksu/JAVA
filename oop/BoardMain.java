package kosta.oop;

public class BoardMain {

	public static void main(String[] args) {

	Board arr[] = {
			new Board(1, "�ȳ�", "���ü�", "�׷���"),
			new Board(2, "�ڽ�Ÿ", "���ü�", "�ݺ���")
	};
		
		System.out.println("�۹�ȣ\t������\t�ۼ����̸�\t�۳���");
		//Board bd1 = new Board(1, "�ȳ�", "���ü�", "�׷���");
		//Board bd2 = new Board(2, "����", "���ü�", "�ݺ���");

		// =>�̰� �迭�� �ִ´ٸ�?
		for(int i=0;i<arr.length;i++) {
			arr[i].print();
		}

	}

}
