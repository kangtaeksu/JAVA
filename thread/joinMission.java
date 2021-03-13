package kosta.thread;
//1-100까지의 합을 구해서 출력하는 내용을 스레드로 구현하라

public class joinMission {

	public static void main(String[] args) {
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);

		Thread tr1 = new Thread(at1);
		Thread tr2 = new Thread(at2);
		tr1.start();
		tr2.start();

		try {
			tr1.join();
			tr2.join(); //1 2기다리고 메인이 실행되게해줌
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("1~100까지 합: " + (at1.getNum() + at2.getNum()));
	}
}

class Sum {
	int num;

	public Sum() {
		num = 0;
	}

	public void addNum(int n) {
		num += n;
	}

	public int getNum() {
		return num;
	}
}

class AdderThread extends Sum implements Runnable {
	int start, end;

	public AdderThread(int s, int e) {
		start = s;
		end = e;
	}

	public void run() {
		for (int i = start; i <= end; i++) {
			addNum(i);
			try {
				Thread.sleep(10); // 이 부분
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(10); // 이 부분
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
//		thread50 t1 = new thread50();
//		thread100 t2 = new thread100();
//		
//		t1.start();
//		t2.start();
//		
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {		}
//	System.out.println("sum : "+ t1);
//	}
//
//}
//
//class thread50 extends Thread{
//	
//	public void run() {
//		 int sum1=0;
//		for(int i=0;i<=50;i++) {
//			sum1+=i;
//		}
//		System.out.println(sum1);
//	
//	}
//}
//class thread100 extends Thread{
//	
//	public void run() {
//		int sum2 =0;
//		for(int i=51;i<=100;i++) {
//			sum2+=i;
//		}
//		System.out.println(sum2);
//		
//	}
//}