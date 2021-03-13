package kosta.io;

import java.io.File;

public class FileMission {
	static void show(File file) {    //

		File[] files = file.listFiles();
		
		for(int i=0; i<list.length;i++) {
			if(list[i].isDirectory()) {
				System.out.println();
				System.out.println("**"+ list[i].getName()+"dir*");
				show(list[i]);
			}else {
				System.out.println(" -"+ list[i].getName());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path = "C:\\Users\\KOSTA\\Downloads\\중간테스트\\캡처.png";

		show(new File(path));
		
	}

}
