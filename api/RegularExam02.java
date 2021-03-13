package kosta.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		String data[] = {
//				"bat", "bba", "bbg", "bonus",
//				"CA", "ca", "c232", "car",
//				"date", "dic", "diraaa"
//		};
//		//ca car만뽑고싶을때
//		
//		Pattern p = Pattern.compile("c[a-z]*");
//		
//		for (int i=0;i<data.length;i++) {
//		Matcher m =	p.matcher(data[i]);
//		if(m.matches()) {
//			System.out.println(data[i]);
//		}
//		
//		}// 패턴를 통해 생성조건 만들고 매치를 통해 비교 탐색
//		
//		String source = "ab?cde?fgh";
//		String reg = "(\\w)*";
//		
//		Pattern p =Pattern.compile(reg);
//		Matcher m = p.matcher(source);
//		
//		while(m.find()) {
//			
//			System.out.println(m.group());
//		}
		String source = "HP : 010-1111-1111, HOME: 02-222-2222";
		String reg = "(\\d{1,2}-\\d{3,4}-\\d{4})";
		//하나의 문자열안에서 매칭되는 거 뽑아내기
		Pattern p =Pattern.compile(reg);
		Matcher m = p.matcher(source);
		
		while(m.find()) {
			
			System.out.println(m.group());
		}
		//010-1111-1111
		//02-222-2222
	}

}
