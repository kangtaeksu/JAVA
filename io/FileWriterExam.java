package kosta.io;

import java.io.*;
import java.util.Scanner;

public class FileWriterExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ű����κ��� ���ڿ��Է¹޾� ���Ͽ� ���� ����
		// Q������ ���Ͼ��� ����
		FileWriter writer = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("write your story");
		String str = "";
		String pen = "";

		while (!(str = sc.nextLine()).equals("q")) {
			pen += str;
			pen += "\n";
		}

		try {
///////////////////////////////

			writer = new FileWriter("pen3.txt");

			writer.write(pen);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();

			} catch (Exception e2) {
			}
		}
	}

}
