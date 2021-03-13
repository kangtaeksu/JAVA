package kosta.oop;

public class Board {
//게시판에 여러개의 글을 입력받고 전체를 출력하는 프로그램을 작성하시오
//입 :글번호, 글제목, 작성자, 내용
// 출력 : 글쓰기, 전체 글 출력  생성자 기반
	
	int num;
	String title;
	String who;
	String x;
	
	public Board() {}
	
	public Board(int num, String title, String who, String x) {
		super();
		this.num = num;
		this.title = title;
		this.who = who;
		this.x = x;
	}
	
	public void print() {
	
		System.out.println(num+" \t "+title+ " \t "+who + "\t"+x);
	}
	
}
