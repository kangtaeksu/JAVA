package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialMain {

	Member m;

	// ����ȭ �޼���-> ��������
	public void write() {
		m = new Member("���ü�", 26);
		ObjectOutputStream oos = null;
		try {

			oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
			oos.writeObject(m);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				oos.close();
			} catch (Exception e2) {
			}
		}
	}

	// ������ȭ �޼���-> �ҷ��´٤�

	public void read() {

		ObjectInputStream ois = null;
		try {

			ois = new ObjectInputStream(new FileInputStream("object.ser"));
			m = (Member) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ois.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SerialMain sm = new SerialMain();
		
		sm.write();// ����ȭ
		sm.m=null;////////////////////////////m�������ߺ�����
		//�ڹ����ΰ׼� m�� �� ���Ѽ� ���Ͽ� �ִ� ���� �����.
		sm.read();// ������ȭ
		System.out.println(sm.m);
		
	}

}
