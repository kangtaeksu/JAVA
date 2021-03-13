package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class StringExam {

	public static void main(String[] args) {

		String str = "abc";
		String str2 = new String("abc");
		String sql = "select * from board where num";

		String str3 = str.concat(str2);
		System.out.println(str3);// 문자열의 불변성.
		// ㅎ반환값으로써 구할수있음 자기자신 자체는 절대안바뀜

		StringBuffer sb = new StringBuffer("가나다");
		sb.append("라마바");
		System.out.println(sb);

		// 해당 문자열의 위치를 파앙ㄱ indexof("문자열") 시작(0) 없으면(-1)
		System.out.println(sql.indexOf("$"));
		System.out.println(sql.length());
		// 제일 중요한거 : 문자열 부분추출 ->substring(5) 6번째부터싹다
		// substring(5,10) 범위지정 인덱스로는 4부터9
// board 인덱스위치 14 18인데 문자열 추출범위는 14 19	
		// 즉 (a,b)=>a 부터 b한칸전까지라고 생각하면ㄴ됨.

		System.out.println(sql.substring(3, 5));
		System.out.println(sql.indexOf("b"));
		System.out.println(sql.indexOf("d"));
		System.out.println(sql.substring(14, 19));

		System.out.println(sql.substring(sql.indexOf("board"), sql.indexOf("board") + 5));

		String fileName = "kosta.jpg";
		String head = "";
		String pattern = "";

		head = fileName.substring(0, fileName.indexOf("."));
		pattern = fileName.substring(fileName.indexOf(".") + 1, fileName.length());
		System.out.println(head + " : " + pattern);

		String id = "kosta";
		String m_id = "kosta ";// 공백문자

		if (id.equalsIgnoreCase(m_id.trim())) {// trim 앞뒤공백문자제거
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
//equalsIgnoreCase 대소문자 노구분
		// 문자열 => 배열변환
		String fruits = "사과 배 포도 수박";
		String arr[] = fruits.split(" ");
		// split을 통한 짜르기
		System.out.println(Arrays.toString(arr));

		// startWith(), endsWith() : 해당 문자열 시작/종료 하는 체크
		// 이미지 파일(jpg [png gif)유무를 체크하겟다.
		// 이러식의 확장자 찾는용

		if (fileName.endsWith("jpg") || fileName.endsWith("png") || fileName.endsWith("gif"))
			System.out.println("이미지파일");

		String path = "C:\\Users\\KOSTA\\Downloads\\중간테스트.jpg";
		// String result = "";//kosta_small.jpg
		String fileName2 = path.substring(0, path.indexOf("."));
		String pattern2 = path.substring(path.indexOf(".") + 1, path.length());

		System.out.println(pattern2);
		String result = fileName2 + "_small" + pattern2;
		System.out.println(result);

		int n =10;
		String a= n+"";
		System.out.println(n+a);
		
//		GregorianCalendar ac = new GregorianCalendar();
		Calendar gc = new Calendar.getInstance();
		
		String now = gc.get(Calendar.YEAR)+ "년"
					+(gc.get(Calendar.MONTH)+1)+"월"
					+(gc.get(Calendar.DATE))+"일"
					+(gc.get(Calendar.HOUR))+"시"
					+(gc.get(Calendar.MINUTE))+"분";
		System.out.println("100일후 "+ now);
		
		gc.set(2020,11,25);
		gc.add(Calendar.DATE,100);
		
		SimpleDateFormat dataFormat =
				new SimpleDateFormat("yyyy-MM-dd hh:mm");
		String str1 = dataFormat.format(gc.getTime());
		System.out.println(str1);
					
					
			
		//datoftear을 활용한 매년 생일출력하기
		char[] week = {'일', '월','화', '수','목','금', '토'};
		
		for(int i = 2021;i<=2030;i++) {
			gc.set(i, i, 2);
			char c = week[gc.get(Calendar.DAY_OF_WEEK)-1];
			System.out.println(i+ "year"+ c+"day");
		}
			
		
					
	}
}
