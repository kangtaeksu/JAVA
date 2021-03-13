package kosta.io;

import java.io.*;

public class CopyExam {

	public static void main(String[] args) {
		// pen.txt - > pen2 .txt : copy
		// file reader : read -> Filewriter : write()
		// 다짜고 실행한담에 패키지 리플레시
		FileReader reader = null;
		FileWriter writer = null;
		char arr[] = new char[100];

		try {
			reader = new FileReader("pen.txt");
			writer = new FileWriter("pen2.txt");

			reader.read(arr);
			writer.write(arr);
			System.out.println("복사완료");

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
