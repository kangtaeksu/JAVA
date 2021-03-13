package kosta.socket;

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
			System.out.println("server booting");
			socket = serverSocket.accept();
			
			InputStream in = socket.getInputStream();//이걸바꿀수없어서
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[100];//이렇게하고
			in.read(arr);
			//문자열을 스트링으로바꿈
			System.out.println("client message"+ new String(arr));
			
			String message = "Hello Client!";
			out.write(message.getBytes());  //이때 아웃은 클라이언트랑연결
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
				serverSocket.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
