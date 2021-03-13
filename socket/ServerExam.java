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
			
			InputStream in = socket.getInputStream();//�̰ɹٲܼ����
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[100];//�̷����ϰ�
			in.read(arr);
			//���ڿ��� ��Ʈ�����ιٲ�
			System.out.println("client message"+ new String(arr));
			
			String message = "Hello Client!";
			out.write(message.getBytes());  //�̶� �ƿ��� Ŭ���̾�Ʈ������
			
			
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
