package kosta.video;

public class VideoMain {

	public static void main(String[] args) {
//		Video v1 = new Video("1","�����", "�۰�ȣ");
//		Video v2=new Video("2","�����", "��Ͻ�Ÿũ");
//		Video v3 =new Video("3","�׳�", "�������");

		Video vrr[] = { new Video("1", "�����", "�۰�ȣ"), new Video("2", "�����", "��Ͻ�Ÿũ"), new Video("3", "�׳�", "�������") };
		
		Generalmem arr[] = { new Generalmem("1", "���ü�", "ȭ����"),
							 new Specialmem("2", "�ڹٸ�", "��õ��", 100)// �갡 �ڽ��̴ϱ� �θ�ؿ�
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i].rentalService(vrr[i]);
			arr[i].printMember();//=> �갡 �����س����ִ��� : �ڹ��� ���⼺
			//�Ӥ����� ����ȯ�ϴ� ���� ����� ���(�ڽ�)�� ������ �޼ҵ�� Ȱ�����
			Specialmem sp = (Specialmem)arr[1];
				
			sp.getBonus();
			//�ڽ� , �θ� ���� �ڽŵ��� ����Ʈ �޼ҵ带Ȱ���Ѵ�.
		}

//		gm.rentalService(v1);
//		sm.rentalService(v2);
//		gm.printMember();
//		sm.printMember();
//		

	}

}
