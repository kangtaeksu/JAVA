package kosta.inner;

public class Main {

	public static void main(String[] args) {
		SNSmessenger sns = new SNSmessenger();
//		sns.send("OK");
	
	
		MessageSender ms = new MessageSender() {
			
			@Override
			void send(String message) {
				// TODO Auto-generated method stub
				System.out.println("Emailsender");
			}
		};
		ms.send("ok");
	}

}
