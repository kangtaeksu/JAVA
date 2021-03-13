package kosta.thread;

public class interMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread(new interfaceThread());
		thread.start();
		char arr[] = {'¤¡','¤¤','¤§','¤©','¤±','¤²','¤µ'};
		
	for (char ch:arr) {
		System.out.println(ch);
	}
	}

}
