package kosta.thread;

public class bakeryMain {

	public static void main(String[] args) {

		Manager m = new Manager();
		
		Baker b1 = new Baker("강택수", m);
		Baker b2 = new Baker("강택수", m);
		Baker b3 = new Baker("강택수", m);

	
		Customer c1 = new Customer("자바맨", m);
		Customer c2 = new Customer("자바맨", m);
		Customer c3 = new Customer("자바맨", m);
				
				
		b1.start();
		b2.start();
		b3.start();
		
		
		
		c1.start();
		c2.start();
		c3.start();
	}

}
