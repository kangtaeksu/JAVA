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
	//������ �����ź��� ������
	if(title.equals("JAVA")) {
		dc =(int)(price*0.75);
	}else if(title.equals("JSP")) {
		dc =(int)(price*0.8);
	}else if(title.equals("ORACLE")) {
		dc =(int)(price*0.85);
	}
}

public void print() {
	System.out.println( title+"����� ������ "+ price+"�� ���ε� ������ "+ dc+"���Դϴ�. �Ѱ����� ");
}
	
}
