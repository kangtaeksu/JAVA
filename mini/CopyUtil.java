package kosta.mini;

import java.io.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

public class CopyUtil {
//���� ��� ���� copy���� ( ���ο� ���丮 ���� �� �׾ȿ� ��� ������ ����) 
	

	public static void copyDirectory(File source, File dest) throws Exception {
		dest.mkdir();
		File[] fileList = source.listFiles();
		
		
		for(int i = 0; i<fileList.length;i++) {
			File sourceFile = fileList[i];
		
		if(sourceFile.isDirectory()) {
			File s_dest = new File(dest, sourceFile.getName());
			copyDirectory(sourceFile, s_dest);/////////////
			/////���Ⱑ �ٽ�
		}else {
			File destFile = new File(dest, sourceFile.getName());
			copyFile(sourceFile, destFile);
		}}		}
				

///////////////////////�����ð� /////�ؿ� ���Ϻ��� 	
	public static void copyFile(File source, File dest) throws Exception {

		FileInputStream in = null;
		FileOutputStream out = null;
		byte[] arr = new byte[500];
		int count = 0;

		try {
			in = new FileInputStream(source);
			out = new FileOutputStream(dest);

			while ((count = in.read(arr)) != -1) {
				out.write(arr);
				Arrays.fill(arr, (byte) 0);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {

					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (Exception e2) {

			}
		}
	}
}
