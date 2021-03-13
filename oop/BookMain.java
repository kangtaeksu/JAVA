package kosta.oop;

public class BookMain {

	public static void main(String[] args) {
		
		int total=0;
		Book bk[] = { new Book("JAVA", 30000), new Book("JSP", 25000), new Book("ORACLE", 15000) };
		
		for (int i = 0; i < bk.length; i++) {
			bk[i].calculate();
			bk[i].print();
			total +=bk[i].dc; 
		}
		System.out.println("ÃÑ¾×Àº"+ total);
	}
}
