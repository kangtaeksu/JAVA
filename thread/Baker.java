package kosta.thread;

public class Baker extends Thread {

	private String threadName;
	private Manager m;

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

	public Baker(String threadName, Manager m) {
		super();
		this.threadName = threadName;
		this.m = m;
	}

	public Baker() {
	}

	@Override
	public void run() {
		for(int i = 0;i<20;i++) {
			m.push(threadName, getBread());
			try {
				sleep(50);	
			} catch (Exception e) {
			e.printStackTrace();	// TODO: handle exception
			}
		}
	}

	///////·£´ý»§»ý¼º
	public String getBread() {
		String bread = "";
		int num = (int)(Math.random()*3);
		
		switch (num) {
		case 0:
			bread = "cake";
		case 1:
			bread = "pizza";
		case 2:
			bread = "choco";
			
			break;
}
	
return bread;	
}}
