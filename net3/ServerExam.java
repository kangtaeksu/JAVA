package kosta.net3;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9000);
			
			while(true) {
				socket = serverSocket.accept();
			}
			
			
			System.out.println("server booting");
			socket = serverSocket.accept();

			Thread recieve = new ServerRecieve(socket);
			Thread sender = new ServerSender(socket);

			recieve.start();
			sender.start();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
//				socket.close();
//				serverSocket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
