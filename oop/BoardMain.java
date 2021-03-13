package kosta.oop;

public class BoardMain {

	public static void main(String[] args) {

	Board arr[] = {
			new Board(1, "안녕", "강택수", "그러네"),
			new Board(2, "코스타", "강택순", "반복문")
	};
		
		System.out.println("글번호\t글제목\t작성자이름\t글내용");
		//Board bd1 = new Board(1, "안녕", "강택수", "그러네");
		//Board bd2 = new Board(2, "코코", "강택순", "반복문");

		// =>이걸 배열에 넣는다면?
		for(int i=0;i<arr.length;i++) {
			arr[i].print();
		}

	}

}
