package kosta.io;

import java.io.*;

public class BufferExam {

	public static void main(String[] args) {
		// Scanner 외에 입출력 스트림을 활용한 구현
//		System.in : InputStream => byte Stream 여기서 기능확장
//					=> InputStreamReader 한줄씩읽게하겟어
//					=> BufferedReader

//		InputStream in = System.in;//키보드한테 입력받는게 시스템.in
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br = new BufferedReader(isr);
//		===> 번거로움 

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
	//컨트롤 제트가 끝
}
		}

	}

}
