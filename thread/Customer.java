package kosta.thread;

public class Customer extends Thread {

	
	private String threadName;
	private	Manager m;

	public Customer() {}

	public Customer(String threadName, Manager m) {
		super();
		this.threadName = threadName;
		this.m = m;
	}

	public String getThreadName() {
		return threadName;
	}

	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}

	public Manager getM() {
		return m;
	}

	public void setM(Manager m) {
		this.m = m;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0;i<20;i++) {
			m.pop(threadName);
			try {
				sleep(100);	
			} catch (Exception e) {
			e.printStackTrace();	// TODO: handle exception
			}
		}
	}
	
	
}
