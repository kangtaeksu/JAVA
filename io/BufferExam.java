package kosta.io;

import java.io.*;

public class BufferExam {

	public static void main(String[] args) {
		// Scanner �ܿ� ����� ��Ʈ���� Ȱ���� ����
//		System.in : InputStream => byte Stream ���⼭ ���Ȯ��
//					=> InputStreamReader ���پ��а��ϰپ�
//					=> BufferedReader

//		InputStream in = System.in;//Ű�������� �Է¹޴°� �ý���.in
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
//		===> ���ŷο� 

		BufferedReader br = null;
		BufferedWriter bw = null;
		String str = "";
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			bw = new BufferedWriter(new FileWriter("ouput.txt"));
			System.out.println("input");
			while((str = br.readLine())!=null) {
				str+= "\n";
				bw.write(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
try {
	bw.close();
	br.close();
	
} catch (Exception e) {
	//��Ʈ�� ��Ʈ�� ��
}
		}

	}

}
