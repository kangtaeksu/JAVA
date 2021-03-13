package kosta.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerRecieve extends Thread {
	Socket socket;
	
	public ServerRecieve() {}
	
	public ServerRecieve(Socket socket) {
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
		
		System.out.println("server listening "+ str);
	}
	
	
	} catch (Exception e) {
	e.printStackTrace();}
	
	
	
	}

}
