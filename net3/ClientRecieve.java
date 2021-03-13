package kosta.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientRecieve extends Thread {

	Socket socket;
	
	public ClientRecieve() {}
	
	public ClientRecieve(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			
			BufferedReader br =
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		while(true) {
			String str = br.readLine();
			if(str == null)break;
			
			System.out.println("client listening "+ str);
		}
		
		
		} catch (Exception e) {
		e.printStackTrace();}
		}

}
