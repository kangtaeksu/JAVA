package kosta.thread;

public class bakeryMain {

	public static void main(String[] args) {

		Manager m = new Manager();
		
		Baker b1 = new Baker("���ü�", m);
		Baker b2 = new Baker("���ü�", m);
		Baker b3 = new Baker("���ü�", m);

	
		Customer c1 = new Customer("�ڹٸ�", m);
		Customer c2 = new Customer("�ڹٸ�", m);
		Customer c3 = new Customer("�ڹٸ�", m);
				
				
		b1.start();
		b2.start();
		b3.start();
		
		
		
		c1.start();
		c2.start();
		c3.start();
	}

}
