package kosta.io;

import java.io.FileReader;
import java.util.Arrays;

public class FileReaderExam {

	public static void main(String[] args) {
		//파일에 문자데이터를 읽기 위함
		FileReader reader = null; //초기화먼저
		char arr[] = new char[10]; //한번에 10자씩읽겠다.
		
		
		
		//한번에 10문자씩 배열로 
		try {
			reader = new FileReader("pen.txt");

			
			while(true) {
				Arrays.fill(arr, ' ');
				int data = reader.read(arr);
				if(data ==-1) {
					break;
				}
				System.out.println(arr);
			}
			
			
			//한문자씩
//			while(true) {
//				int data= reader.read();
//				if(data ==-1) {
//					break;
//				}
//			System.out.print((char)data);
//			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				reader.close();
			} catch (Exception e2) {}
		}
		
	}

}
