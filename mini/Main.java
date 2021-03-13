package kosta.mini;

import java.io.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		File file = new File(sc.nextLine());   //파일 경로 입력
		
		String source = "C:\\Users\\KOSTA\\Downloads\\교재PPT";
		String dest = "C:\\Users\\KOSTA\\newDirec";
		
		String Parents;
		String menu = "";

		while (true) {
			if ("ls\\\\p{space}C:\\\\\\\\".equals(sc.nextLine())) {// 파일목록출력
				
				FileManager.show(file);
				
			} else if ("cd\\p{space}C:\\\\".equals(sc.nextLine())) {// 디렉토리 이동

				FileManager.move(file);
				
			} else if ("cd\\.\\.".equals(sc.nextLine())) {// 부모디렉토리 이동
				
				FileManager.getParent(file);
				
				File f = new File(sc.nextLine());
				String path = "";
				String filename = "";
				
				
				
			} else if ("mkdir\\p{space}\\w*".equals(sc.nextLine())) {// 새로운디렉토리 생성

		
				CopyUtil.copyDirectory(source, dest);
				
			} else if ("cp\\p{space}/\\w*".equals(sc.nextLine())) {// 모든 해당 파일 복사

				CopyUtil.copyFile(source, dest);

			}

		}
	}
}