package kosta.mini;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		File file = new File(sc.nextLine());   //���� ��� �Է�
		
		String source = "C:\\Users\\KOSTA\\Downloads\\����PPT";
		String dest = "C:\\Users\\KOSTA\\newDirec";
		
		String Parents;
		String menu = "";

		while (true) {
			if ("ls\\\\p{space}C:\\\\\\\\".equals(sc.nextLine())) {// ���ϸ�����
				
				FileManager.show(file);
				
			} else if ("cd\\p{space}C:\\\\".equals(sc.nextLine())) {// ���丮 �̵�

				FileManager.move(file);
				
			} else if ("cd\\.\\.".equals(sc.nextLine())) {// �θ���丮 �̵�
				
				FileManager.getParent(file);
				
				File f = new File(sc.nextLine());
				String path = "";
				String filename = "";
				
				
				
			} else if ("mkdir\\p{space}\\w*".equals(sc.nextLine())) {// ���ο���丮 ����

		
				CopyUtil.copyDirectory(source, dest);
				
			} else if ("cp\\p{space}/\\w*".equals(sc.nextLine())) {// ��� �ش� ���� ����

				CopyUtil.copyFile(source, dest);

			}

		}
	}
}