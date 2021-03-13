package kosta.net3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParClientThread extends Thread {

	Socket socket = null;
	PrintWriter writer = null;
	static List<PrintWriter>list=//Thread 로인한 z크리티컬섹션 관리떄문에 선언
			Collections.synchronizedList(new ArrayList<PrintWriter>());
			
	public ParClientThread() {}

	public ParClientThread(Socket socket) {
		super();
		this.socket = socket;
	try {
		writer = new PrintWriter(socket.getOutputStream());
		list.add(writer);
	} catch (Exception e) {
	e.printStackTrace();}
		
	}
	
	
	public void sendAll(String msg) {
		for(PrintWriter writer: list) {
			writer.write(msg);
			writer.flush();
		}
	}

	@Override
	public void run() {
		String name = "";
		try {
			BufferedReader br=
			new BufferedReader(new InputStreamReader(socket.getInputStream()));
			name = br.readLine();
			sendAll("##"+ name+" player come## ");
			while(true) {
				Strong msg =br.readLine();
				if(msg ==null)break;
			msg = name+ " : " +msg;
					sendAll(msg);			
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			sendAll("##"+ name + " player out##");
			list.remove(writer);
			try {
				socket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
