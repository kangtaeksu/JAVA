package kosta.io;

import java.io.*;

public class CopyExam {

	public static void main(String[] args) {
		// pen.txt - > pen2 .txt : copy
		// file reader : read -> Filewriter : write()
		// ��¥�� �����Ѵ㿡 ��Ű�� ���÷���
		FileReader reader = null;
		FileWriter writer = null;
		char arr[] = new char[100];

		try {
			reader = new FileReader("pen.txt");
			writer = new FileWriter("pen2.txt");

			reader.read(arr);
			writer.write(arr);
			System.out.println("����Ϸ�");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
			
				reader.close();
				writer.close();
			} catch (Exception e2) {
			}
		}

	}

}
