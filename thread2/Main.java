package kosta.thread2;

public class Main {

	public static void main(String[] args) {
		//기부자 스레드.
		//여러명의 기부자가 각각 기부를 최종 모금액이 도달할때까지 기부하도록 한다.
		//총기부금액을 출력시 : 100000(정확히)
		
		DonaManager m = new DonaManager();
		Dona d = new Dona();
		
		Dona d1 = new Dona(m,d.getMoney());
		Dona d2 = new Dona(m,d.getMoney());
		Dona d3 = new Dona(m,d.getMoney());
	
	
		d1.start();
		d2.start();
		d3.start();
	}

}
