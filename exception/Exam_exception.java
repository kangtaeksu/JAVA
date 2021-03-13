package kosta.exception;

public class Exam_exception {

	public static void add() throws Exception {

		// throw Exception 예외회피하는 것 메인에서 알아서해
		int a = 10;
		int b = 0;

		a = a / b;
	}

	public static void multi() throws Exception {// 삐뚤어지겟다

		int a = 10;
		int b = 10;
		if (a == b) {
			// 만약이상황이 싫다면? 자바문법상 문제는없지만
			// 임의적인 예외상황 발생시킴
			throw new Exception("같을수없어");
		}
	}

	public static void main(String[] args) {

		System.out.println("1");
		try {
			//add();
			multi();
			System.out.println("2");// 예외발생하면 패스
		} catch (Exception e) {// 예외발생시에만 발동
			System.out.println("3");
			System.out.println(e.getMessage());
//		e.printStackTrace();//에러 추적
		} finally {// 무조건 해야할일 나중에 close와함께 활용
			System.out.println("4");

		}
		System.out.println("5");
	}
////////////////////////
}
