package kosta.thread;
//제빵사1 제빵사2 제빵사3
// =====================진열장을 list로
//소비자1 소비자 2 소비자 3
//wait() <==> notify()
import kosta.oop2.Account;

public class syncronized {

	public static void main(String[] args) {

		Area area = new Area();
		area.account1 = new Account("111", "java", 2000)
				area.account2 = new Account("222", "python", 3300)
	
	threadMan t1 = new threadMan(area);
		threadman2 t2 = new threadman2(area);
		t1.start();
		t2.start();
	}

}

class threadMan extends Thread{
	
	Area area;
	threadMan(Area area){
		area = a;
	}
	public void run() {
		for ( int cnt = 0; cnt<12;cnt++) {
			area.transfer(100)
		}
	}
}

class Area{
	Account account1;
	Account account2;
	void transfer(int amount) {
		syncronized(this){
			account1.withdraw(100);
			System.out.println("withdra ");
			account2.deposit(100000000);
			System.out.println("deposit");
			
		}
	}
int getTotal() {
	syncronized(this){
		return account1.balance + account2.getBalance();
	}
}
}


class threadman2 extends Thread{
	Area area;
	threadman2(Area area){
		area = a;
	}

public void run() {
	for ( int cnt =0; cnt<3; cnt++) {
		int sum = area.getTotal();
		System.out.println(sum);
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}
}
