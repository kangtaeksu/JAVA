package kosta.network;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExam {

	public static void main(String[] args) {
		Socket socket = null;

		try {

			socket = new Socket("192.168.0.112", 9000);

			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();

			Thread sender = new ClientSender(socket);
			Thread recieve = new ClientRecieve(socket);
			
			sender.start();
			recieve.start();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				socket.close();
			} catch (Exception e2) {
			}
		}
	}

}
