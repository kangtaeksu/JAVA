package kosta.io;

import java.io.FileReader;
import java.util.Arrays;

public class FileReaderExam {

	public static void main(String[] args) {
		//���Ͽ� ���ڵ����͸� �б� ����
		FileReader reader = null; //�ʱ�ȭ����
		char arr[] = new char[10]; //�ѹ��� 10�ھ��аڴ�.
		
		
		
		//�ѹ��� 10���ھ� �迭�� 
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
			
			
			//�ѹ��ھ�
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
