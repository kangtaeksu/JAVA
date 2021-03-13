package kosta.thread;

public class practiceThread implements Runnable{

	static boolean autoSave = false;
	
	public static void main(String[] args) {
		
		Thread t = new Thread(new practiceThread());
		t.setDaemon(true);
		t.start();
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}		
			System.out.println(i);
			if(i==5) autoSave = true;
			}
			System.out.println("end");
		
	}

	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		
		if(autoSave) autoSave();
		}
	}
	
	public void autoSave() {
		System.out.println("save");
	}
}
