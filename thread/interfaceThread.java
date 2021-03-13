package kosta.thread;

public class interfaceThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char ch='a'; ch<='z'; ch++) {
			System.out.println(ch);
		}
	}

}
