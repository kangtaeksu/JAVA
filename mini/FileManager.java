package kosta.mini;

import java.io.*;

import kosta.io.CopyUtil;

public class FileManager {

	String parents;

	static void show(File file) { // 파일 출력

		File[] files = file.listFiles();

		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				System.out.println();
				System.out.println("**" + files[i].getName() + "dir*");
				show(files[i]);
			} else {
				System.out.println(" -" + files[i].getName());
			}
		}
	}

	public static void move(File file) { /// 파일 경로 이동

		File[] fileMove = file.listFiles();
		
		for (int i = 0; i < fileMove.length; i++) {
			if (fileMove[i].exists()) {
				System.out.println();
				System.out.println("**" + fileMove[i].getName() + "dir*");
				show(fileMove[i]);
			} else {
				System.out.println(" -" + fileMove[i].getName());
			}
		}
	}

	public static void getParent(File file) {
		
		String path = "";
		String filename = "";
		
		path = file.getAbsolutePath().toString();
		filename = file.getName();
		
		System.out.println(path);
		System.out.println(filename);

	}
}