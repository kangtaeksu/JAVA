package kosta.thread;

public class joinThread {
static long startTime =0;
	public static void main(String[] args) {

		threadMake t1 = new threadMake();
		threadMake2 t2 = new threadMake2();
		
		t1.start();
		t2.start();
		startTime = System.currentTimeMillis();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
		}	System.out.println("running time : "+ (System.currentTimeMillis()-joinThread.startTime));
		}
		
	

}


class threadMake extends Thread{
	public void run() {
		for(int i = 0; i<300;i++) {
			System.out.print(new String("-"));
		}
	}
}

class threadMake2 extends Thread{
	public void run() {
		for (int i =0; i< 300;i++) {
			System.out.print(new String("|"));
		}
	}
}