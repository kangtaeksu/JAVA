package kosta.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialMain {

	Member m;

	// 직렬화 메서드-> 내보낸다
	public void write() {
		m = new Member("강택수", 26);
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

	// 역직렬화 메서드-> 불러온다ㅣ

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
		
		sm.write();// 직렬화
		sm.m=null;////////////////////////////m데이터중복방지
		//자바프로겜속 m을 널 시켜서 파일에 있는 엠만 남긴다.
		sm.read();// 역직렬화
		System.out.println(sm.m);
		
	}

}
