package kosta.thread2;

public class Dona extends Thread {

	private DonaManager m;
	private int money;
	
	@Override
	public void run() {
	
		
		while (money == 100000) {
			
			 m.donation(getMoney());
			money += getMoney();
			System.out.println(money);
		try {
			sleep(100);
		} catch (InterruptedException e) {
			e.getMessage();// TODO: handle exception
		}
		}
	}

	public DonaManager getM() {
		return m;
	}

	public void setM(DonaManager m) {
		this.m = m;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Dona() {
		
	}
	
	public Dona(DonaManager m, int money) {
		super();
		this.m = m;
		this.money = money;
	}

	public int getMoney() {
		int money=0;
		int num = (int)(Math.random()*3);
		
		switch (num) {
		case 0:
			money =10000;
		case 1:
			money =20000;
		case 2:
			money =5000;
			
		
		}
		return money;
	}
}
