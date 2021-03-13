package kosta.oop;

public class Book {

String title;
int price;
int dc;


public Book() {}


public Book(String title, int price) {
	super();
	this.title = title;
	this.price = price;
}

public void calculate() {
	//범위가 좁은거부터 넓은거
	if(title.equals("JAVA")) {
		dc =(int)(price*0.75);
	}else if(title.equals("JSP")) {
		dc =(int)(price*0.8);
	}else if(title.equals("ORACLE")) {
		dc =(int)(price*0.85);
	}
}

public void print() {
	System.out.println( title+"교재는 정가는 "+ price+"원 할인된 가격은 "+ dc+"원입니다. 총가격은 ");
}
	
}
