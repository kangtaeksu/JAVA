package kosta.socket;

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

			String message = "Hello Server";
			out.write(message.getBytes());

			byte arr[] = new byte[100];
			in.read(arr);

			System.out.println("server from message" + new String(arr));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (Exception e2) {
			}
		}
	}

}
